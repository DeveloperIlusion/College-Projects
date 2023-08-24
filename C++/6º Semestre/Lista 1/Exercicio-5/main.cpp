#include <iostream>

using namespace std;
double litros;
double alcoolPreco;
double alcool();
double gasolinaPreco;
double gasolina();
void autonomia(double gasolina, double alcool);

int main()
{
    setlocale(LC_ALL, "portuguese");
    cout<<"Quantos litros de combustível você quer colocar? ";
    cin>>litros;
    cout<<endl;
    
    autonomia(gasolina(), alcool());
    return 0;
}

double gasolina()
{
    cout<<"Qual o preço da gasolina? ";
    cin>>gasolinaPreco;
    cout<<endl;
    return gasolinaPreco;
};

double alcool()
{
    cout<<"Qual o preço do álcool? ";
    cin>>alcoolPreco;
    cout<<endl;
    return alcoolPreco;
};

void autonomia(double gasolina, double alcool)
{
    double autonomiaGasolina = 14 * litros;
    double custoGasolina = autonomiaGasolina / gasolina;
    double autonomiaAlcool = 10 * litros;
    double custoAlcool = autonomiaAlcool / alcool;
    
    cout<<"Com esses litros você andará " <<autonomiaGasolina <<" km se abastacer com gasolina e " <<autonomiaAlcool <<" km se abastecer com álcool." <<endl;
    cout<<"O custo por KM percorrido com gasolina será " <<custoGasolina <<"." <<endl;
    cout<<"E o custo por KM percorrido com álcool será " <<custoAlcool <<"." <<endl;
    if (custoGasolina < custoAlcool) {
        cout<<"Vale mais a pena abastecer com gasolina.";
    } else if (custoGasolina == custoAlcool) {
        cout<<"O custo por KM percorrido será o mesmo, então escolha o que for de sua preferência.";
    } else {
        cout<<"Vale mais a pena abastecer com álcool.";
    }
};