delimiter $$

# apaga view caso ela já exista
drop view if exists v_cliente $$

# cria view
create view v_cliente
as
    select c.cliente_id, c.nome, c.telefone, c.data_nascimento,
        e.endereco_id, e.logradouro, e.bairro, e.numero, e.complemento, e.referencia
    from cliente c
    inner join endereco e on c.cliente_id = e.cliente_id
    order by c.nome;
$$