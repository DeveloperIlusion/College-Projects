#include <iostream>

using namespace std;
int contador = 0;
int alunos;
int n1;
int n2;
float calcularMedia (int n1, int n2);
string aprovaReprova (float media);

int main ()
{
    cout<<"Quantos alunos fizeram as provas? ";
    cin>>alunos;

    for (alunos; alunos > 0; alunos--) {
        contador++;
        cout<<contador <<"º Aluno - Qual a nota da 1ª prova? ";
        cin>>n1;
        cout<<endl<<endl;
        cout<<contador <<"º Aluno - Qual a nota da 2ª prova? ";
        cin>>n2;
        cout<<endl<<endl;
        cout<<"Com a média dessas 2 provas o aluno foi " <<aprovaReprova(calcularMedia(n1, n2));
        cout<<endl<<endl<<"----------------------------------------------------------------------"<<endl<<endl;
    }
    cout<<"A situação de todos alunos já foi processada e informada.";

    return 0;
}

float calcularMedia (int n1, int n2)
{
    return (n1 + n2) / 2;
};

string aprovaReprova (float media)
{
    if (media >= 6){
        return "aprovado";
    } else {
        return "reprovado";
    }
};