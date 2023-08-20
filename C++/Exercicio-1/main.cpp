#include <iostream>

using namespace std;
double num1;
double num2;
double somarNumeros(double num1, double num2);

int main()
{
    cout<<"Insira o 1º número: ";
    cin>>num1;
    cout<<endl<<endl;
    cout<<"Insira o 2º número: ";
    cin>>num2;
    cout<<endl<<endl;
    cout<<"O resultado da soma é " <<somarNumeros(num1, num2);

    return 0;
}

double somarNumeros(double num1, double num2) {
    return num1 + num2;
}