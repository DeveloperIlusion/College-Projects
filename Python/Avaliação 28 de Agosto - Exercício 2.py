"""
Bruno Deluca Satil Cassiano
28/09/2021
2° Periodo ADS
"""
count = 0;
valorPagoTotal = 0;
totalBandVerme = 0;
totalICMS = 0;
bandeiraVermelha = 0;

n = int(input("Insira o número de consumidores aqui: "));

while count < n:
	kwh = int(input(f"Quantos Kwh foram consumidos pelo {count +1}° consumidor? "));
	if kwh <= 100:
		valorSemImposto = kwh * 0.11;
		print(f"O valor que você pagaria sem imposto seria de R${valorSemImposto:>.2f}");
		valorDoImposto = (valorSemImposto * 18) / 100;
		print(f"O imposto de 18% do ICMS em cima do valor do seu consumo resultou em R${valorDoImposto:>.2f}");
		total = valorSemImposto + valorDoImposto;
		print(f"O total que o {count +1}° consumidor pagará é R${total:>.2f}");
		print ("-" * 50);

	elif kwh >= 101 and kwh <= 200:
		valorSemImposto = kwh * 0.13;
		print(f"O valor que você pagaria sem imposto seria de R${valorSemImposto:>.2f}");
		valorDoImposto = (valorSemImposto * 18) / 100;
		print(f"O imposto de 18% do ICMS em cima do valor do seu consumo resultou em R${valorDoImposto:>.2f}");
		total = valorSemImposto + valorDoImposto;
		print(f"O total que o {count +1}° consumidor pagará é R${total:>.2f}");
		print ("-" * 50);

	elif kwh >= 201 and kwh <= 300:
		valorSemImposto = kwh * 0.15;
		print(f"O valor que você pagaria sem imposto seria de R${valorSemImposto:>.2f}");
		valorDoImposto = (valorSemImposto * 18) / 100;
		print(f"O imposto de 18% do ICMS em cima do valor do seu consumo resultou em R${valorDoImposto:>.2f}");
		total = valorSemImposto + valorDoImposto;
		print(f"O total que o {count +1}° consumidor pagará é R${total:>.2f}");
		print ("-" * 50);

	elif kwh >= 301 and kwh <= 500:
		bandeiraVermelha = kwh * 0.05;
		valorSemImposto = kwh * 0.17;
		print(f"O valor que você pagaria sem imposto seria de R${valorSemImposto:>.2f}, mas cuidado, seu grau de consumo já gera bandeira vermelha e o valor dela foi de {bandeiraVermelha:>.2f}!");
		valorDoImposto = (valorSemImposto * 18) / 100;
		print(f"O imposto de 18% do ICMS em cima do valor do seu consumo resultou em R${valorDoImposto:>.2f}");
		total = valorSemImposto + valorDoImposto + bandeiraVermelha;
		print(f"O total que o {count +1}° consumidor pagará é R${total:>.2f}");
		print ("-" * 50);

	elif kwh > 500:
		bandeiraVermelha = kwh * 0.07;
		valorSemImposto = kwh * 0.23;
		print(f"O valor que você pagaria sem imposto seria de R${valorSemImposto:>.2f}, mas cuidado, seu grau de consumo já gera bandeira vermelha e o valor dela foi de {bandeiraVermelha:>.2f}!");
		valorDoImposto = (valorSemImposto * 18) / 100;
		print(f"O imposto de 18% do ICMS em cima do valor do seu consumo resultou em R${valorDoImposto:>.2f}");
		total = valorSemImposto + valorDoImposto + bandeiraVermelha;
		print(f"O total que o {count +1}° consumidor pagará é R${total:>.2f}");
		print ("-" * 50);	

	valorPagoTotal += total;
	totalBandVerme += bandeiraVermelha;
	totalICMS += valorDoImposto;
	count += 1;

print(f"O total pago pelos consumidores foi de R${valorPagoTotal:>.2f}");
print()
print(f"O total de bandeira vermelha paga pelos consumidores foi de R${totalBandVerme:>.2f}");
print()
print(f"O total do ICMS pago pelos consumidores foi de R${totalICMS:>.2f}");