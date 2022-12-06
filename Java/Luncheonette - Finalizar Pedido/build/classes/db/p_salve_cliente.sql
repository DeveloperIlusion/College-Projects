delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_salve_cliente $$

# cria procedure
create procedure p_salve_cliente(
    in p_cliente_id int, 
    in p_nome varchar(50), 
    in p_telefone char(11), 
    in p_data_nascimento char(10),
    in p_logradouro varchar(100),
    in p_bairro varchar(30),
    in p_numero int,
    in p_complemento varchar(50),
    in p_referencia varchar(200)
)
proc: begin

    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    # valida campos obrigatórios
    if p_nome = '' then
        select 'erro' as type, 'Nome é obrigatório.' as msg;
        leave proc;
    end if;

    if p_telefone = '' then
        set p_telefone = null;
    end if;

    if p_data_nascimento = '' or p_data_nascimento = '0000-00-00' or p_data_nascimento is null then
        set p_data_nascimento = null;
    end if;

    if p_logradouro = '' then
        select 'erro' as type, 'Logradouro é obrigatório.' as msg;
        leave proc;
    end if;

    if p_bairro = '' then
        select 'erro' as type, 'Bairro é obrigatório.' as msg;
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

    start transaction;

    # caso esteja em modo de inserção
    if p_cliente_id = -1 then

        # insere registro
        insert into cliente (nome, telefone, data_nascimento)
        values(p_nome, p_telefone, p_data_nascimento);

        select last_insert_id() into p_cliente_id;

        # insere endereco
        insert into endereco (logradouro, bairro, numero, complemento, referencia, cliente_id)
        values (p_logradouro, p_bairro, p_numero, p_complemento, p_referencia, p_cliente_id);
    else

        set sql_safe_updates = 0;

        update cliente
        set nome = p_nome, telefone = p_telefone, data_nascimento = p_data_nascimento
        where cliente_id = p_cliente_id;

        update endeereco set logradouro = p_logradouro, bairro = p_bairro, numero = p_numero, 
            complemento = p_complemento, referencia = p_referencia
        where cliente_id = p_cliente_id;
    end if;

    if exc = 1 then
        rollback;
        select 'erro' as type, 'Não foi possível registrar cliente.' as msg;
    else
        select p_cliente_id as id, 'sucesso' as type, 'cliente registrado' as msg;
        commit;
    end if;

end $$