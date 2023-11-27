#include <iostream>
#include <string>
#include "Elevador.hpp"

using namespace std;

int main()
{
    Elevador *elevador_1 = new Elevador();
    string movimento = "";
    int andares = 0;
    
    while (true) {
        cout<<"Você deseja que o elevador suba ou desça? ";
        cin>>movimento;
        cout<<endl <<endl;
        
        cout<<"Quantos andares? ";
        cin>>andares;
        cout<<endl <<endl;
        
        
        if (movimento == "suba") {
            elevador_1->subir(andares);
        } else if (movimento == "desça") {
            elevador_1->descer(andares);
        } else {
            cout<<"O elevador é uma caixa que só se move verticalmente,"
            <<" então não foi possível ser realizado o movimento inserido."
            <<endl <<endl;
        }
    }

    return 0;
}
