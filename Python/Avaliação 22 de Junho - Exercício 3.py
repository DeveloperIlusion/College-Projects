"""
----------------------------------------------------------------------
DATA/HORA DE CRIAÇÃO: 22/06/2021 ás 20:13
AUTOR...............: Bruno Deluca
Finalidade..........: Atividade Avaliativa 3
----------------------------------------------------------------------
"""

mediaSalarioFamilia = 0;

mediaFilhos = 0;

populacaoFilhos = 0;

TodosSalarios = 0;

familias = 0;

count = 0;

print("Insira o salário e o número de filhos de cada familia que participou da pesquisa e o programa te mostrará as médias de filhos por familia, salário por familia e por habitante. Insira um salário negativo para encerrar o programa.");
print("=" * 118 );

while True:

	print(f"Insira os dados da {count + 1}º familia: ");
	print("-" * 30 );

	salario = float(input("Insira aqui o salário: "));
	print("-" * 22 );

	if salario < 0:
		break;

	else:
		filhos = int(input("Insira aqui a quantidade de filhos: "));
		print("-" * 34 );

		populacaoFilhos += filhos;

		familias += 1;

		count += 1;

	TodosSalarios += salario;

mediaSalarioFamilia = TodosSalarios / familias;

mediaSalarioHabitante = TodosSalarios / ((familias * 2) + populacaoFilhos);

mediaFilhos = populacaoFilhos / familias;

print(f"A média de salário da população por familia é de R${mediaSalarioFamilia:>.2f}");
print("-" * 50 );
print(f"A média de salário da população por habitante é de R${mediaSalarioHabitante:>.2f}");
print("-" * 50 );
print("A média de filhos por familia é", round(mediaFilhos));
print("-" * 50 );