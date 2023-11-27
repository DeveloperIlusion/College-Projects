#include <iostream>

using namespace std;

class Elevador {
    public:
        int Andar = 0;
        void subir(int andares);
        void descer(int andares);
        void andar_atual();
};

void Elevador::subir(int andares) {
    this->Andar = this->Andar + andares;
    this->andar_atual();
}

void Elevador::descer(int andares) {
    this->Andar = this->Andar - andares;
    this->andar_atual();
}

void Elevador::andar_atual() {
    if (this->Andar > 10) {
        cout<<"O elevador subiu até a cobertura." <<endl <<endl;
        this->Andar = 10;
    } else if (this->Andar <= 0) {
        cout<<"O elevador voltou para o terreo." <<endl <<endl;
        this->Andar = 0;
    } else {
        cout<<"O elevador agora está no " <<this->Andar <<"º andar."  <<endl <<endl;
    }
}
