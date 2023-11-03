double salarioBruto = 5000;
double salarioLiquido = 0;

void main() {
    if (salarioBruto < 1903.98) {
        salarioLiquido = salarioBruto;
    } else if (salarioBruto <= 2862.65) {
        salarioLiquido = salarioBruto - ((salarioBruto * 7.5) / 100);
    } else if (salarioBruto <= 3751.05) {
        salarioLiquido = salarioBruto - ((salarioBruto * 15) / 100);
    } else if (salarioBruto <= 4664.68) {
        salarioLiquido = salarioBruto - ((salarioBruto * 22.5) / 100);
    } else if (salarioBruto > 4664.68) {
        salarioLiquido = salarioBruto - ((salarioBruto * 27.5) / 100);
    } else {
        print("O valor do salário bruto inserido é inválido.");
    }

    print("O salário líquido será $salarioLiquido");
}
