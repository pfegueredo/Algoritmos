#Faça um algoritmo que leia o preço de um produto e mostre seu novo preço com 5% de desconto

valorOriginal = float(input('Qual é o preco do produto? R$ '))
valorDesconto = valorOriginal - valorOriginal*0.05

print('O produto que custava R$ {}, na promoção com 5% de desconto, vai custar R$ {}'.format(valorOriginal, valorDesconto))
