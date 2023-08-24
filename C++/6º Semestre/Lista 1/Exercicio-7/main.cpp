#include <iostream>
#include <iomanip>

using namespace std;

int count = 0;
int continuar = 1;

int filhos;
int totalFilhos;
int mediaFilhos;

double salario;
double totalSalario;
double mediaSalario;
double maiorSalario;

int salarioAte1000;

void analise(int filhos, double salario);

int main()
{
    while (continuar == 1) {
        count++;
        cout<<"Quantos filhos você tem? ";
        cin>>filhos;
        cout<<endl;
        
        cout<<"Quanto é o seu salário? ";
        cin>>salario;
        cout<<endl;
        
        analise(filhos, salario);
        
        cout<<endl <<"-------------------------------------------------------------" <<endl;
        cout<<"Há mais pessoas para responderem? Digite 1 se SIM e 2 se NÃO." <<endl;
        cout<<"-------------------------------------------------------------" <<endl <<endl;
        cin>>continuar;
    };

    return 0;
}

void analise(int filhos, double salario)
{
    totalFilhos += filhos;
    totalSalario += salario;
    
    mediaFilhos = totalFilhos / count;
    cout<<"A média de filhos é " <<mediaFilhos <<"." <<endl;
    cout<<"A quantidade de filhos somada dos participantes da pesquisa resulta em " <<totalFilhos <<endl <<endl;
    
    mediaSalario = totalSalario / count;
    cout<<fixed <<setprecision(2) <<"A média de salário é R$" <<mediaSalario <<"." <<endl;
    
    if (maiorSalario < salario) {
        maiorSalario = salario;
    }
    cout<<fixed <<setprecision(2) <<"O maior salário até então é R$" <<maiorSalario <<"." <<endl;
    cout<<fixed <<setprecision(2) <<"O salário somado dos participantes da pesquisa resulta em R$" <<totalSalario <<endl;
    
    if (salario <= 1000) {
        salarioAte1000 += 1;
    }
    cout<<"Até então há " <<salarioAte1000 <<" pessoas com salário de até R$1000,00."<<endl <<endl;
    
    cout<<"Até então " <<count <<" pessoas responderam a pesquisa." <<endl;
};