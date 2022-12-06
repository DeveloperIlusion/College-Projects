use lanchonete;

CREATE TABLE lanchonete.cliente (
  cliente_id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  telefone CHAR(11) NULL,
  email VARCHAR(150) NULL,
  PRIMARY KEY (cliente_id));

delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_salve_cliente $$

#cria procedure
create procedure p_salve_cliente(
    in p_cliente_id int, 
    in p_nome varchar(100),
    in p_telefone char(11),
    in p_email varchar(150)
)
proc: begin

    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    #valida campos obrigatórios
    if p_nome = '' then
        select 'erro' as type, 'nome é obrigatório' as msg;
        leave proc;
    end if;

    if p_telefone = '' then
        set p_telefone = null;
    end if;
    
    if p_email = '' then
        set p_email = null;
    end if;

    start transaction;

    # caso esteja em modo de inserção
    if p_cliente_id = -1 then

        # insere registro
        insert into cliente (nome, telefone, email)
        values(p_nome, p_telefone, p_email);

        select last_insert_id() into p_cliente_id;

    else

        set sql_safe_updates = 0;

        update cliente
        set nome = p_nome, telefone = p_telefone, email = p_email
        where cliente_id = p_cliente_id;

    end if;

    if exc = 1 then
        rollback;
        select "erro" as type, "Não foi possível registrar cliente." as msg;
    else
        select p_cliente_id as id, "sucesso" as type, "cliente registrado" as msg;
        commit;
    end if;

end $$

delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_delete_cliente $$

#cria procedure
create procedure p_delete_cliente(
    in p_cliente_id int
)
proc: begin

    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    start transaction;

    #remove o registro
    delete from cliente where cliente_id = p_cliente_id;

    if exc = 1 then
        rollback;
        select "erro" as type, "Não foi possível remover cliente." as msg;
    else
        select p_cliente_id as id, "sucesso" as type, "cliente removido" as msg;
        commit;
    end if;

end $$