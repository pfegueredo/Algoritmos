#Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos Dolares ela pode comprar.
#Considere U#1,00 = R$ 3,27
#Conversor de moedas- Reais para dolares
reais = float(input('Quanto dinheiro você tem na carteira? R$ '))
dolares = reais/3.27
print('Com {:.2f} reais, você pode comprar {:.2f} dolares'.format(reais, dolares))
