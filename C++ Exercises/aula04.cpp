#include <iostream>

using namespace std;

int main()
{
    // TIPO NOME;
    // TIPO NOME = VALOR;

    int numeros;      // 10, 25, -3, 0
    char letra = 'A'; // 'F', 'A', 'B'
    /*char letras[20];      Transformando Char em vetor, com até 20 letras */
    double numerosreais = 4.9999; // 2.5 ou 2,5 numeros decimais, 2.488899
    float numerosreais2 = 4.9999; // menor precisão que o double, mas funciona igual, por exemplo, ele arredonda 4,66666 pra 4,7
    bool verdadeiroufalso = true; // Verdadeiro=true e falso=false
    string texto = "Bom dia?";    // Ele recebe textos, frases. "Ola mundo"

    cout << "Digite o numero de vidas: ";
    cin >> numeros; // cin = usuario digitar, mesma coisa que o input do Python
    cout << numeros;

    /* cout << numeros << endl;
     cout << letra << "\n";
     cout << numerosreais << endl;
     cout << numerosreais2 << "\n";
     cout << verdadeiroufalso << endl;
     cout << texto << "\n";
     */

    return 0;
}