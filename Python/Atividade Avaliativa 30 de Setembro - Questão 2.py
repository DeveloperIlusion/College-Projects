"""
Bruno Deluca Satil Cassiano - 2° Período de ADS

2) (6,0 pontos). Escreva um programa que solicita ao usuário o nome, idade e sexo de 8
pessoas. Armazene estes dados em listas. Crie um menu de opção:
1) Cadastrar pessoas
2) Lista pessoas em ordem de idade decrescente.
3) Lista das mulheres em ordem alfabética
4) Pesquisar pessoas por nome
5) Pessoa mais nova
6) Pessoa mais velha (do sexo masculino
7) Sair.
OBS:
• Deverá criar uma função para cada opção do menu acima.
"""

#Cadastrar pessoas
def cadastro():
	global Nome
	global Idade
	global Sexo
	Nome.append(input("Informe um nome: "));
	print("-" * 16);
	Idade.append(int(input("Informe a idade: ")));
	print("-" * 16);
	while True:
		sexo = input("Informe o sexo, insira M para Masculino e F para Feminino: ");
		print("-" * 58);
		if sexo.upper() in ("M","F"):
			break;
		else:
			print("Opção inválida.")
			print("-" * 15);
			continue;
	Sexo.append(sexo);

#Lista pessoas em ordem de idade decrescente
def ordemIdade():
	global Nome
	global Idade
	global Sexo

	for a in range(1, len(Idade)):
		for b in range(len(Idade) - 1 , 0, -1):
			if Idade[b -1] < Idade[b]:
				aux1 = Idade[b -1];
				aux2 = Nome[b -1];
				aux3 = Sexo[b -1];

				Idade[b -1] = Idade[b];
				Nome[b -1] = Nome[b];
				Sexo[b -1] = Sexo[b];

				Idade[b] = aux1;
				Nome[b] = aux2;
				Sexo[b] = aux3;

	print("Lista com ordenação vertical não alinhada:");
	print(f"Nomes:", Nome);
	print(f"Idades:", Idade);
	print(f"Sexo:", Sexo);

#Lista das mulheres em ordem alfabética
def mulheresOrdem(l):
	print("-" * 40)
	print("Exibindo a lista de valores")
	print("-" * 40)

	for x in range(len(l)):
		print(l[x])

	mensagem()

# Pesquisar pessoas por nome
def PesquisarPessoas(Nome):
	pesquisar = input("Informe o nome que deseja encontrar: ");
	print("-" * 36)
	achou	 = False;

	for x in range(len(Nome)):
		if pesquisar.upper() == Nome[x].upper():
			print(f"{pesquisar} foi encontrado no indice {x} da lista.");
			print("-" * 50)
			achou = True;

	if not achou:
		print(f"O nome {pesquisar} não foi encontrado na lista.\nPressione qualquer tecla para voltar ao menu e tentar novamente.");

# Pessoa mais nova
def PessoaMaisNova(Idade):
	for x in range(len(Idade)):

		if x == 0:
			menorNum = Idade[x];
			indiceMenor = x;

		else:
			if Idade[x] < menorNum:
				menorNum = Idade[x];
				indiceMenor = x;

	print(f"A pessoa mais nova se chama {Nome[indiceMenor]}, é do gênero {Sexo[indiceMenor]} e tem {Idade[indiceMenor]} anos.");			
	print("-" * 105);

# Homem mais velho
def HomemMaisVelho():

	global Nome
	global Idade
	global Sexo

	temHomem = False;

	for x in range(len(Sexo)):
		if Sexo[x].upper() in ("M"):
			temHomem = True;

	for x in range(len(Sexo)):
		if Sexo[x].upper() in ("M"):
			maiorNum = Idade[x];
			HomemVelho = x;

			if Idade[x] > maiorNum:
				maiorNum = Idade[x];
				HomemVelho = x;
			
		elif Sexo[x].upper() in ("F"):
			if temHomem == True:
				continue;

			else:
				print("Não há homens na lista.");
				print("-" * 23);

	if temHomem == True:
		print(f"O homem mais velho se chama {Nome[HomemVelho]} e tem {Idade[HomemVelho]} anos.");			
		print("-" * 90);

# Mensagem de retorno ao menu
def mensagem(texto="Pressione qualquer tecla para voltar ao menu."):
	print(texto);
	print("-" * 45);
	input();

##
def menu():

	global Nome
	global Idade
	global Sexo

	while True:

		print("Menu Principal:");
		print()
		print("1 - Cadastrar pessoas");
		print("2 - Lista pessoas em ordem de idade decrescente");
		print("3 - Lista das mulheres em ordem alfabética");
		print("4 - Pesquisar pessoas por nome");
		print("5 - Pessoa mais nova");
		print("6 - Pessoa mais velha do sexo masculino");
		print("7 - Sair");
		print("-" * 50);
		opc = int(input("Escolha uma opção: "));
		print("-" * 50);

		if opc == 1:
			cadastro();
		elif opc == 2:
			ordemIdade();
		elif opc == 3:
			exibir(listaA);
		elif opc == 4:
			PesquisarPessoas(Nome);
		elif opc == 5:
			PessoaMaisNova(Idade);
		elif opc == 6:
			HomemMaisVelho();
		elif opc == 7:
			resp = input("Deseja realmente sair da aplicação? Digite SIM para sair e NÃO para ficar. ");
			print("-" * 74);
			if resp.upper() == "SIM":
				break
		else:
			mensagem("Opção inválida.")

#Programa Principal

Nome = []
Idade = []
Sexo = []

menu()