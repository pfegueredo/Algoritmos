#Faça um programa que leia o comprimento oposto e do cateto adjacente de um triangulo retangulo.
#Calcule e mostre o comprimento da hipotenusa

import math

cateto1 = float(input('Qual o valor do cateto 1? '))
cateto2 = float(input('Qual o valor do cateto 2? '))
hipotenusa = math.hypot(cateto1, cateto2)
hipotenusa2 = math.sqrt((cateto1*cateto1)+(cateto2*cateto2))

#Forma 1                        
print('O valor da hipotenousa é {:.2f}.'.format(hipotenusa))

#Forma 2
print('O valor da hipotenousa2 é {:.2f}.'.format(hipotenusa2))

