num = (int(input('Digite um número: ')), int(input('Digite outro número: ')), int(input('Digite mais um número: ')),
       int(input('Digite o ultimo número: ')))

print(f'Foram digitados os valores {num}')

print(f'O valor 9 foi digitado {num.count(9)} vezes.')

if 3 in num:
    print(f'O valor 3 apareceu na posição {num.index(3)+1}')
else:
    print('O valor 3 não foi digitado.')

print('Os valores pares digitados foram ', end='')
for n in num:
    if n % 2 == 0:
        print(n, end=' ')