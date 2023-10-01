#include <iostream>
#include <fstream>
#include <cstdlib>
#include <string>
#include <iomanip>

using namespace std;

int main()
{
    double number = 0;
    double total = 0;
    string operation;
    int loop = 0;

    ofstream arquivo;
    arquivo.open("Operation_LOG.txt");

    while (true) {

        cout<<"Insira o " <<loop+1 <<"º número ou 0 (ZERO) para encerrar o programa: ";
        cin>>number;
        cout<<endl;

        if (number != 0)
        {
            if (loop == 0)
            {
                arquivo <<"  " <<fixed <<setprecision(2) <<(number);
            } else
            {
                if (loop % 2 == 1)
                {
                    arquivo <<" + " <<fixed <<setprecision(2) <<(number);
                } else
                {
                    arquivo <<"\n"  <<"+ " <<fixed <<setprecision(2) <<(number);
                }
            }

            total += number;
        } else {
            arquivo <<"\n" <<"= " <<fixed <<setprecision(2) <<(total);
            arquivo.close();
            cout<<endl <<endl <<"Cálculo finalizado, confira o LOG da operação.";
            break;
        }

        loop++;
    }

    return 0;
}