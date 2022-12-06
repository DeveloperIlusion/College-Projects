delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_delete_cliente $$

# cria procedure
create procedure p_delete_cliente(
    in p_cliente_id int
)
proc: begin

    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    start transaction;

    # remove o registro
    delete from endereco where cliente_id = p_cliente_id;
    delete from cliente where cliente_id = p_cliente_id;

    if exc = 1 then
        rollback;
        select 'erro' as type, 'Não foi possível remover cliente.' as msg;
    else
        select p_cliente_id as id, 'sucesso' as type, 'cliente removido' as msg;
        commit;
    end if;

end $$