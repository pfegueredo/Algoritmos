import csv

with open('tabelaExemplo.csv', 'w') as arquivo:
    escritor = csv.writer(arquivo, delimiter = ';', lineterminator = '\n') #criando um escritor
    lista = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    escritor.writerows(lista) # writerows escreve cada "sublista" da lista como uma linha

with open('tabelaExemplo.csv', "r") as arquivo:
    leitor = csv.reader(arquivo, delimiter = ';', lineterminator = '\n') #criando um leitor
    print("O conteúdo do arquivo é:")
    print(leitor)
    for linha in leitor:
        print(linha)