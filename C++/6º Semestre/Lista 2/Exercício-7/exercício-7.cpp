#include <iostream>
#include <fstream>
#include <cstdlib>
#include <iomanip>
#include <string>

using namespace std;

int main()
{
    string nome[3];
    string sobrenome[3];
    string idade[3];
    int x = 0;
    int y = 0;
    string holder;
    string archive_name;

    ifstream arquivo1;
    archive_name = "nome.txt";
    arquivo1.open(archive_name);
    for (x = 0; x <= 2; x++)
    {
        getline(arquivo1, nome[x]);
    }
    arquivo1.close();

    ifstream arquivo2;
    archive_name = "sobrenome.txt";
    arquivo2.open(archive_name);
    for (x = 0; x <= 2; x++)
    {
        getline(arquivo2, sobrenome[x]);
    }
    arquivo2.close();

    ifstream arquivo3;
    archive_name = "idade.txt";
    arquivo3.open(archive_name);
    for (x = 0; x <= 2; x++)
    {
        getline(arquivo3, idade[x]);
    }
    arquivo3.close();

    for (x = 0; x <= 2; x++)
    {
        for (y = 0; y <= 2; y++)
        {
            if (stoi(idade[x]) < stoi(idade[y]))
            {
                holder = idade[x];
                idade[x] = idade[y];
                idade[y] = holder;
                
                holder = nome[x];
                nome[x] = nome[y];
                nome[y] = holder;
                
                holder = sobrenome[x];
                sobrenome[x] = sobrenome[y];
                sobrenome[y] = holder;
            }
        }
    }

    for (x = 0; x <= 2; x++)
    {
        cout<<"Aluno: "<<nome[x] <<" " <<sobrenome[x] <<endl <<"Idade: " <<idade[x] <<endl <<endl;
    }

	return 0;
}