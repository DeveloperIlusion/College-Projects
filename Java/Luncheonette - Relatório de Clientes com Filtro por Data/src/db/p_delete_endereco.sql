delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_delete_endereco $$

#cria procedure
create procedure p_delete_endereco(
    in p_endereco_id int
)
proc: begin

    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    start transaction;

    #remove o registro
    delete from endereco where endereco_id = p_endereco_id;

    if exc = 1 then
        rollback;
        select 'erro' as type, 'Não foi possível remover endereco.' as msg;
    else
        select p_endereco_id as id, 'sucesso' as type, 'endereco removido' as msg;
        commit;
    end if;

end $$