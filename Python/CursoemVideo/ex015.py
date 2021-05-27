#Escreva um programa que pergunte a quantidade de km percorrido por um
#carro alugado e a quantidade de duas oekis qyaus eke foi alugado. 
#Calculo o preço a pagar, sabendo que o carro custa R$ 60 por dia e R$ 0,15 por km rodado.

dias = int(input('Quantos dias alugados? R$ '))
km = float(input('Quantos Km rodados? '))
total = (dias * 60) + (km * 0.15)
print('O total a pagar?{}'.format(total))
