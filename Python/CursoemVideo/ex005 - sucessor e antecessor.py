#Faça um programa que leia um número inteiro e mostre na tela o seu sucessor e seu antecessor
n1 = int(input('Digite um número: '))
sucessor = n1+1
antecessor= n1 - 1
print('O sucessor de {} é {}'.format(n1,sucessor))
print('O antecessor de {} é {}'.format(n1,antecessor))
