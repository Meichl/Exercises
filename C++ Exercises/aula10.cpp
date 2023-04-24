#include <iostream>
#include <cstdlib>

using namespace std;

int main()
{
    int n1, n2, res;
    char opc;

    inicio: //uso com o goto

    system("cls"); //Comando de limpar a tela que vem da biblioteca <cstdlib> ou <stdlib.h>

    cout << "Digite o valor da primeira nota: ";
    cin >> n1;
    cout << "Digite o valor da segunda nota: ";
    cin >> n2;

    res = n1 + n2;

    /*
        >=60          Aprovado
        >= 40 e < 60  Recuperação
        <40           Reprovado
    */

    cout << "A soma das duas notas deu: " << res;
    if (res >= 60){
        cout << "\nAluno Aprovado\n";
    } else if(res >= 40) {
        cout << "\nAluno em Recuperacao\n";
    } else {
        cout << "\nAluno Reprovado\n";
    }

    cout <<"\nDigitar outras notas?[s/n]: ";
    cin >> opc;

    if(opc == 's' or opc == 'S'){
        goto inicio; //Comando de repetição não muito utilizado, ele vai ir pro inicio:
    } else {
        cout << "Obrigado por calcular";
    }

    return 0;
}