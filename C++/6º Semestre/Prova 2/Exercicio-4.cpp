/*
4-	Faça um programa onde o usuário insira um número aleatório, 
através de uma sub-rotina, o programa deverá filtrar se esse programa 
é par ou ímpar, caso par, esse programa deverá inserir os números pares 
em uma fila PAR e os números ímpares em uma fila ÍMPAR e caso o usuário 
escreva 0, o programa deve encerrar a fase de inserção de dados e seguir 
para a próxima parte; Através de uma segunda sub-rotina o programa deverá 
dizer imprimir na tela se as filas PAR e ÍMPAR tem o mesmo tamanho ou não. 
Por fim, através de uma terceira sub-rotina o programa deve imprimir as duas 
filas e salvá-las em um arquivo txt. (1,5 ponto).
*/

#include <iostream>
#include <queue>
#include <fstream>

using namespace std;

queue <int> numerosPares;
queue <int> numerosImpares;

void insereNumero(int numero)
{
    if (numero % 2 == 0)
    {
        numerosPares.push(numero);
    } else
    {
        numerosImpares.push(numero);
    }
}

void tamanhoDasFilas()
{
    if (numerosPares.size() == numerosImpares.size())
    {
        cout<<"As filas POSSUEM o mesmo tamanho." <<endl <<endl;
    } else
    {
        cout<<"As filas NÃO POSSUEM o mesmo tamanho." <<endl <<endl;
    }
}

void imprimirEscreverFilas()
{
    ofstream arquivo;
    arquivo.open("filas.txt");
    cout<<"Essa é a fila par: ";
    arquivo<<"Essa é a fila par: ";
    while(!(numerosPares.empty()))
    {
        cout<<"[" <<numerosPares.front() <<"] ";
        arquivo<<"[" <<numerosPares.front() <<"] ";
        numerosPares.pop();
    }
    
    cout<<endl <<endl;
    
    cout<<"Essa é a fila impar: ";
    arquivo<<"\nEssa é a fila impar: ";
    while(!(numerosImpares.empty()))
    {
        cout<<"[" <<numerosImpares.front() <<"] ";
        arquivo<<"[" <<numerosImpares.front() <<"] ";
        numerosImpares.pop();
    }
}

int main()
{
    
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
            insereNumero(holder);
        }
    }
    
    system("clear");
    
    tamanhoDasFilas();
    
    imprimirEscreverFilas();

    return 0;
}
