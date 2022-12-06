delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_delete_pedido $$

#cria procedure
create procedure p_delete_pedido(
    in p_pedido_id int
)
proc: begin

    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    start transaction;

    #remove o registro
    delete from pedido where pedido_id = p_pedido_id;

    if exc = 1 then
        rollback;
        select 'erro' as type, 'Não foi possível remover pedido.' as msg;
    else
        select p_pedido_id as id, 'sucesso' as type, 'pedido removido' as msg;
        commit;
    end if;

end $$