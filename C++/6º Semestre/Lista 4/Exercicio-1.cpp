/*
1 - Faça um programa onde o usuário insira 5 números que devem 
ser armazenados em uma pilha dinâmica, no final, 
o programa deve exibir todos os dados armazenados além do seu somatório.
*/

#include <iostream>
#include <stack>
#include <stdio.h>
#include <conio.h>

using namespace std;

int main()
{
stack <double> numeros;
double numero;
double total;
int x = 0;

for (x = 0; x < 5; x++)
{
cout<<"Insira o " <<x+1 <<"º número: ";
cin>>numero;
numeros.push(numero);
cout<<endl <<endl;
}

system("clear");

x = 0;
while(!(numeros.empty()))
{
cout<<"O "<<x+1 <<"º número da pilha é " <<numeros.top();
total = total + numeros.top();
numeros.pop();
cout<<endl <<endl;
x++;
}

cout<<"O total ao somar todos os números da pilha é " <<total;

return 0;
}
