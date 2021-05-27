#Crie um programa que leia um número Real qualquer e mostra na tela a sua porção inteira.
#Exemplo: Digite um numero: 6.127, que tem a parte inteira 6.

from math import floor

num = float(input('Digite um valor no formato #.##: '))
inteiro = floor(num)
print('A parte inteira de {} é {}.'.format(num, inteiro))
