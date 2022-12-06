"""
Bruno Deluca Satil Cassiano - 2° Período
Finalidade: Atividade Avaliativa

2) (3,0 pontos). Escreva um algoritmo em Python que imprima todos os números múltiplos
de 5, no intervalo fechado de 1 a N, onde N deverá ser fornecido pelo usuário no início do
programa.
"""
count = 1;

N = int(input("Insira o valor de N aqui: "));

while count <= N:

	controle = count % 5;

	if controle == 0:
		print(f"{count}");

	count += 1

print(f"Esses foram todos os múltiplos de 5 entre 1 e {N}.");