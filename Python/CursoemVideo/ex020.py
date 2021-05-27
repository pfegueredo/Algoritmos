#O mesmo professor quer sortear a ordem de apresentação dos alunos.
#Faça um programa que leia o nome dos quatro alunos e mostre a ordem sorteada.

import random

a1 = str(input('Nome do aluno 1: '))
a2 = str(input('Nome do aluno 2: '))
a3 = str(input('Nome do aluno 3: '))
a4 = str(input('Nome do aluno 4: '))

lista = [a1, a2, a3, a4]

#Usado para embaralhar a lista:
random.shuffle(lista)

print('A ordem de apresentação será: ')
print(lista)
