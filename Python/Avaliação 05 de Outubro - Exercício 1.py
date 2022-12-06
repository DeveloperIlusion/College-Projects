"""
Bruno Deluca Satil Cassiano
2° Período ADS
05/10/2021

1) (5,0 pontos). Solicite ao usuário que informe números inteiros até que seja digitado o
valor zero para interromper p laço. Ao final exiba os seguintes dados sobre os
números informados:
• A soma dos números.
• A média dos números.
• O menor dos números.
• O maior dos números.
• A quantidade de números pares que foi informado.
"""

count = 0;
par = 0;
somaNum = 0;

while True:
	numero = int(input("Insira aqui um número para o cálculo ou 0 (ZERO) para encerrar o programa: "));
	if numero == 0:
		break;

	somaNum += numero;

	if count == 0:
		menorNum = numero;
		maiorNum = numero;

	else:
		if numero < menorNum:
			menorNum = numero;

		elif numero > maiorNum:
			maiorNum = numero;

	count += 1;

	if numero % 2 == 0:
		par += 1;

	media = somaNum / count;

	print("-" * 100);


print("-" * 50);
print(f"O soma dos números totalizou {somaNum:>.2f}");
print()
print(f"O média dos números é {media:>.2f}");
print()
print(f"O menor dos números é {menorNum:>.2f}");
print()
print(f"O maior dos números é {maiorNum:>.2f}");
print()
print(f"Foram informados {par} números pares.");
print()
print("-" * 50);