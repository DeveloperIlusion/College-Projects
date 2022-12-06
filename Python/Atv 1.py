"""
Bruno Deluca Satil Cassiano - 2° Período
Finalidade: Atividade Avaliativa

1) (2,0 pontos). Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de
um financiamento pretendido. Caso o financiamento seja menor ou igual a 5 vezes o
salário da pessoa, o algoritmo deverá escrever "Financiamento Concedido"; senão, ele
deverá escrever "Financiamento Negado".
"""

salario = float(input("Insira aqui seu salário: "));

financiamento = float(input("Qual valor do pretendido para o financiamento? "));

if (salario * 5) <= financiamento:
	print("Financiamento Concedido");
else:
	print("Financiamento Negado");