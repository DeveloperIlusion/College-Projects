"""
----------------------------------------------------------------------
DATA/HORA DE CRIAÇÃO: 07/06/2021 ás 20:41
AUTOR...............: Bruno Deluca Satil Cassiano - 1° Período ADS
Finalidade..........: Atividade Avaliativa 1
----------------------------------------------------------------------
"""

ChicoAltura = 1.50;

ZeAltura = 1.40;

idade = 8;

print("Aos 7 anos, Chico tem 1.50 metros de altura e cresce 2 centímetros por ano, já o Zé tem 1.40 metros de altura e cresce 3 centímetros por ano!");

while ChicoAltura >= ZeAltura:

	ChicoAltura += 0.02;

	ZeAltura += 0.03;

	print(f"Quando ambos tiverem {idade} anos, a altura de Chico será {ChicoAltura:>1.2f} metros e a de Zé será {ZeAltura:>1.2f} metros!");

	diferenca = ZeAltura - ChicoAltura;

	if ChicoAltura >= ZeAltura:
		idade += 1;

	else:
		break;


print(f"Zé aos {idade} anos ficou {diferenca:>1.2f} centímetros maior que Chico!");