/*
2-	Crie um programa para alimentar uma lista, o programa deve pedir para 
que usuário escolha quantos números quer inserir, depois através de dois 
procedimentos, ele escolher se ele quer inserir esse número ou na frente 
ou atrás da lista (Um procedimento para adicionar a frente e um procedimento 
para adicionar atrás). Uma vez a lista preenchida, o programa deve exibir a 
lista completa em ordem de frente para trás. (1 ponto)
*/

#include <iostream>
#include <list>

using namespace std;

list <int> listaNumero;

void inserirFinalDaLista(int numero)
{
    listaNumero.push_back(numero);
}

void inserirInicioDaLista(int numero)
{
    listaNumero.push_front(numero);
}

int main()
{
    bool verificador = true;
    string holder;
    int x = 0;
    int quantidadeInserir;
    string ondeInserir;
    
    cout<<"Quantos números você quer inserir? ";
    cin>>quantidadeInserir;
    cout<<endl <<endl;
    
    for (x = 0; x < quantidadeInserir;)
    {
        cout<<"Você quer inserir o " <<x+1 <<"º número no INICIO ou no FINAL da lista? ";
        cin>>ondeInserir;
        cout<<endl <<endl;
        
        int numero;
        cout<<"Qual número deseja inserir? ";
        cin>>numero;
        cout<<endl <<endl;
        
        if (ondeInserir == "INICIO")
        {
            x++;
            inserirInicioDaLista(numero);
            system("clear");
        } else if (ondeInserir == "FINAL")
        {
            x++;
            inserirFinalDaLista(numero);
            system("clear");
        } else 
        {
            cout<<"Você deve digitar INICIO ou FINAL, baseado na posição da lista que almeja, tente novamente!" <<endl <<endl;
            system("clear");
        }
    }
    
    system("clear");
    
    cout<<"A lista de trás pra frente fica assim: " <<endl;
    while(!(listaNumero.empty()))
    {
        cout<<listaNumero.front() <<endl;
        listaNumero.pop_front();
    }
    
    return 0;
}
