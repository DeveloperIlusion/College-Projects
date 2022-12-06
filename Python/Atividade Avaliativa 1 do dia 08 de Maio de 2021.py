"""
------------------------------------------------------------------------------
DATA/HORA DE CRIAÇÃO: 08/06/2021 ás 19:00
AUTOR...............: Bruno Deluca Satil Cassiano - 1º Período do curso de ADS
Finalidade..........: Atividade Avaliativa 1 do dia 08 de Maio de 2021
------------------------------------------------------------------------------
"""

inteiro = 0;

count = 1;

menor = 0;


print("Este programa calculará qual o menor número entre os inseridos, entretanto, ele aceita apenas números inteiros");
print("-" * 110 );

while True:

	inteiro = int(input(f"Insira o {count}º número aqui ou insira 0 para visualizar o resultado: "));
	print("-" * 64 );

	if inteiro == 0:
		break;

	elif inteiro < menor or count == 1:
		menor = inteiro;

	count += 1;

print(f"O menor número digitado foi {menor}!");
print("-" * 64 );



