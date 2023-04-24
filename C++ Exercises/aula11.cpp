/*  AND = &&
    OR = ||
    NOT = !
    1 = True
    0 = False
 */

#include <iostream>

using namespace std;

int main()
{
    int num;
    num = 0; /* 0 é false e 1 é true */

    /*cout << "Digite um numero: ";
    cin >> num; */

    if (!num)
    {
        cout << "\n\nValor aceito\n";
    }
    else
    {
        cout << "\nValor nao aceito";
    }
    return 0;
}