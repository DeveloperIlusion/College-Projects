#include <iostream>
#include <iomanip>

using namespace std;

double holderNota = 0;

double listas[] = {0};
int quantidadeListas = 0;
char primeiraLista;

double totalNotaPrimeiroBimestre = 0;
double totalNotaSegundoBimestre = 0;

double totalExerciciosPrimeiroBimestre = 0;
double totalExerciciosSegundoBimestre = 0;
void totalExerciciosBimestre(int bimestre, double holderNota);

double notaProvas(int bimestre);
void listasDeExercicio(int quantidadeListas, char primeiraLista, int bimestre);
string aprovacao(double mediaFinal);

int main()
{
    cout<<"Você fez quantas listas de exercício no 1º bimestre? ";
    cin>>quantidadeListas;
    cout<<endl;
    
    cout<<"Você fez a primeira lista? Digite S para sim ou N para não. ";
    cin>>primeiraLista;
    cout<<endl;
    
    listasDeExercicio(quantidadeListas, primeiraLista, 1);
    totalNotaPrimeiroBimestre = totalExerciciosPrimeiroBimestre + notaProvas(1);
    
    cout<<fixed <<setprecision(2) <<"Nota final do 1º bimestre: " <<totalNotaPrimeiroBimestre <<endl <<endl;
    
    cout<<"Você fez quantas listas de exercício no 2º bimestre? ";
    cin>>quantidadeListas;
    cout<<endl;
    
    listasDeExercicio(quantidadeListas, primeiraLista, 2);
    totalNotaSegundoBimestre = totalExerciciosSegundoBimestre + notaProvas(2);
    
    cout<<fixed <<setprecision(2) <<"Nota final do 2º bimestre: " <<totalNotaSegundoBimestre <<endl <<endl;
    
    double mediaFinal = (totalNotaPrimeiroBimestre + totalNotaSegundoBimestre) / 2;
    
    cout<<fixed <<setprecision(2) <<"Sua média final do semestre é: " <<mediaFinal <<endl <<endl;
    
    cout<<aprovacao(mediaFinal);
    
    return 0;
}

double notaProvas(int bimestre)
{
    double notaProva;
    for (int count = 0; count < 2;) {
        cout<<"Qual foi sua nota na "<<count+1 <<"º prova do "<<bimestre <<"º bimestre? ";
        cin>>holderNota;
        cout<<endl;
        
        if (holderNota <= 4) {
            notaProva += holderNota;
            count++;
        } else {
            cout<<"As provas valem no máximo 41, não há como você ter tirado mais que isso, tente novamente!" <<endl <<endl;
            continue;
        }
    }
    
    return notaProva;
};

void listasDeExercicio(int quantidadeListas, char primeiraLista, int bimestre)
{
    for (int count = 0; count < quantidadeListas;) {
        if (primeiraLista == 'S' && count == 0) {
            cout<<"Insira a nota da " <<count+1 <<"ª lista: ";
            cin>>holderNota;
            cout<<endl;
            
            if (holderNota <= 1.00) {
                listas[count] = holderNota;
                primeiraLista = 'N';
                count++;
                totalExerciciosBimestre(bimestre, holderNota);
            } else {
                cout<<"Essa lista valia no máximo 1, não há como você ter tirado mais que isso, tente novamente!" <<endl <<endl;
                continue;
            }
        } else {
            cout<<"Insira a nota da " <<count+1 <<"ª lista: ";
            cin>>holderNota;
            cout<<endl;
            
            if (holderNota <= 0.50) {
                listas[count] = holderNota;
                count++;
                totalExerciciosBimestre(bimestre, holderNota);
            } else {
                cout<<"Essa lista valia no máximo 0,5; não há como você ter tirado mais que isso, tente novamente!" <<endl <<endl;
                continue;
            }
        }
    }
    
    quantidadeListas = 0;
};

void totalExerciciosBimestre(int bimestre, double holderNota) {
    switch(bimestre) {
        case 1:
            totalExerciciosPrimeiroBimestre += holderNota;
            break;
        case 2:
            totalExerciciosSegundoBimestre += holderNota;
            break;
        default:
            cout<<"Bimestre não informado";
            break;
    }
};

string aprovacao(double mediaFinal)
{
    if (mediaFinal >= 6) {
        return "Parabéns, você foi aprovado!";
    } else {
        return "Infelizmente você não foi aprovado.";
    }
};