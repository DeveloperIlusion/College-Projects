delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_quite_pedido $$

# cria procedure
create procedure p_quite_pedido(
    in p_pedido_id int,
    in p_status enum('A', 'C', 'F')
)
proc: begin

    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    set sql_safe_updates = 0;

    update pedido set status = p_status where pedido_id =  p_pedido_id;

    if exc = 1 then
        rollback;
        select p_pedido_id as id, 'erro' as type, 'Ocorreu um erro ao atualizar o status do pedido.' as msg;
    else 
        commit;
        select p_pedido_id as id, 'sucesso' as type, 'Status do pedido registrado.' as msg;
    end if;

end $$