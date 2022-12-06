"""
Bruno Deluca Satil Cassiano - 2° Período
Finalidade: Atividade Avaliativa

3) (3,0 pontos). Desenvolva um algoritmo que leia duas notas de um aluno, um trabalho
(todos os valores entre 0 e 10) e sua frequência, definindo e imprimindo se ele foi
aprovado, reprovado ou se fará prova final. O aluno será reprovado se faltou mais de 15
aulas. Será aprovado se não for reprovado por falta e sua média for maior que 6,0. Caso
tenha média menor que 6 e maior que 2 pontos, deverá fazer prova final. Solicitar a nota
da prova final e calcular nova média que precisa ser maior ou igual a 6 para ser aprovado,
caso contrário o aluno será considerado reprovado.
"""

while True:
	nota1 = float(input("Insira a primeira nota aqui: "));
	print("-" * 28);
	if nota1 <= 10 and nota1 >= 0:
		break;
	else:
		print("Valor inválido, as notas devem ter um valor entre 1 e 10.");
		print("-" * 57);
		continue;
		
while True:
	nota2 = float(input("Insira a segunda nota aqui: "));
	print("-" * 27);
	if nota2 <= 10 and nota2 >= 0:
		break;
	else:
		print("Valor inválido, as notas devem ter um valor entre 1 e 10.");
		print("-" * 57);
		continue;

while True:
	trab = float(input("Insira a nota do seu trabalho aqui: "));
	print("-" * 35);
	if trab <= 10 and trab >= 0:
		break;
	else:
		print("Valor inválido, as notas devem ter um valor entre 1 e 10.");
		print("-" * 57);
		continue;
		
frequencia = int(input("Insira o total de faltas aqui: "))
print("-" * 50);


media = (nota1 + nota2 + trab) / 3;

if frequencia > 15:
	print("Você foi reprovado pois teve mais de 15 faltas!");

else:
	if media >= 6:
		print(f"Parabéns! Você foi aprovado com média {media:.2f}!");

	elif media < 6 and media > 2:
		print(f"Sua média foi {media:.2f}, ou seja, insuficiente para passar, mas você ainda pode fazer a prova final!");
		while True:
			notaFinal = float(input("Insira a nota da prova final aqui: "));
			print("-" * 35);
			if notaFinal <= 10 and notaFinal >= 0:
				break;
			else:
				print("Valor inválido, as notas devem ter um valor entre 1 e 10.");
				print("-" * 57);
				continue;
		media = (media + notaFinal) / 2;

		if media >= 6:
			print(f"Parabéns! Graças a sua nota na prova final, você foi aprovado com média {media:.2f}!");
		else:
			print(f"Com a prova final, sua nova média foi {media:.2f}, ou seja, você foi reprovado.");

	else:
		print(f"Sua média foi {media:.2f}, ou seja, insuficiente para passar e para fazer a prova final, você foi reprovado.");
