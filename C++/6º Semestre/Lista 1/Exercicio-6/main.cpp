#include <iostream>

using namespace std;

double x;
double y;
double z;
void triangulo(double x, double y, double z);

int main()
{
    cout<<"Insira o tamanho do 1º lado: ";
    cin>>x;
    cout<<endl;
    
    cout<<"Insira o tamanho do 2º lado: ";
    cin>>y;
    cout<<endl;
    
    cout<<"Insira o tamanho do 3º lado: ";
    cin>>z;
    cout<<endl;
    
    triangulo(x, y, z);

    return 0;
}

void triangulo(double x, double y, double z)
{
    if (x == y && x == z) {
        cout<<"Este é um triângulo equilátero.";
    } else if (x == y || x == z || y == z) {
        cout<<"Este é um triângulo isósceles.";
    } else {
        cout<<"Este é um triângulo escaleno.";
    }
};