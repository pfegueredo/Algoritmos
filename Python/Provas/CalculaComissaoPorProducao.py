# IFBA – Instituto Federal da Bahia - Campus Salvador

# Questão II (3,0)
# Na linha de montagem de uma fábrica existem 3 classes de operários:
# 1 - os que montam até 30 peças por mês;
# 2 - os que montam de 31 até 35 peças por mês;
# 3 - os que montam mais de 35 peças por mês.
# Os operários de classe 1 ganham salário mínimo. 
# Os da classe 2 ganham o mínimo mais uma comissão de 
# 3% (do salário mínimo) por peça montada acima das 30 iniciais, e os
# da classe 3, recebem o mínimo mais 5% por peça acima das 30 iniciais.
# Escreva um programa em linguagem python que receba o nome e a quantidade de peças montadas no mês por um operário. 
# Ao final o programa deve informar o nome, a classe e o salário bruto do operário

nome = input('Nome do funcionário: ')
qtdeProduzida = int(input('Digite a quantidade produzida: '))
salarioMinimo = 1320.0
salarioRecebido = 0

if(qtdeProduzida > 35):
    salarioRecebido = salarioMinimo  + (salarioMinimo * 0.05) * (qtdeProduzida - 30)  
elif(qtdeProduzida > 30 and qtdeProduzida <= 35):

    salarioRecebido = salarioMinimo  + (salarioMinimo * 0.03) * (qtdeProduzida - 30)  
else:
    salarioRecebido = salarioMinimo

print('O salario do ', nome, ' é ', salarioRecebido)

