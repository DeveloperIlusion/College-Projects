/*
5 - Faça um algoritmo com duas listas de 5 elementos, após essa lista ser impressa na tela, 
a segunda deve ser uma cópia idêntica da primeira e também ser impressa na tela.
*/

#include <iostream>
#include <list>

using namespace std;

int main()
{
    list <string> nomes;
    list <string> copia;
    bool verificador = true;
    string holder;
    int x = 0;
    
    for (x = 0; x < 5; x++)
    {
        cout<<"Insira o " <<x+1 <<"º nome: ";
        cin>>holder;
        nomes.push_front(holder);
    }
    
    system("clear");
    
    x = 0;
    cout<<"Essa é a lista de nomes originais: " <<endl;
    while(!(nomes.empty()))
    {
        cout<<"[" <<nomes.front() <<"] ";
        copia.push_back(nomes.front());
        nomes.pop_front();
    }
    
    cout<<endl <<endl;
    
    x = 0;
    cout<<"Essa é a lista cópia: " <<endl;
    while(!(copia.empty()))
    {
        cout<<"[" <<copia.front() <<"] ";
        copia.pop_front();
    }

    return 0;
}
