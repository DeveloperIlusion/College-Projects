"""
Bruno Deluca Satil Cassiano - 2° Período ADS
09/11/2021

(4,0 pontos). Escreva um programa que solicita ao usuário o nome, o sexo e a idade de 10
pessoas a serem armazenada em vetores do tipo (lista). Seu programa deverá determinar e
exibir:
Escreva um programa com o menu de opções:
o Cadastrar
o Listagem
o Pessoa mais nova
▪ Deverá ser exibido o nome da pessoa mais nova, sexo e índice onde está
localizado.
o Idade Média
▪ Deverá ser exibido a média de idade das pessoas
o Diferença de Idades
▪ Exibir a diferença de idade entre a pessoa mais velha e a pessoa mais nova
o A média de idade dos homens.
o Sair
"""

nome = []
idades = []
sexo = []
MaisNovo = 0;
MaisVelho = 0;
media = 0;

while True:

	print("Menu de Opções:");
	print("=" * 15);
	print()
	print("1 - Cadastrar");
	print("-" * 13);
	print("2 - Listagem");
	print("-" * 12);
	print("3 - Pessoa mais nova");
	print("-" * 20);
	print("4 - Idade média");
	print("-" * 15);
	print("5 - Diferença de idades");
	print("-" * 23);
	print("6 - Média de idade dos homens");
	print("-" * 29);
	print("7 - Sair");
	print("-" * 8);

	opcao = int(input("Insira o número que corresponde a opção que deseja: "));
	print("-" * 51);

	if opcao == 1:
		nome.append(input("Insira o nome aqui: "));
		print("-" * 19);
		idades.append(int(input("Insira a idade aqui: ")));
		print("-" * 20);
		sexo.append(input("Insira 'M' (Masculino) se for Homem e 'F' (Feminino) se for Mulher aqui: "));
		print("-" * 72);

	elif opcao == 2:
		print();
		print();
		print("             Lista:")
		print("Nomes        Idades        Sexo");
		for x in range(len(nome)):
			print(f"{nome[x]}", end="         ");
			print(f"{idades[x]:.0f}", end="           ");
			print(f"{sexo[x]}");

		print("");
		print("=" * 30);
		print("");

	elif opcao == 3:
		print();
		print();
		for idade in range(len(idades)):
			if idade == 0:
				MaisNovo = idade;

			else:
				if idades[idade] < idades[MaisNovo]:
					MaisNovo = idade;

				elif idades[idade] > idades[MaisVelho]:
					MaisVelho = idade;

		print(f"A pessoa mais nova é {nome[x]} com {idades[x]} anos e está localizado no índice {x}");
		print("");
		print("=" * 30);
		print("");

	elif opcao == 4:
		total = 0;
		print();
		print();

		for x in idades:
			total += x;

		media = total / len(idades);

		print(f"A média das idades é {media:.2f}");
		print("");
		print("=" * 30);
		print("");

	elif opcao == 7:
		sair = input("Você deseja mesmo sair? Digite S para sim e N para não.");
		if sair.upper() == "S":
			break;
