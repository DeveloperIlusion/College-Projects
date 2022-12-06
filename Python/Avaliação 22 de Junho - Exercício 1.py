"""
----------------------------------------------------------------------
DATA/HORA DE CRIAÇÃO: 22/06/2021 ás 18:30
AUTOR...............: Bruno Deluca
Finalidade..........: Atividade Avaliativa 1
----------------------------------------------------------------------
"""

count = 0;

media = 0;

par = 0;

percentualPar = 0;

impar = 0;

percentualImpar = 0;

print("Insira quantos valores quiser, o programa calculará a quantidade de valores inseridos, a média deles, a quantidade e porcentagem de valores pares e impares. Digite 0 para encerrar o programa.");

while True:

	valor = int(input(f"Insira o {count + 1}° valor: "));

	if valor > 0 or valor < 0:

		if valor % 2 == 0:
			par += 1;

		else:
			impar += 1;

		valor += valor;

		count += 1;

		media = valor / count;

		percentualPar = (par * 100) / count;

		percentualImpar = (impar * 100) / count;

	else:
		break;

print(f"A média dos valores adicionados é de {media}. Foram digitados {count} números, dentre eles {percentualPar}% são pares e {percentualImpar}% são impares. Ou seja, {par} são pares e {impar} são impares.")

