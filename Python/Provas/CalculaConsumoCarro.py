# IFBA – Instituto Federal da Bahia - Campus Salvador
# Tecnologia em Análise e Desenvolvimento de Sistemas

# Questão I (2,0)
# Escreva um programa em linguagem python que receba como entrada o percurso em
# quilômetros, o tipo do carro e informe o consumo estimado de combustível, sabendo-se
# que um carro tipo C faz 12 Km com um litro de gasolina, um tipo B faz 9 Km e o tipo A,
# 8 Km por litro

#print('Digite o percurso em km: ')
percurso = int(input('Digite  o percurso em km: '))
tipoCarro = input('Digite o tipo de carro: ')
consumo = 0

match(tipoCarro):
    case 'A':
        consumo = percurso / 8
        print('O carro tipo A consome ', consumo, 'litros para o percurso de', percurso, 'km')
    case 'B':
        consumo = percurso / 9
        print('O carro tipo B consome ', consumo, 'litros para o percurso de', percurso, 'km')
    case 'C':
        consumo = percurso / 12
        print('O carro tipo C consome ', consumo, 'litros para o percurso de', percurso, 'km')
    case _:
        print('Tipo de carro inválido')
