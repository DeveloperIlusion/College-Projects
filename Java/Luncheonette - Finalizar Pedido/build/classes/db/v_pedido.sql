delimiter $$

# apaga view caso ela já exista
drop view if exists v_pedido $$

# cria view
create view v_pedido
as
    select p.pedido_id, c.nome as cliente, p.valor_total, p.status
    from pedido p
    inner join cliente c on c.cliente_id = p.cliente_id;
$$