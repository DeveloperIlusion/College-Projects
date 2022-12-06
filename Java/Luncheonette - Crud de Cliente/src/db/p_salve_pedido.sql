delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_salve_pedido $$

#cria procedure
create procedure p_salve_pedido(
    in p_pedido_id int, 
    in p_cliente_id int, 
    in p_valor_total decimal(10,2), 
    in p_data date, 
    in p_status enum('A','C','F'), 
    in p_data_hora_entrega timestamp
)
proc: begin

    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    #valida campos obrigatórios
    if p_cliente_id = '' then
        select 'erro' as type, 'cliente_id é obrigatório' as msg;
        leave proc;
    end if;

    if p_valor_total = '' then
        select 'erro' as type, 'valor_total é obrigatório' as msg;
        leave proc;
    end if;

    if p_data = '' then
        select 'erro' as type, 'data é obrigatório' as msg;
        leave proc;
    end if;

    if p_status = '' then
        select 'erro' as type, 'status é obrigatório' as msg;
        leave proc;
    end if;

    if p_data_hora_entrega = '' then
        set p_data_hora_entrega = null;
    end if;

    start transaction;

    # caso esteja em modo de inserção
    if p_pedido_id = -1 then

        # insere registro
        insert into pedido (cliente_id, valor_total, data, status, data_hora_entrega)
        values(p_cliente_id, p_valor_total, p_data, p_status, p_data_hora_entrega);

        select last_insert_id() into p_pedido_id;

    else

        set sql_safe_updates = 0;

        update pedido
        set cliente_id = p_cliente_id, valor_total = p_valor_total, data = p_data, status = p_status, data_hora_entrega = p_data_hora_entrega
        where pedido_id = p_pedido_id;

    end if;

    if exc = 1 then
        rollback;
        select 'erro' as type, 'Não foi possível registrar pedido.' as msg;
    else
        select p_pedido_id as id, 'sucesso' as type, 'pedido registrado' as msg;
        commit;
    end if;

end $$