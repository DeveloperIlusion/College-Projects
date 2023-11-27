#include <iostream>

using namespace std;

class Aluno {
    public:
        string Nome = "";
        double PrimeiraNota = 0;
        double SegundaNota = 0;
        double NotaMedia = 0;
        void calcular_media();
        void inserir_dados();
};

void Aluno::calcular_media() {
    this->NotaMedia = (this->PrimeiraNota + this->SegundaNota) / 2;
    cout<<"A média de " <<this->Nome <<" é " <<this->NotaMedia <<endl <<endl;
}

void Aluno::inserir_dados() {
    cout<<"Insira o nome do aluno: ";
    cin>>this->Nome;
    cout<<endl <<endl;
    
    cout<<"Insira a primeira nota: ";
    cin>>this->PrimeiraNota;
    cout<<endl <<endl;
    
    cout<<"Insira a segunda nota: ";
    cin>>this->SegundaNota;
    cout<<endl <<endl;
}