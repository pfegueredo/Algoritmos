"""Faça um programa que leia um angulo qualquer e mostre na tela o valor do seno, 
cosseno e tangente desse angulo """

from math import sin,cos,tan, radians

angulo = int(input('Informe o valor do angulo: '))

seno = sin(radians(angulo))
cosseno = cos(radians(angulo))
tangente = tan(radians(angulo))

print('O SENO do angulo {} é {:.2f}: \n'.format(angulo, seno))
print('O COSSENO do angulo {} é {:.2f}: \n '.format(angulo, cosseno))
print('A TANGENTE do angulo {} é {:.2f}: \n '.format(angulo,tangente))
