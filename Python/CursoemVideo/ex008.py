#Exercicio/Desafio 008
#Escreva um programa que leia um valor em metros e a exiba convertido em centimetros e milimetros
medida = int(input('Digite um valor em metros: '))
cent = medida * 100
mili = medida * 1000
print('O valor {} metros em centimetros é {} e em milimitros é {}'.format(medida,cent,mili))
