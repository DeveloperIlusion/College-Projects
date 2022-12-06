delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_salve_item_pedido $$

#cria procedure
create procedure p_salve_item_pedido(
    in p_item_pedido_id int, 
    in p_pedido_id int, 
    in p_lanche_id int, 
    in p_quantidade int, 
    in p_valor_item decimal(10,2)
)
proc: begin

    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    #valida campos obrigatórios
    if p_pedido_id = '' then
        select 'erro' as type, 'pedido_id é obrigatório' as msg;
        leave proc;
    end if;

    if p_lanche_id = '' then
        select 'erro' as type, 'lanche_id é obrigatório' as msg;
        leave proc;
    end if;

    if p_quantidade = '' then
        select 'erro' as type, 'quantidade é obrigatório' as msg;
        leave proc;
    end if;

    if p_valor_item = '' then
        select 'erro' as type, 'valor_item é obrigatório' as msg;
        leave proc;
    end if;

    start transaction;

    # caso esteja em modo de inserção
    if p_item_pedido_id = -1 then

        # insere registro
        insert into item_pedido (pedido_id, lanche_id, quantidade, valor_item)
        values(p_pedido_id, p_lanche_id, p_quantidade, p_valor_item);

        select last_insert_id() into p_item_pedido_id;

    else

        set sql_safe_updates = 0;

        update item_pedido
        set pedido_id = p_pedido_id, lanche_id = p_lanche_id, quantidade = p_quantidade, valor_item = p_valor_item
        where item_pedido_id = p_item_pedido_id;

    end if;

    if exc = 1 then
        rollback;
        select 'erro' as type, 'Não foi possível registrar item_pedido.' as msg;
    else
        select p_item_pedido_id as id, 'sucesso' as type, 'item_pedido registrado' as msg;
        commit;
    end if;

end $$