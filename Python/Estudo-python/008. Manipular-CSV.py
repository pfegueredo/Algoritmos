import csv

with open('brasilcovid.csv', 'r', encoding='utf-8') as arquivo_csv:
    leitor = csv.reader(arquivo_csv)
    cabecalho = next(leitor) #pula uma linha - não lendo o cabeçalho
    for linha in leitor:
        if int(linha[2]) > 1:
            print(linha)