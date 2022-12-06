delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_delete_item_pedido $$

# cria procedure
create procedure p_delete_item_pedido(
    in p_item_pedido_id int
)
proc: begin

    declare x_valor_item decimal(10,2) default 0;
    declare x_pedido_id int default 0;
    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    start transaction;

    select pedido_id, valor_item from item_pedido where item_pedido_id = p_item_pedido_id
    into x_pedido_id, x_valor_item;

    # atualiza o valor do pedido
    update pedido set valor_total = valor_total - x_valor_item where pedido_id = x_pedido_id;

    # remove o registro
    delete from item_pedido where item_pedido_id = p_item_pedido_id;

    if exc = 1 then
        rollback;
        select 'erro' as type, 'Não foi possível remover item.' as msg;
    else
        select p_item_pedido_id as id, 'sucesso' as type, 'item removido.' as msg;
        commit;
    end if;

end $$