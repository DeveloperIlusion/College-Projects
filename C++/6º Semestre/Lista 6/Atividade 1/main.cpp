#include <iostream>
#include "Alunos.hpp"

using namespace std;

int main()
{
    Aluno *aluno_1 = new Aluno();
    Aluno *aluno_2 = new Aluno();
    
    cout<<"1º Aluno:" <<endl <<endl;
    aluno_1->inserir_dados();
    aluno_1->calcular_media();
    
    cout<<"2º Aluno:" <<endl <<endl;
    aluno_2->inserir_dados();
    aluno_2->calcular_media();
    
    if (aluno_1->NotaMedia > aluno_2->NotaMedia) {
        cout<<"A média do " <<aluno_1->Nome <<" é maior." <<endl;
    } else if (aluno_1->NotaMedia < aluno_2->NotaMedia) {
        cout<<"A média do " <<aluno_2->Nome <<" é maior." <<endl;
    } else {
        cout<<"As médias são iguais." <<endl;
    }

    return 0;
}
