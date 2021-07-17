#Cria um objeto de conexão com o arquivo:
#arquivo = open("dom-casmurro.txt", 'r', encoding='utf-8')
"""
#Cria um objeto para armazenar o conteudo do arquivo
texto = arquivo.read()
print(texto)
arquivo.close()
"""
""" -- Lendo linha a linha com while
linha = arquivo.readline()
while linha != '':
    print(linha, end='')
    linha = arquivo.readline()
arquivo.close()
"""

""" --Lendo linha a linha com for
for linha in arquivo:
    print(linha, end='')
arquivo.close()
"""

with open('dom-casmurro.txt', 'r', encoding='utf-8') as arquivo:
    texto = arquivo.read()
    print(texto)