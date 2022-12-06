delimiter $$

# apaga view caso ela já exista
drop view if exists v_item_pedido $$

# cria view
create view v_item_pedido
as
    select ip.item_pedido_id, ip.lanche_id, la.nome as lanche, ip.quantidade,
        la.preco_venda as valor_unitario, ip.valor_item, ip.pedido_id
    from item_pedido ip
    inner join lanche la on la.lanche_id = ip.lanche_id;
$$