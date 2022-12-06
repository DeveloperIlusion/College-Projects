delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_relatorio_lanche_periodo $$

# cria procedure
create procedure p_relatorio_lanche_periodo(
    in p_data_inicial date,
    in p_data_final date
)
proc: begin

    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    select l.nome as lanche, sum(ip.quantidade) as vendidos, l.preco_venda, (sum(ip.quantidade) * l.preco_venda) as faturamento
    from lanche l
    left join item_pedido ip on l.lanche_id = ip.lanche_id
    left join pedido p on p.pedido_id = ip.pedido_id
    where p.data between p_data_inicial and p_data_final
    group by l.lanche_id
    order by (sum(ip.quantidade) * l.preco_venda) desc;

end $$