#include <iostream>
#include <iomanip>

using namespace std;

int count = 0;
int continuar = 1;

double valor;
double totalValor;
double mediaValor;
double mediaFinal;
double analise();

int main()
{
    mediaFinal = analise();
    cout<<"A média final é " <<mediaFinal;

    return 0;
}

double analise()
{
   while (continuar == 1) {
        count++;
        cout<<"Insira um valor positivo: ";
        cin>>valor;
        cout<<endl;
        
        totalValor += valor;
        mediaValor = totalValor / count;
    
        cout<<fixed <<setprecision(2) <<"A média atual é " <<mediaValor <<"; sendo o valor total " <<totalValor <<endl;
        cout<<"O programa já rodou " <<count <<" vezes." <<endl;
        
        cout<<endl <<"-------------------------------------------------------------" <<endl;
        cout<<"Há mais pessoas para responderem? Digite 1 se SIM e 2 se NÃO." <<endl;
        cout<<"-------------------------------------------------------------" <<endl <<endl;
        cin>>continuar;
    };
    
    return mediaValor;
};