"""
Bruno Deluca Satil Cassiano
28/09/2021
2° Periodo ADS
"""

print("Insira os números que deseja nos espaços abaixo:");

limiteInferior =(	(int(input("1° valor: ")))	);

limiteSuperior =( 	(int(input("2° valor: ")))  );
count = 1;
somaInt = 0;

if limiteInferior <= limiteSuperior:
	print("Estes são os valores impares encontrados neste intervalo fechado:", end = "");
	for x in range(limiteInferior, limiteSuperior + 1):
		somaInt += x;
		if x % 2 == 1:
			print(f"{x}", end = ", ")

elif limiteInferior > limiteSuperior:
	print("Estes são os valores impares encontrados neste intervalo fechado:", end = "");
	for x in range(limiteSuperior, limiteInferior + 1):
		somaInt += x;
		if x % 2 == 1:
			print(f"{x}", end = ", ")
print()

print("Este é o primeiro valor par a aparecer no intervalo:", end = "")

if limiteInferior <= limiteSuperior:
	for x in range(limiteInferior, limiteSuperior + 1):
		if x % 2 == 0 and count == 1:
			print(f"{x}");
			count += 1;

elif limiteInferior > limiteSuperior:
	for x in range(limiteSuperior, limiteInferior + 1):
		if x % 2 == 0 and count == 1:
			print(f"{x}");
			count += 1;

print(f"O resultado da soma dos números inteiros é {somaInt}");