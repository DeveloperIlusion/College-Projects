/*
4-	(Difícil – Valor: 1 ponto – FUNÇÃO, PROCEDIMENTOS e ARQUIVOS): 
O Índice Big Mac é um indicador econômico calculado a partir do valor do 
famoso lanche da rede de fast food McDonalds. O sanduíche é utilizado para 
compor uma fórmula que mede o poder de compra de determinada moeda. Esse índice 
é baseado na teoria da Paridade do Poder de Compra (PPC).
O usuário deve entrar com o valor do dólar referente ao real, o valor do dólar 
referente ao peso argentino e o valor do dólar referente ao euro. Faça 3 funções 
(um para cada país) que retorne o poder de compra dentro desse país (ou seja, 
quantos bigmacs um salário-mínimo pode comprar). 

Brasil: salário-mínimo, 1212 reais / Preço do bigmac: 5,15 Dólares
Argentina: salário-mínimo 31931 pesos / Preço do bigmac 7,30 Dólares
Portugal: salário-mínimo, 822 euros / Preço do bigmac: 5,68 Dólares 

Todos os resultados de cada país (quantos bigmacs é possível comprar com um salário-mínimo), 
deverão ser armazenados em um bloco de notas através de um procedimento 
em um arquivo de txt para cada país.
*/

#include <iostream>
#include <fstream>
#include <cstdlib>

using namespace std;

int brasilBigmacs;
int argentinaBigmacs;
int portugalBigmacs;
double dolarParaReal;
double dolarParaPeso;
double dolarParaEuro;

int bigMacBrasil (double dolar);
int bigMacArgentina (double dolar);
int bigMacPortugal (double dolar);

int main()
{
    cout<<"Insira o valor do dólar para o real: ";
    cin>>dolarParaReal;
    cout<<"Insira o valor do dólar para o peso: ";
    cin>>dolarParaPeso;
    cout<<"Insira o valor do dólar para o euro: ";
    cin>>dolarParaEuro;
    
    brasilBigmacs = bigMacBrasil(dolarParaReal);
    
    ofstream brasil;
    brasil.open("brasil.txt");
    brasil<<brasilBigmacs;
    brasil.close();
    
    argentinaBigmacs = bigMacArgentina(dolarParaPeso);
    
    ofstream argentina;
    argentina.open("argentina.txt");
    argentina<<argentinaBigmacs;
    argentina.close();
    
    portugalBigmacs = bigMacPortugal(dolarParaEuro);
    
    ofstream portugal;
    portugal.open("portugal.txt");
    portugal<<portugalBigmacs;
    portugal.close();
    
    return 0;
}

int bigMacBrasil (double dolar)
{
    return (1212 / dolar) / 5.15;
}

int bigMacArgentina (double dolar)
{
    return (31931 / dolar) / 7.30;
}

int bigMacPortugal (double dolar)
{
    return (822 / dolar) / 5.68;
}
