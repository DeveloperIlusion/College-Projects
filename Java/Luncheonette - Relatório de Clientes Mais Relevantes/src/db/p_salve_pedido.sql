delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_salve_pedido $$

#cria procedure
create procedure p_salve_pedido(
    in p_pedido_id int,
    in p_cliente_id int,
    in p_lanche_id int,
    in p_quantidade int
)
proc: begin

    declare x_item_pedido_id int default 0;
    declare x_preco_venda decimal(10, 2) default 0;
    declare x_quantidade int default 0;
    declare x_quantidade_nova int default 0;
    declare done int default false;
    declare exc smallint default 0;

    if p_cliente_id = -1 then
        select p_pedido_id as id, 'erro' as type, 'Cliente é obrigatório.' as msg;
        leave proc;
    end if;

    if p_lanche_id = -1 then
        select p_pedido_id as id, 'erro' as type, 'Lanche é obrigatório.' as msg;
        leave proc;
    end if;

    if p_quantidade < 1 then
        select p_pedido_id as id, 'erro' as type, 'Quantidade é obrigatório.' as msg;
        leave proc;
    end if;

        start transaction;

        if p_pedido_id = -1 then

                insert into pedido (cliente_id, valor_total, data, status)
        values (p_cliente_id, 0, curdate(), 'A');

        select last_insert_id() into p_pedido_id;

        else

        set sql_safe_updates = 0;

    end if;

        select preco_venda from lanche where lanche_id = p_lanche_id into x_preco_venda;

        select item_pedido_id, quantidade from item_pedido where lanche_id = p_lanche_id and pedido_id = p_pedido_id into x_item_pedido_id, x_quantidade;

    if x_item_pedido_id = 0 then

        insert into item_pedido (pedido_id, lanche_id, quantidade, valor_item)
        values (p_pedido_id, p_lanche_id, p_quantidade, (p_quantidade * x_preco_venda));

        update pedido set valor_total = valor_total + (p_quantidade * x_preco_venda) where pedido_id = p_pedido_id;

    else

        set x_quantidade_nova = p_quantidade - x_quantidade;

        update item_pedido set quantidade = quantidade + p_quantidade, valor_item = valor_item + (p_quantidade * x_preco_venda) where item_pedido_id = x_item_pedido_id;

        update pedido set valor_total = valor_total + (p_quantidade * x_preco_venda);

    end if;

        if exc = 1 then
        rollback;
        select p_pedido_id as id, 'erro' as type, 'Ocorreu um erro ao registrar o pedido.' as msg;
    else 
        commit;
        select p_pedido_id as id, 'sucesso' as type, 'Pedido registrado.' as msg;
    end if;

end $$