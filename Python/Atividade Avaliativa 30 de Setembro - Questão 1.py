"""
Bruno Deluca Satil Cassiano - 2° Período de ADS

(4,0 pontos). Faça um programa que lê dez inteiros, armazena estes números em uma
lista. Depois seu programa deve ordenar estes números utilizando um método de
ordenação. Calcule e exiba a soma e a média, determine e imprima o maior e o menor
inteiro do grupo bem como os indices onde estão localizados. Exiba o resultado (soma e
média) no final do processo juntamente com os números ordenados.
"""

lista = [];

count = 1;

soma = 0;

menorNum = 0;

maiorNum = 0;
	
for x in range(10):
	lista.append(int(input(f"Insira o {count}° valor inteiro: ")));
	print('-' * 26);
	count += 1;

for x in range(len(lista)):
	soma = lista[x] + soma;
	media = soma / 10;

	if x == 0:
		menorNum = lista[x];
		indiceMenor = x;
		maiorNum = lista[x];
		indiceMaior = x;
	else:
		if lista[x] < menorNum:
			menorNum = lista[x];
			indiceMenor = x;

		elif lista[x] > maiorNum:
			maiorNum = lista[x];
			indiceMaior = x;

print(f"O menor número presente nesta lista é {menorNum} e estava originalmente localizado no indice {indiceMenor}");
print('-' * 57);
print(f"O maior número presente nesta lista é {maiorNum} e estava originalmente localizado no indice {indiceMaior}");
print('-' * 57);

for a in range(1, len(lista)):
	for b in range(len(lista) - 1 , 0 , -1):
		if lista[b] < lista[b -1]:
			aux = lista[b];
			lista[b] = lista[b -1];
			lista[b -1]	= aux;

print("Esta é a lista que você criou, apresentada de forma ordenada: ")
print(lista);
print('-' * 62);
print(f"A soma de todos os valores nesta lista resulta em {soma}");
print('-' * 49);
print(f"A média é de {media}");
