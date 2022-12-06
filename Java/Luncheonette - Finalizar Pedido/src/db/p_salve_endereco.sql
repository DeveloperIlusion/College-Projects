delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_salve_endereco $$

#cria procedure
create procedure p_salve_endereco(
    in p_endereco_id int, 
    in p_logradouro varchar(100), 
    in p_bairro varchar(30), 
    in p_numero int, 
    in p_complemento varchar(50), 
    in p_referencia varchar(200), 
    in p_cliente_id int
)
proc: begin

    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    #valida campos obrigatórios
    if p_logradouro = '' then
        select 'erro' as type, 'logradouro é obrigatório' as msg;
        leave proc;
    end if;

    if p_bairro = '' then
        select 'erro' as type, 'bairro é obrigatório' as msg;
        leave proc;
    end if;

    if p_numero = '' then
        set p_numero = null;
    end if;

    if p_complemento = '' then
        set p_complemento = null;
    end if;

    if p_referencia = '' then
        set p_referencia = null;
    end if;

    if p_cliente_id = '' then
        select 'erro' as type, 'cliente_id é obrigatório' as msg;
        leave proc;
    end if;

    start transaction;

    # caso esteja em modo de inserção
    if p_endereco_id = -1 then

        # insere registro
        insert into endereco (logradouro, bairro, numero, complemento, referencia, cliente_id)
        values(p_logradouro, p_bairro, p_numero, p_complemento, p_referencia, p_cliente_id);

        select last_insert_id() into p_endereco_id;

    else

        set sql_safe_updates = 0;

        update endereco
        set logradouro = p_logradouro, bairro = p_bairro, numero = p_numero, complemento = p_complemento, referencia = p_referencia, cliente_id = p_cliente_id
        where endereco_id = p_endereco_id;

    end if;

    if exc = 1 then
        rollback;
        select "erro" as type, "Não foi possível registrar endereco." as msg;
    else
        select p_endereco_id as id, "sucesso" as type, "endereco registrado" as msg;
        commit;
    end if;

end $$