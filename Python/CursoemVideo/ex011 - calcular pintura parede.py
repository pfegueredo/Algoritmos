#Calcular a quantidade de tinta utilizado (em litros) para pintar uma parede, baseado nas medidas de altura e largura da parede.
#Deve tambem calcular a área 
#A cada 2 metros de parede, precisa de 1 litro de tinta.

largura = float(input('Largura da Parede: '))
altura = float(input('Altura da Parede: '))
area = largura*altura
tinta = area / 2
print('Sua parede tem a dimensão de {}x{} e sua área é de {}m²'.format(largura, altura, area))

print('Para pintar essa parede, você precisará de {} litros de tinta.'.format(tinta))
