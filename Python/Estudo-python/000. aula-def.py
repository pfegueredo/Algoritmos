def dadosPessoais(nome, idade, cidade):
    print("Seu nome é {}, você tem {} anos e mora em {}.".format(nome, idade, cidade))

dadosPessoais("Paulo", 38, "Curitiba")
# Saída: Seu nome é José, você tem 30 anos e mora em Maceió.

# Funções com resposta:
def somatorio(lista):
    soma = 0
    for item in lista:
        soma = soma + item
    return soma

numeros = [1, 2, 3, 4, 5]
soma_dos_numeros = somatorio(numeros)
print("A soma dos elementos da lista vale: ", soma_dos_numeros)

if somatorio(numeros) > 50:
    print("Que soma grande!")
else:
    print("Que soma pequena!")
    
'''
Saída:
A soma dos elementos da lista vale:  15
Que soma pequena!
'''

print("="*40)
# Função recursiva (função dentro dela):

def funcaoRecursiva(numero):
    if (numero != 1):
        funcaoRecursiva(numero - 1)
    print(numero)

print("Testando a função recursiva:")
funcaoRecursiva(10)

print("="*60)
# Args

def calcula_media(*args, margem): #Um asterisco tipo tupla / vários parametros
    soma = sum(args)
    media = soma / len(args)
    print(media+margem)

calcula_media(10, 12, 14, margem=0.4)

def info(**pessoa): #Dois asterisco tipo tupla / varios parametros
    print(pessoa)


info(nome="Paulo", sobrenome="Fegueredo")



#Calculo do volume da piscila
def piscina(prof, largura=4, comprimento=5):
    vol = prof*largura*comprimento
    return vol

infos = {'largura': 10, 'comprimento': 20}

volume = piscina(5, **infos)

print('O volume é: ', volume)