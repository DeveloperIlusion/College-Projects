/*
2 – Crie 2 pilhas dinâmicas com o tamanho que você quiser, uma com nomes e outra com números, 
o programa deve exibir o conteúdo da pilha que tiver mais elementos.
*/

#include <iostream>
#include <stack>

using namespace std;

int main()
{
    stack <string> pessoas;
    stack <string> animais;
    bool verificador = true;
    string holder;
    int x = 0;
    
    while (verificador == true)
    {
        cout<<"Insira o nome de uma pessoa ou FINALIZAR para encerrar a lista: ";
        cin>>holder;
        if (holder == "FINALIZAR")
        {
            break;
        } else
        {
            pessoas.push(holder);
        }
    }
    
    system("clear");
    
    while (verificador == true)
    {
        cout<<"Insira o nome de um animal ou FINALIZAR para encerrar a lista: ";
        cin>>holder;
        if (holder == "FINALIZAR")
        {
            break;
        } else
        {
            animais.push(holder);
        }
    }
    
    x = 0;
    if (pessoas.size() > animais.size())
    {
        cout<<"A lista de pessoas tem mais dados, então vamos imprimi-lá." <<endl;
        while(!(pessoas.empty()))
        {
            cout<<"A "<<x+1 <<"º pessoa da pilha é " <<pessoas.top();
            pessoas.pop();
            cout<<endl <<endl;
            x++;
        }
    } else
    {
        cout<<"A lista de animais tem mais dados, então vamos imprimi-lá." <<endl;
        while(!(animais.empty()))
        {
            cout<<"O "<<x+1 <<"º animal da pilha é " <<animais.top();
            animais.pop();
            cout<<endl <<endl;
            x++;
        }
    }
    
    return 0;
}
