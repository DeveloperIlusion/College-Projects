"""
Bruno Deluca Satil Cassiano - 2° Período ADS
09/11/2021

(6,0 pontos) em uma eleição presidencial, existem quatro candidatos. Os votos são
informados através de códigos. Os dados utilizados para a escrituração obedecem a
seguinte codificação:
• 1, 2, 3, 4 = voto para os respectivos candidatos
• 5 = voto nulo
• 6 = voto em branco
Elabore um algoritmo que calcule e escreva:
• Total de votos para cada candidato
• Total de votos nulos
• Total de votos em branco
• Percentual dos votos em branco e nulos sobre o total.
Observação:
o Quando o usuário digitar o valor zero (0), seu sistema deve parar de
processar os votos;
o Crie uma lista para armazenar os votos de cada candidato sendo o
candidato 1 armazenado no índice 1 da lista, o candidato 2 no índice 2 e
assim por diante.
"""

lista = [];
total = 0;
candidatoA = 0;
candidatoB = 0;
candidatoC = 0;
candidatoD = 0;
votoNulo = 0;
votoBranco = 0;
percentualNulos = 0;
percentualBrancos = 0;

while True:

	for x in range(7):
		lista.append(0);

	print("Menu de Votação:");
	print()
	print("=" * 16);
	print("1 - Candidato A");
	print("-" * 15);
	print("2 - Candidato B");
	print("-" * 15);
	print("3 - Candidato C");
	print("-" * 15);
	print("4 - Candidato D");
	print("-" * 15);
	print("5 - Voto nulo");
	print("-" * 13);
	print("6 - Voto em branco");
	print("-" * 18);
	print("Caso queira interromper as votações, insira o número 0 (ZERO)!");
	print("-" * 62);
	print()
	voto = int(input("Insira aqui o número correspondente a opção que deseja: "));
	print()
	print("=" * 55);

	if voto == 0:
		break;

	elif voto == 1:
		candidatoA += 1;
		lista.insert(0, candidatoA);
		print();
		print("#" * 27);
		print("Voto computado com sucesso!");
		print("#" * 27);
		print();
		total += 1;

	elif voto == 2:
		candidatoB += 1;
		lista.insert(1, candidatoB);
		print();
		print("#" * 27);
		print("Voto computado com sucesso!");
		print("#" * 27);
		print();
		total += 1;

	elif voto == 3:
		candidatoC += 1;
		lista.insert(2, candidatoC);
		print();
		print("#" * 27);
		print("Voto computado com sucesso!");
		print("#" * 27);
		print();
		total += 1;

	elif voto == 4:
		candidatoD += 1;
		lista.insert(3, candidatoD);
		print();
		print("#" * 27);
		print("Voto computado com sucesso!");
		print("#" * 27);
		print();
		total += 1;

	elif voto == 5:
		votoNulo += 1;
		lista.insert(4, votoNulo);
		print();
		print("#" * 27);
		print("Voto computado com sucesso!");
		print("#" * 27);
		print();
		total += 1;

	elif voto == 6:
		votoBranco += 1;
		lista.insert(5, votoBranco);
		print();
		print("#" * 27);
		print("Voto computado com sucesso!");
		print("#" * 27);
		print();
		total += 1;

	else:
		print();
		print("#" * 27);
		print("Este número não representa nenhuma opção, tente novamente!");
		print("#" * 27);
		print();

percentualNulos = (votoNulo / total) * 100;
percentualBrancos = (votoBranco  / total) * 100;

print("Resultado das votações:");
print(f"O candidato A teve {lista[0]} votos!")
print(f"O candidato B teve {lista[1]} votos!")
print(f"O candidato C teve {lista[2]} votos!")
print(f"O candidato D teve {lista[3]} votos!")
print(f"Houveram {lista[4]} votos nulos, totalizando {percentualNulos:>.2f}% dos votos totais!")
print(f"Houveram {lista[5]} votos brancos, totalizando {percentualBrancos:>.2f}% dos votos totais!")