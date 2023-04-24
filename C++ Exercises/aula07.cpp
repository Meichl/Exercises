#include <iostream>

using namespace std;

int main ()
{
    int n1, n2;

    n1 = 10;
    n2 = 10;

    //adicionar +1 na variavel ou algo do tipo
    //n1 = n1 + 1;
    //n1+=1; (serve pra qualquer operador matematico)
    //n1++; (sempre vai aumentar ou diminuir 1 unidade)
    //n1++; ou ++n1; pós-fixado e pré-fixado ou pré,pós-incremento
    //pós incrimento = aumenta a variavel após a impressão
    //pré incremento = aumenta a variavel antes da impressão
    
    cout << n1 << "\n\n";


    cout << ++n1 << "\n\n";

    return 0;
}