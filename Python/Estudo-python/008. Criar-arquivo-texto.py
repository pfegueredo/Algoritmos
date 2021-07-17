#Cria ou sobrescreve um arquivo
with open('readme.txt', 'w', encoding='utf-8') as arquivo:
    arquivo.write('Escrita no arquivo usando Python\n')

#Cria um novo arquivo ou Adiciona conteudo a um arquivo existente.
with open('readme.txt', 'a', encoding='utf-8') as arquivo:
    arquivo.write('Escrita no arquivo usando Python 3.7\n')
