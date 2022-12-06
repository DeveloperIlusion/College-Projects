"""
Bruno Deluca Satil Cassiano
28/09/2021
2° Periodo ADS
"""
fichas = ( 	input("Nome do 1° Aluno(a):"),
		  	float(input("Média do 1° Aluno(a):")),
			input("Nome do 2° Aluno(a):"),
		  	float(input("Média do 2° Aluno(a):")),
			input("Nome do 3° Aluno(a):"),
		  	float(input("Média do 3° Aluno(a):")),
			input("Nome do 4° Aluno(a):"),
		  	float(input("Média do 4° Aluno(a):")),
			input("Nome do 5° Aluno(a):"),
		  	float(input("Média do 5° Aluno(a):")),
			input("Nome do 6° Aluno(a):"),
		  	float(input("Média do 6° Aluno(a):")),
			input("Nome do 7° Aluno(a):"),
		  	float(input("Média do 7° Aluno(a):")),
			input("Nome do 8° Aluno(a):"),
		  	float(input("Média do 8° Aluno(a):")),
			input("Nome do 9° Aluno(a):"),
		  	float(input("Média do 9° Aluno(a):")),
			input("Nome do 10° Aluno(a):"),
		  	float(input("Média do 10° Aluno(a):")),
 			input("Nome do 11° Aluno(a):"),
		  	float(input("Média do 11° Aluno(a):")),
			input("Nome do 12° Aluno(a):"),
		  	float(input("Média do 12° Aluno(a):"))
)

indMenor = -1;
mediaMenor = 0;
nomeMenor = "";

indMaior = -1;
mediaMaior = 0;
nomeMaior = "";


print("O aluno com com maior média está localizado no índice:")
for x in range(1, len(fichas), 2):
	if x == 1:
		indMenor = x
		mediaMenor = fichas[x]
		nomeMenor = fichas[x -1]

		indMaior = x
		mediaMaior = fichas[x]
		nomeMaior = fichas[x -1]
	else:
		if fichas[x] < mediaMenor:
			indMenor = x
			mediaMenor = fichas[x]
			nomeMenor = fichas[x -1]

		if fichas[x] > mediaMaior:
			indMaior = x
			mediaMaior = fichas[x]
			nomeMaior = fichas[x -1]

print("-" * 50)
print(f"O aluno {nomeMaior} possui a maior média, sendo está {mediaMaior} e está localizado no indice {indMaior}° da tupla.")
print(f"O aluno {nomeMenor} possui a menor média, sendo está {mediaMenor} e está localizado no indice {indMenor}° da tupla.")
print("-" * 50)