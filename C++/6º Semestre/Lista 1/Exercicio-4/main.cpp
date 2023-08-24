#include <iostream>

using namespace std;
double n1;
double n2;
double n3;
void nota(double n1, double n2, double n3);

int main()
{
    setlocale(LC_ALL, "portuguese");
    cout<<"Insira a 1ª nota: ";
    cin>>n1;
    cout<<endl <<endl;
    cout<<"Insira a 2ª nota: ";
    cin>>n2;
    cout<<endl <<endl;
    cout<<"Insira a 3ª nota: ";
    cin>>n3;
    cout<<endl <<endl;
    nota(n1, n2, n3);

    return 0;
}

void nota(double n1, double n2, double n3) {
    double media = (n1 + n2 + n3) / 3;
    if (media >= 8) {
        cout<<"Você ficou com nota A!";
    } else if (media >= 6) {
        cout<<"Você ficou com nota B!";
    } else if (media >= 4) {
        cout<<"Você ficou com nota C!";
    } else {
        cout<<"Você ficou com nota D!";
    }
}