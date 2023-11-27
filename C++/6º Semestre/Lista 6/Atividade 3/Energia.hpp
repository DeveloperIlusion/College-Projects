#include <iostream>

using namespace std;

class Energia {
    public:
        int Andar = 0;
        int quantidade_lampadas = 0;
        int quantidade_freezers = 0;
        int quantidade_jukeboxes = 0;
        void inserir_dados();
        double consumo();

    private:
        int potencia_lampadas = 20;
        int potencia_freezers = 400;
        int potencia_jukeboxes = 1000;
};

void Energia::inserir_dados() {
    cout<<"Insira a quantidade de lâmpadas: ";
    cin>>this->quantidade_lampadas;
    cout<<endl <<endl;
    
    cout<<"Insira a quantidade de freezers: ";
    cin>>this->quantidade_freezers;
    cout<<endl <<endl;
    
    cout<<"Insira a quantidade de jukeboxes: ";
    cin>>this->quantidade_jukeboxes;
    cout<<endl <<endl;
}


double Energia::consumo() {
    double consumo_lampadas = 0;
    consumo_lampadas = (((this->potencia_lampadas * 8) * 30) / 1000) * this->quantidade_lampadas;
    
    double consumo_freezers = 0;
    consumo_freezers = (((this->potencia_freezers * 8) * 30) / 1000) * this->quantidade_freezers;
    
    double consumo_jukeboxes = 0;
    consumo_jukeboxes = (((this->potencia_jukeboxes * 8) * 30) / 1000) * this->quantidade_jukeboxes;
    
    double consumo_total = 0;
    consumo_total = (consumo_lampadas + consumo_freezers + consumo_jukeboxes) * 0.321480;
    return consumo_total;
}
