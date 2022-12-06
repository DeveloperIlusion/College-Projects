delimiter $$

# apaga procedure caso ela já exista
drop procedure if exists p_relatorio_cliente_periodo $$

# cria procedure
create procedure p_relatorio_cliente_periodo(
    in p_data_inicial date,
    in p_data_final date
)
proc: begin

    declare exc smallint default 0;
    declare continue handler for sqlexception set exc = 1;

    select c.nome as cliente, sum(p.valor_total) as total from cliente c
    left join pedido p on c.cliente_id = p.cliente_id
    where p.data between p_data_inicial and p_data_final
    group by c.cliente_id
    order by (sum(p.valor_total)) desc;

end $$