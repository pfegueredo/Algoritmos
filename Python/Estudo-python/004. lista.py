lista = [1, 3, 5]
lista_animais = ["gato", "coelho", "cavalo"]
print(type(lista))
print(lista)

for x in lista_animais:
    print(x)

print("A soma da lista é: {}".format(sum(lista)))
print("O maior valor da lista é: {}".format(max(lista)))
print("O menor valor da lista é: {}".format(min(lista)))
print("O menor valor da lista é (ordem alfabetica): {}".format(min(lista_animais)))

if 'lobo' in lista_animais:
    print("Já existe o lobo na lista")
else:
    print("Não existe o lobo na lista. Será incluido")
    lista_animais.append('lobo')
    print(lista_animais)

# lista_animais.pop() #Retira o ultimo elemento
# lista_animais.pop(1) #Retira o elemento na posicao indicada
# lista_animais.remove('cavalo')

nova_lista_animal = lista_animais * 2
nova_lista_animal.sort()
nova_lista_animal.reverse()
print(nova_lista_animal)