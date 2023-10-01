/*
1-	(Fácil – Valor: 1 ponto - FUNÇÃO):  Faça um programa com uma função que recebe 3 
valores inteiros por parâmetro e retorna-os ordenados em ordem crescente
*/

#include <iostream>

using namespace std;

int funcaoInteiros(int num1, int num2, int num3);
int insertnum1;
int insertnum2;
int insertnum3;

int main()
{
    cout<<"Insira o 1º número: ";
    cin>>insertnum1;
    cout<<endl <<endl;
    
    cout<<"Insira o 2º número: ";
    cin>>insertnum2;
    cout<<endl <<endl;
    
    cout<<"Insira o 3º número: ";
    cin>>insertnum3;
    cout<<endl <<endl;
    funcaoInteiros(insertnum1, insertnum2, insertnum3);

    return 0;
}

int funcaoInteiros(int num1, int num2, int num3)
{
    int ordena[3];
    ordena[0] = num1;
    ordena[1] = num2;
    ordena[2] = num3;
    int holder = 0;
    
    for (int x = 0; x <= 2; x++)
    {
        for (int y = 0; y <= 2; y++)
        {
            if (ordena[x] < ordena[y])
            {
                holder = ordena[x];
                ordena[x] = ordena[y];
                ordena[y] = holder;
            }
        }
    }
    
    cout<<"O vetor ficou ordenado da seguinte forma: ";
    for (int z = 0; z <= 2; z++)
    {
        cout<<"[" <<ordena[z] <<"] ";
    }
    
    return 0;
}
