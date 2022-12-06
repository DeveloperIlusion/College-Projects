delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_salve_lanche $$

#cria procedure
create procedure p_salve_lanche(
    in p_lanche_id int, 
    in p_nome varchar(30), 
    in p_preco_venda decimal(10,2), 
    in p_descricao varchar(500)
)
proc: begin

    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    #valida campos obrigatórios
    if p_nome = '' then
        select 'erro' as type, 'nome é obrigatório' as msg;
        leave proc;
    end if;

    if p_preco_venda = '' then
        select 'erro' as type, 'preco_venda é obrigatório' as msg;
        leave proc;
    end if;

    if p_descricao = '' then
        set p_descricao = null;
    end if;

    start transaction;

    # caso esteja em modo de inserção
    if p_lanche_id = -1 then

        # insere registro
        insert into lanche (nome, preco_venda, descricao)
        values(p_nome, p_preco_venda, p_descricao);

        select last_insert_id() into p_lanche_id;

    else

        set sql_safe_updates = 0;

        update lanche
        set nome = p_nome, preco_venda = p_preco_venda, descricao = p_descricao
        where lanche_id = p_lanche_id;

    end if;

    if exc = 1 then
        rollback;
        select 'erro' as type, 'Não foi possível registrar lanche.' as msg;
    else
        select p_lanche_id as id, 'sucesso' as type, 'lanche registrado' as msg;
        commit;
    end if;

end $$