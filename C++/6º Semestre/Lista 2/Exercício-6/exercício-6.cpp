#include <iostream>
#include <cstdlib>
#include <fstream>

using namespace std;

int main()
{
    string nome[3];
    string sobrenome[3];
    int idade[3];
    int x = 0;
    string archive_name;

    ofstream arquivo1;
    archive_name = "nome.txt";
    arquivo1.open(archive_name);
    for (x = 0; x <= 2; x++)
    {
        cout<<"Insira o nome" <<x+1 <<"ª pessoa: ";
        cin>>nome[x];
        arquivo1<<nome[x] <<"\n";
    }
    arquivo1.close();

    ofstream arquivo2;
    archive_name = "sobrenome.txt";
    arquivo2.open(archive_name);
    for (x = 0; x <= 2; x++)
    {
        cout<<"Insira o sobrenome" <<x+1 <<"ª pessoa: ";
        cin>>sobrenome[x];
        arquivo2<<sobrenome[x] <<"\n";
    }
    arquivo2.close();

    ofstream arquivo3;
    archive_name = "idade.txt";
    arquivo3.open(archive_name);
    for (x = 0; x <= 2; x++)
    {
        cout<<"Insira a idade" <<x+1 <<"ª pessoa: ";
        cin>>idade[x];
        arquivo3<<idade[x] <<"\n";
    }
    arquivo3.close();

    return 0;
}