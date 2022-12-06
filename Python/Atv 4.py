"""
Bruno Deluca Satil Cassiano - 2° Período
Finalidade: Atividade Avaliativa

4) (2,0 pontos). Construa um algoritmo em Python que receba um valor e efetue sua
decomposição conforme exemplos abaixo:
"""

valor = input("Insira o valor para ser decomposto: ");

def decomposicao(valor):

    l = len(str(valor))

    return ' + '.join([i.ljust(l - b, '0') for b, i in enumerate(str(valor))])

print(decomposicao(valor))