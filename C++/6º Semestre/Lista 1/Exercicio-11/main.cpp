#include <iostream>
#include <iomanip>

using namespace std;

bool correto = false;
int mes = -1;
string mesNome(int mes);

int main()
{
    cout<<"Insira o número que corresponde a um dos meses do primeiro semestre (1 a 6): ";
    cin>>mes;
    cout<<endl <<mesNome(mes) <<endl <<endl;
    
    return 0;
}

string mesNome(int mes)
{
    correto = true;
    
    switch(mes) {
        case 1:
            return "Este mês se chama Janeiro.";
            break;
        case 2:
            return "Este mês se chama Fevereiro.";
            break;
        case 3:
            return "Este mês se chama Março.";
            break;
        case 4:
            return "Este mês se chama Abril.";
            break;
        case 5:
            return "Este mês se chama Maio.";
            break;
        case 6:
            return "Este mês se chama Junho.";
            break;
        default:
            return "Mês inválido, reinicie o programa e escolha de 1 a 6.";
            break;
    }
};