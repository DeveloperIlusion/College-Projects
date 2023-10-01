#include <iostream>
#include <fstream>
#include <cstdlib>
#include <string>

using namespace std;

int main()
{
    string ips[2];

    for (int x = 0; x <= 2; x++)
    {
        ofstream arquivo;
        string archive_name = "Ip"+to_string(x)+".txt";
        arquivo.open(archive_name);
        cout<<"Insira o " <<x+1 <<"º ip, seguindo o padrão de máscara 255.255.255.255" <<endl;
        cin>> ips[x];
        arquivo<< ips[x];
        arquivo.close();
    }
   
    return 0;
}