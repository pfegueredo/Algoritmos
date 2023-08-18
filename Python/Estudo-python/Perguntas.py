print('SHOW DO MILHÃO\n')
print('Pergunta: Quantos lados tem um circulo? ')
print('1-Nenhum')
print('2-4 lados')
print('3-Não sei')
opcao = int(input('Digite: '))

match(opcao):
    case 1:
        print('Resposta certa');
    case 2:
        print('Resposta errada');
    case 3:
        print('Vá estudar');
    case _:
        print('Você não colocou nenhuma opção')
        
    
