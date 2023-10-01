/*
2-	(Média – Valor: 1 ponto – PROCEDIMENTO e FUNÇÃO):  
Faça uma função que recebe por parâmetro o tempo de duração de uma caminhada 
em segundos e retorna também por parâmetro esse tempo em horas, minutos e segundos. 
Entretanto, é preciso uma outra subrotina (seja função ou procedimento) para validar 
esse dado que entrou. Se o dado entrado (em segundos) for menor que 2 horas, o programa 
deverá exibir uma mensagem falando que o funcionário está abaixo do tempo mínimo e o 
programa deve pedir uma nova entrada.
*/

#include <iostream>
#include <string>

using namespace std;

int segundos;
string tempoCaminhada(int segundos);
bool validacao(int segundos);
bool testeValidacao = false;

int main()
{
    while (testeValidacao == false)
    {
        cout << "Quantos segundos durou a caminhada? ";
        cin >> segundos;
        cout << tempoCaminhada(segundos);
    }

    return 0;
}

bool validacao(int segundos)
{
    if (segundos < 3600)
    {
        cout << endl << "Você está abaixo do tempo minimo, insira novamente!";
        return false;
    }
    else
    {
        return true;
    }
}

string tempoCaminhada(int segundos)
{
    testeValidacao = validacao(segundos);
    if (testeValidacao == false)
    {
        return "";
    }
    else
    {
        int minutos = 0;
        int totalMinutos = 0;
        int sobraSegundos = 0;
        if (segundos >= 60)
        {
            while (minutos < segundos)
            {
                minutos = minutos + 60;
                totalMinutos++;
            }
            sobraSegundos = segundos - (minutos - 60);
            if (sobraSegundos == 60)
            {
                sobraSegundos = 0;
            }
        }
        else
        {
            sobraSegundos = segundos;
        }

        int horas = 0;
        int totalHoras = 0;
        if (totalMinutos >= 60)
        {
            while (horas < totalMinutos)
            {
                horas = horas + 60;
                totalHoras++;
            }
        }

        totalMinutos = totalMinutos - (horas - 60);

        string $retorno = to_string(totalHoras) + " horas, " + to_string(totalMinutos) + " minutos e " + to_string(sobraSegundos) + " segundos.";
        return $retorno;
    }
}
