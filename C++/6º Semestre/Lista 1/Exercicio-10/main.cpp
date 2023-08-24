#include <iostream>
#include <iomanip>

using namespace std;

double num1;
double num2;
char operacao;
double calculadora(double num1, double num2, char operacao);

int main()
{
    cout<<"Insira o 1º número: ";
    cin>>num1;
    cout<<endl;
    
    cout<<"Insira o 2º número: ";
    cin>>num2;
    cout<<endl;
    
    cout<<"Insira o símbolo da expressão que deseja: " <<endl;
    cout<<"/ para divisão" <<endl <<"* para multiplicação" <<endl <<"+ para soma" <<endl <<"- para subtração" <<endl <<endl;
    cin>>operacao;
    cout<<endl;
    cout<<fixed <<setprecision(2) <<"O resultado da operação é: " <<calculadora(num1, num2, operacao);
    
    return 0;
}

double calculadora(double num1, double num2, char operacao)
{
    if (operacao == '/') {
        return num1 / num2;
    } else if (operacao == '*') {
        return num1 * num2;
    } else if (operacao == '+') {
        return num1 + num2;
    } else if (operacao == '-') {
        return num1 - num2;
    } else {
        cout<<endl <<endl <<"|--------------------|" <<endl <<"| Operação inválida. |" <<endl <<"|--------------------|";
        exit(0);
    }
};