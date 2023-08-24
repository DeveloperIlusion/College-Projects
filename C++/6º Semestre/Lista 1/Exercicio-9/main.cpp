#include <iostream>
#include <iomanip>

using namespace std;

void ordenador(int vetor[], int tamanho);
void exibir(int vetor[], int tamanho);

int main()
{
    int vetor[10];

    for (int count = 0; count < 10; count++)
    {
        cout << "Insira o " << count + 1 << "º número: ";
        cin >> vetor[count];
        cout << endl << endl;
    }

    ordenador(vetor, 10);
    exibir(vetor, 10);

    return 0;
}

void ordenador(int vetor[], int tamanho)
{
    for (int count = 0; count < tamanho; count++)
    {
        for (int count2 = 0; count2 < tamanho; count2++)
        {
            if (vetor[count] < vetor[count2])
            {
                int holder = vetor[count];
                vetor[count] = vetor[count2];
                vetor[count2] = holder;
            }
        }
    }
}

void exibir(int vetor[], int tamanho)
{
    cout<<"Ordem crescente:" <<endl;
    for (int count = 0; count < tamanho; count++)
    {
        cout << "[ " << vetor[count] << " ] ";
    }

    cout<<endl <<"Ordem decrescente:" <<endl;
    for (int count = 9; count >= 0; count--)
    {
        cout << "[ " << vetor[count] << " ] ";
    }
}