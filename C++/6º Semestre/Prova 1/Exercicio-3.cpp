/*
3 - (Média – Valor : 1 ponto - ARQUIVOS) : Faça um programa que receba 2 
informações, 1 informação sendo a altura(em metros) da pessoa e a outra, 
o peso(em kg) dessa pessoa.Através da fórmula : IMC = peso(kg) / [altura x altura(m)],
faça o cálculo do IMC(índice de massa corpórea) e o armazene em um arquivo de txt.                                                                                                                                                                                                                                           
O programa deve ler o IMC nesse arquivo e escrever um novo arquivo txt 
com a condição de IMC da pessoa sendo : Desnutrição < 18,                                                                                                                                                                                              5 normalidade;
Normalidade : de 18, 5 até 24, 9;
Sobrepeso : de 25 até 29, 9;
Obesidade : > 30;
*/

#include <iostream>
#include <fstream>
#include <string>
#include <cstdlib>

using namespace std;

double altura;
double peso;
double IMC;
string imcRegistrado;
double recoveredIMC;
string condicao;

int main()
{
    ofstream imcArq;
    imcArq.open("imc.txt");
    cout << "Insira seu peso: ";
    cin >> peso;
    cout << "Insira sua altura: ";
    cin >> altura;
    IMC = peso / (altura * altura);
    imcArq << IMC;
    imcArq.close();

    ifstream openImcArq;
    openImcArq.open("imc.txt");
    getline(openImcArq, imcRegistrado);
    openImcArq.close();
    recoveredIMC = stod(imcRegistrado);

    ofstream resultIMC;
    resultIMC.open("resultIMC.txt");
    if (recoveredIMC < 18.5)
    {
        condicao = "Desnutrição.";
    }
    else if (recoveredIMC < 24.9)
    {
        condicao = "Normalidade.";
    }
    else if (recoveredIMC < 29.9)
    {
        condicao = "Sobrepeso.";
    }
    else
    {
        condicao = "Obesidade.";
    }
    resultIMC << condicao;
    resultIMC.close();

    return 0;
}
