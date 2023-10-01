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
        ifstream arquivo;
        string archive_name = "Ip"+to_string(x)+".txt";
        arquivo.open(archive_name);
        getline(arquivo, ips[x]);
        arquivo.close();
    }

    cout<<"------________------________------" <<endl <<endl;
    cout<<"Os IPs encontrados foram: " <<endl;
    for (int y = 0; y <= 2; y++) 
    {
        cout<<ips[y] <<endl;
    }
    cout<<endl <<"------________------________------";

    return 0;
}