#include <iostream>

using namespace std;

int num1, num2; // Variaveis globais

int main()
{
    // Operadores matematicos: +  -  /  *  %  ()

    int num3, num4; // Variaveis Locais
    int res, res2;

    num1 = 11;
    num2 = 3;
    num3 = 5;
    num4 = 2;

    // res = (num1 + num2 + num3 + num4) * num3 / num4;
    res = num1 / num2;
    res2 = num1 % num2;

    cout << "Div: " << res << endl;
    cout << "Resto da div: " << res2 << endl;

    // cout << "A soma das variaveis deu: " << res << "\n\n";

    return 0;
}