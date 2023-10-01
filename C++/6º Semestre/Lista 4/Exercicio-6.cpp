/*
6 - Faça uma lista com 3 números alocados nela, 1, 2 e 3... O usuário deve indicar 
se ele quer que esses números sejam exibidos em ordem crescente ou ordem decrescente. 
Uma vez que o usuário escolher um sentido esses números devem rolar em um looping infinito.
*/

#include <iostream>
#include <list>

using namespace std;

int main()
{
    list <int> numeros;
    string holder;
    bool verificador = true;
    int x = 0;
    
    for (x = 0; x <= 2; x++)
    {
        numeros.push_front(x+1);
    }
    
    while (verificador == true)
    {
        cout<<"Você gostaria que a lista fosse exibida em ordem CRESCENTE ou DECRESCENTE? ";
        cin>>holder;
        cout<<endl <<endl;
        
        if (holder == "CRESCENTE")
        {
            while (!(numeros.empty()))
            {
                cout<<"[" <<numeros.back() <<"] " <<endl;
                numeros.push_front(numeros.back());
                numeros.pop_back();
                verificador = false;
            }
        } else if (holder == "DECRESCENTE")
        {
            while (!(numeros.empty()))
            {
                cout<<"[" <<numeros.front() <<"] " <<endl;
                numeros.push_back(numeros.front());
                numeros.pop_front();
                verificador = false;  
            }
        } else 
        {
            system("clear");
            cout<<"Insira CRESCENTE ou DECRESCENTE para escolher a ordem de exibição!";
            cout<<endl <<endl;
        }
    }
    
    return 0;
}
