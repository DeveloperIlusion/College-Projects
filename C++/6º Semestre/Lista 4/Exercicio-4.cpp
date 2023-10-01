/*
4 - Faça um programa com uma fila que simule um sistema operacional preemptivo ... 
Esse sistema deve ter 5 programas. Em um loop infinito, o programa deve mostrar qual programa está em 
execução no momento bem como mostrar o programa que está em espera (ou seja, o próximo a entrar em execução). 
*/

#include <stdio.h>
#include <unistd.h>
#include <iostream>
#include <queue>
#include <string>

using namespace std;

int ordenar();
int concatenar;
string concatenada;

int main()
{
    queue <string> programas;
    programas.push("Programa de Inicialização");
    programas.push("Programa de Pesquisa");
    programas.push("Programa de Interpretação");
    programas.push("Programa de Replicação");
    programas.push("Programa de Encerramento");
        
    while(!(programas.empty()))
    {
        cout<<programas.front() <<" está em execução!" <<endl;
        programas.push(programas.front());
        programas.pop();
        sleep(1);
        cout<<programas.front() <<" entrará em execução a seguir..." <<endl <<endl;
        sleep(1);
    }

    return 0;
}

