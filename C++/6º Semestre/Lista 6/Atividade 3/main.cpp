#include <iostream>
#include "Energia.hpp"

using namespace std;

int main()
{
    Energia *energia_1 = new Energia();
    
    cout<<"Insira a quantidade de cada eletrodoméstico: " <<endl <<endl;
    energia_1->inserir_dados();
    cout<<"O consumo de energia desse mês ficou em R$ " <<energia_1->consumo() <<endl;

    return 0;
}
