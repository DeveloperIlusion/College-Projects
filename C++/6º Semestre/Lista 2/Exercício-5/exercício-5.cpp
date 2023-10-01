#include <iostream>
#include <fstream>
#include <cstdlib>

using namespace std;

int main(){
    double vetor[10];
    double num;

    cout<<"Informe 10 números menores que 100: " <<endl;
    for (int x = 0; x <= 9;){
        cout<<"Insira o " <<x+1 <<"º numero: ";
        cin>>num;
        if (num < 100){
            vetor[x] = num;
            x++;
        }else{
            cout<<"O número deve ser menor que 100, tente novamente." <<endl <<endl;
        }
    }

    ofstream arquivo;
    arquivo.open("numbers.txt");
    for (int y = 0; y <= 9; y++)
    {
        arquivo<<"["<<vetor[y] <<"] " <<endl;
    }
    arquivo.close();

    return 0;
}