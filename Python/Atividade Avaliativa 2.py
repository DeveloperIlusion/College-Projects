"""
----------------------------------------------------------------------
DATA/HORA DE CRIAÇÃO: 07/06/2021 ás 21:36
AUTOR...............: Bruno Deluca Satil Cassiano - 1° Período ADS
Finalidade..........: Atividade Avaliativa 2
----------------------------------------------------------------------
"""

itens = 0;

count = 1;

valorTotal = 0;

print("Este programa anotará o nome da loja onde você comprou, a quantidade de produtos comprados e o preço deles, caso queira encerrar a anotação é só digitar um número negativo na entrada da quantidade de itens comprados!");
print("-" * 120 );

while itens >= 0:

	itens = int(input("Insira a quantidade de itens que você comprou: "));
	print("-" * 80 );
	
	if itens < 0:
			break;

	else:
		loja = input("Insira o nome da loja onde você comprou: ");
		print("-" * 80 );
		

		while itens >= count:
			valor = float(input(f"Insira o valor do {count}º item comprado: "));
			print("-" * 80 );

			print(f"O {count}º item comprado na {loja} custou R${valor}");
			print("-" * 80 );

			valorTotal += valor;

			count += 1;

		count = 1;

print(f"Após a compra de todos estes produtos, você teve um gasto total de R${valorTotal:>.2f}!");
print("-" * 80 );