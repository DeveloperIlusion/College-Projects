#include <iostream>

using namespace std;

int num;
string parOuImpar (int num);

int main()
{
    cout<<"Insira um número: ";
    cin>>num;
    cout<<endl<<endl;
    cout<<"Este número é " <<parOuImpar(num);

    return 0;
}

string parOuImpar (int num)
{
    if (num % 2 == 0) {
        return "par";
    } else {
        return "impar";
    }
};