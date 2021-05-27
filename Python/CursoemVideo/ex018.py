#Faça um programa que leia um angulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse angulo
from math import sin,cos,tan, radians

angulo = int(input('Informe o valor do angulo: '))

cosseno = cos(radians(angulo))
print('O COSSENO do angulo {} é {:.2f}: '.format(angulo, cosseno))

seno = sin(radians(angulo))
print('O SENO do angulo {} é {:.2f}: '.format(angulo, seno))

tangente = tan(radians(angulo))
print('A TANGENTE do angulo {} é {:.2f}: '.format(angulo,tangente))
