/*
3-	Faça um programa onde o usuário insira 4 nomes e esses sejam armazenados 
em uma pilha P1, logo após, o programa deve mover esses 4 nomes para uma 
lista L1. No final, através de um procedimento, o programa deve imprimir 
as duas estruturas. Considerando que a lista deverá conter os mesmos nomes 
da pilha, a impressão deverá acontecer em ordem inversa: 
ex: (P1: A, B, C, D / F1: D, C, B, A). (1 ponto)
*/

#include <iostream>
#include <list>
#include <stack>

using namespace std;

list <string> L1;
stack <string> P1;
    
void imprimir()
{
    cout<<"Essa é a pilha: ";
    while(!(P1.empty()))
    {
        cout<<"[" <<P1.top() <<"] ";
        P1.pop();
    }
    
    cout<<endl <<endl <<"Essa é a lista: ";
    while(!(L1.empty()))
    {
        cout<<"[" <<L1.front() <<"] ";
        L1.pop_front();
    }
}

int main()
{
    bool verificador = true;
    string holder;
    int x = 0;
    
    for (x = 0; x < 4; x++)
    {
        cout<<"Insira o " <<x+1 <<"º nome: ";
        cin>>holder;
        P1.push(holder);
    }
    
    system("clear");
    
    for (x = 0; x < 4; x++)
    {
        L1.push_back(P1.top());
        P1.pop();
    }
    
    for (x = 0; x < 4; x++)
    {
        P1.push(L1.front());
        L1.push_back(L1.front());
        L1.pop_front();
    }
    
    imprimir();
    

    return 0;
}
