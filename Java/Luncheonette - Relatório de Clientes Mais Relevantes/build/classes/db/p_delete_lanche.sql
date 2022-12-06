delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_delete_lanche $$

#cria procedure
create procedure p_delete_lanche(
    in p_lanche_id int
)
proc: begin

    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    start transaction;

    #remove o registro
    delete from lanche where lanche_id = p_lanche_id;

    if exc = 1 then
        rollback;
        select 'erro' as type, 'Não foi possível remover lanche.' as msg;
    else
        select p_lanche_id as id, 'sucesso' as type, 'lanche removido' as msg;
        commit;
    end if;

end $$