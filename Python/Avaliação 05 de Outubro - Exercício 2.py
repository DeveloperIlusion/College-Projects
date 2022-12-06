"""
Bruno Deluca Satil Cassiano
2° Período ADS
05/10/2021

2) (5 pontos). Escreva um algoritmo em Python que: Solicite o nome de 10 times e sua
pontuação no campeonato Brasileiro de futebol 2021 série A, estes dados deverão
ser armazenados em uma única tupla. Para cada time determina e exiba
• Quantidade de vitórias
• Quantidade de empates
• Quantidade de derrotas
Observação: Caso ocorram times com as mesmas quantidades de vitórias, empates ou
derrotas, considerar o primeiro time identificado.
Determine e exiba no final do programa os seguintes dados:
• Posição na tupla, nome e quantidade de vitórias do time com maior número de
vitórias.
• Posição na tupla, nome e quantidade de empates do time com maior número de
Empates.
• Posição na tupla, nome e quantidade de derrotas do time com menor número de
derrotas.
"""

tupla = ( 	input("Nome do 1° time: "),
		  	int(input("Pontuação do 1° time: ")),
			input("Nome do 2° time: "),
		  	int(input("Pontuação do 2° time: ")),
		  	input("Nome do 3° time: "),
		  	int(input("Pontuação do 3° time: ")),
			input("Nome do 4° time: "),
		  	int(input("Pontuação do 4° time: ")),
			input("Nome do 5° time: "),
		  	int(input("Pontuação do 5° time: ")),
			input("Nome do 6° time: "),
		  	int(input("Pontuação do 6° time: ")),
			input("Nome do 7° time: "),
		  	int(input("Pontuação do 7° time: ")),
			input("Nome do 8° time: "),
		  	int(input("Pontuação do 8° time: ")),
			input("Nome do 9° time: "),
		  	int(input("Pontuação do 9° time: ")),
			input("Nome do 10° time: "),
		  	int(input("Pontuação do 10° time: "))
);

print("-" * 50);

rodadas = int(input(f"Quantas rodadas teve no campeonato? "));

print("-" * 50);

time = "";

indTimeVitorias = -1;
numVitorias = 0;
timeMaisVitorias = "";

indTimeEmpates = -1;
numEmpates = 0;
timeMaisEmpates = "";

indTimeDerrotas = -1;
numDerrotas = 0;
timeMenosDerrotas = "";

for x in range(1, len(tupla), 2):
		time = tupla[x -1];
		numTimeVitorias = tupla[x] // 3;
		numTimeEmpates = rodadas - numTimeVitorias;
		numTimeDerrotas = rodadas - (numTimeVitorias + numTimeEmpates);
		print(f"O time {time} teve {numTimeVitorias} vitória(s), {numTimeEmpates} empate(s) e {numTimeDerrotas} derrota(s).");

for x in range(1, len(tupla), 2):
	if x == 1:
		indTimeVitorias = x;
		numVitorias = tupla[x] // 3;
		timeMaisVitorias = tupla[x -1];

		indTimeEmpates = x;
		numEmpates = tupla[x] % numVitorias;
		timeMaisEmpates = tupla[x -1];

		indTimeDerrotas = x;
		numDerrotas = rodadas - (numVitorias + numEmpates);
		timeMenosDerrotas = tupla[x -1];

	else:
		if tupla[x] // 3 > numVitorias:
			indTimeVitorias = x;
			numVitorias = tupla[x] // 3;
			timeMaisVitorias = tupla[x -1];

		elif tupla[x] % numVitorias > numEmpates:
			indTimeEmpates = x;
			numEmpates = tupla[x] % numVitorias;
			timeMaisEmpates = tupla[x -1];

		elif rodadas - (numVitorias + numEmpates) < numDerrotas:
			indTimeDerrotas = x;
			numDerrotas = rodadas - (numVitorias + numEmpates);
			timeMenosDerrotas = tupla[x -1];

print("-" * 100);

print(f"O time {timeMaisVitorias} teve o maior número de vitórias, totalizando {numVitorias} vitórias! Este time está localizado na {indTimeVitorias}° tupla.");

print()

print(f"O time {timeMaisEmpates} teve o maior número de empates, totalizando {numEmpates} empates! Este time está localizado na {indTimeEmpates}° tupla.");

print()

print(f"O time {timeMenosDerrotas} teve o menor número de derrotas, totalizando {numDerrotas} derrotas! Este time está localizado na {indTimeDerrotas}° tupla.");

