#Exercicio/Desafio 009
#Faça um programa que leia um número e mostre na tela a sua tabuada

n1 = int(input('Digite um número: '))
x = 1
while x <= 10:
    print(n1,' x ', x, '  = ', x*n1)
    x=x+1
