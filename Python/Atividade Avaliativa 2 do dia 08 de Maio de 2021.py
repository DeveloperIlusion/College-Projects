"""
------------------------------------------------------------------------------
DATA/HORA DE CRIAÇÃO: 08/06/2021 ás 19:00
AUTOR...............: Bruno Deluca Satil Cassiano - 1º Período do curso de ADS
Finalidade..........: Atividade Avaliativa 2 do dia 08 de Maio de 2021
------------------------------------------------------------------------------
"""
totalPassageirosOnibus1 = 0;
totalPassageirosOnibus2 = 0;
totalPassageirosOnibus3 = 0;
totalPassageirosOnibus4 = 0;
totalPassageirosOnibus5 = 0;
totalPassageirosOnibus6 = 0;

totalFaturadoOnibus1 = 0;
totalFaturadoOnibus2 = 0;
totalFaturadoOnibus3 = 0;
totalFaturadoOnibus4 = 0;
totalFaturadoOnibus5 = 0;
totalFaturadoOnibus6 = 0;

#Como o preço da passagem não foi definida, usarei o mesmo preço de nossa cidade, ou seja, R$2,90

print("Lembre-se de conferir a quantidade de passageiros e o número do seu ônibus para evitar problemas!");
print("-" * 97 );

while True:

	onibus = int(input("Digite o número do ônibus em que você trabalha aqui: "));
	print("-" * 52 );


	while onibus not in (1,2,3,4,5,6):
		print("Nossa empresa tem apenas 6 ônibus, eles são numerados de 1 a 6, verifique novamente o número daquele em que você trabalha!");
		print("-" * 122 );
		onibus = int(input("Digite o número do ônibus em que você trabalha aqui: "));
		print("-" * 52 );

		if onibus in (1,2,3,4,5,6):
			break;

	if onibus == 1 and totalFaturadoOnibus1 == 0:
		idosos = int(input("Quantos passageiros idosos foram transportados hoje? "));
		print("-" * 52 );

		estudantes = int(input("Quantos estudantes foram transportados hoje? "));
		print("-" * 44 );

		passageiros = int(input("Quantos passageiros que não se encaixam nas características anteriores foram transportados hoje? "));
		print("-" * 96 );

		totalPassageirosOnibus1 = idosos + estudantes + passageiros;

		totalFaturadoOnibus1 = (estudantes * 2.90)/2 + (passageiros * 2.90);

		print(f"O ônibus de número 1 transportou {totalPassageirosOnibus1} passageiros no total e faturou R${totalFaturadoOnibus1:>.2f} hoje!");
		print("-" * 90 );

	elif onibus == 2 and totalFaturadoOnibus2 == 0:
		idosos = int(input("Quantos passageiros idosos foram transportados hoje? "));
		print("-" * 52 );

		estudantes = int(input("Quantos estudantes foram transportados hoje? "));
		print("-" * 44 );

		passageiros = int(input("Quantos passageiros que não se encaixam nas características anteriores foram transportados hoje? "));
		print("-" * 96 );

		totalPassageirosOnibus2 = idosos + estudantes + passageiros;

		totalFaturadoOnibus2 = (estudantes * 2.90)/2 + (passageiros * 2.90);

		print(f"O ônibus de número 2 transportou {totalPassageirosOnibus2} passageiros no total e faturou R${totalFaturadoOnibus2:>.2f} hoje!");
		print("-" * 90 );

	elif onibus == 3 and totalFaturadoOnibus3 == 0:
		idosos = int(input("Quantos passageiros idosos foram transportados hoje? "));
		print("-" * 52 );

		estudantes = int(input("Quantos estudantes foram transportados hoje? "));
		print("-" * 44 );

		passageiros = int(input("Quantos passageiros que não se encaixam nas características anteriores foram transportados hoje? "));
		print("-" * 96 );

		totalPassageirosOnibus3 = idosos + estudantes + passageiros;

		totalFaturadoOnibus3 = (estudantes * 2.90)/2 + (passageiros * 2.90);

		print(f"O ônibus de número 3 transportou {totalPassageirosOnibus3} passageiros no total e faturou R${totalFaturadoOnibus3:>.2f} hoje!");
		print("-" * 90 );

	elif onibus == 4 and totalFaturadoOnibus4 == 0:
		idosos = int(input("Quantos passageiros idosos foram transportados hoje? "));
		print("-" * 52 );

		estudantes = int(input("Quantos estudantes foram transportados hoje? "));
		print("-" * 44 );

		passageiros = int(input("Quantos passageiros que não se encaixam nas características anteriores foram transportados hoje? "));
		print("-" * 96 );

		totalPassageirosOnibus4 = idosos + estudantes + passageiros;

		totalFaturadoOnibus4 = (estudantes * 2.90)/2 + (passageiros * 2.90);

		print(f"O ônibus de número 4 transportou {totalPassageirosOnibus4} passageiros no total e faturou R${totalFaturadoOnibus4:>.2f} hoje!");
		print("-" * 90 );

	elif onibus == 5 and totalFaturadoOnibus5 == 0:
		idosos = int(input("Quantos passageiros idosos foram transportados hoje? "));
		print("-" * 52 );

		estudantes = int(input("Quantos estudantes foram transportados hoje? "));
		print("-" * 44 );

		passageiros = int(input("Quantos passageiros que não se encaixam nas características anteriores foram transportados hoje? "));
		print("-" * 96 );

		totalPassageirosOnibus5 = idosos + estudantes + passageiros;

		totalFaturadoOnibus5 = (estudantes * 2.90)/2 + (passageiros * 2.90);

		print(f"O ônibus de número 5 transportou {totalPassageirosOnibus5} passageiros no total e faturou R${totalFaturadoOnibus5:>.2f} hoje!");
		print("-" * 90 );

	elif onibus == 6 and totalFaturadoOnibus6 == 0:
		idosos = int(input("Quantos passageiros idosos foram transportados hoje? "));
		print("-" * 52 );

		estudantes = int(input("Quantos estudantes foram transportados hoje? "));
		print("-" * 44 );

		passageiros = int(input("Quantos passageiros que não se encaixam nas características anteriores foram transportados hoje? "));
		print("-" * 96 );

		totalPassageirosOnibus6 = idosos + estudantes + passageiros;

		totalFaturadoOnibus6 = (estudantes * 2.90)/2 + (passageiros * 2.90);

		print(f"O ônibus de número 6 transportou {totalPassageirosOnibus6} passageiros no total e faturou R${totalFaturadoOnibus6:>.2f} hoje!");
		print("-" * 90 );

	else:
		print("O total deste ônibus já foi inserido, talvez você tenha digitado o ônibus errado, tente novamente!");
		continue;

	if totalPassageirosOnibus1 > 0 and totalPassageirosOnibus2 >0 and totalPassageirosOnibus3 >0 and totalPassageirosOnibus4 >0 and totalPassageirosOnibus5 >0 and totalPassageirosOnibus6 >0:
		break;

totalPassageiros = totalPassageirosOnibus1 + totalPassageirosOnibus2 + totalPassageirosOnibus3 + totalPassageirosOnibus4 + totalPassageirosOnibus5 + totalPassageirosOnibus6;

totalFaturado = totalFaturadoOnibus1 + totalFaturadoOnibus2 + totalFaturadoOnibus3 + totalFaturadoOnibus4 + totalFaturadoOnibus5 + totalFaturadoOnibus6;

print(f"Hoje foram transportados {totalPassageiros} passageiros e o total faturado foi de R${totalFaturado:>.2f}!");
print("=" * 68 );