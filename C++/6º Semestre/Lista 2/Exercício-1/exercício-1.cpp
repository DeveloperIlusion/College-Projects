#include <iostream>
#include <fstream>
#include <cstdlib>

using namespace std;

int main()
{
    ofstream arquivo;
    arquivo.open("escreverNome.txt");
    arquivo <<"Bruno Deluca Satil Cassiano";
    cout <<"O nome foi inserido com sucesso!";
    arquivo.close();
    return 0;
}
