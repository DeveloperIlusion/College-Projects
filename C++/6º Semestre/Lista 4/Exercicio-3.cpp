/*
3 – Faça um algoritmo com uma fila que armazene quantos números inteiros que que o usuário quiser, 
esses números também serão inseridos pelo usuário. O programa deve armazenar os números 
menores que 5 que foram inseridos em uma segunda fila, no final o programa deve falar qual é o 
tamanho da primeira fila com todos os números inseridos bem como o tamanho da segunda fila 
onde só foram armazenados os números menores que 5.
*/

#include <iostream>
#include <queue>

using namespace std;

int main()
{
    queue <int> numerosUm;
    queue <int> numerosDois;
    bool verificador = true;
    int holder;
    int x = 0;
    
    while (verificador == true)
    {
        cout<<"Insira um número ou 0 {ZERO} para finalizar a lista: ";
        cin>>holder;
        if (holder == 0)
        {
            break;
        } else
        {
            if (holder >= 5)
            {
                numerosUm.push(holder);
            } else
            {
                numerosDois.push(holder);
            }
        }
    }
    
    system("clear");
    
    x = 0;
    cout<<"A lista com números maiores que 5 tem um total de " <<numerosUm.size() <<" números inseridos. Sendo eles: " <<endl;
    while(!(numerosUm.empty()))
    {
        cout<<"[" <<numerosUm.front() <<"] ";
        numerosUm.pop();
    }
    
    cout<<endl <<endl;
    
    x = 0;
    cout<<"A lista com números menores que 5 tem um total de " <<numerosDois.size() <<" números inseridos. Sendo eles: " <<endl;
    while(!(numerosDois.empty()))
    {
        cout<<"[" <<numerosDois.front() <<"] ";
        numerosDois.pop();
    }

    return 0;
}
