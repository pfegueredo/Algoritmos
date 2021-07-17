conjunto1 = {1, 2, 3, 4}
conjunto2 = {4, 5, 6}
conjunto_uniao = conjunto1.union(conjunto2)
conjunto_interseccao = conjunto1.intersection(conjunto2)
conj_diferenca1 = conjunto1.difference(conjunto2)
conj_diferenca2 = conjunto2.difference(conjunto1)
conj_dif_simetrica = conjunto1.symmetric_difference(conjunto2)
print('Uniao: {}'.format(conjunto_uniao))
print('Intersecção: {}'.format(conjunto_interseccao))
print('Diferença 1: {}'.format(conj_diferenca1))
print('Diferença 2: {}'.format(conj_diferenca2))
print('Diferença Simétrica: {}'.format(conj_dif_simetrica))

conj_a = {1, 2, 3}
conj_b = {1, 2, 3, 4, 5}
conj_subset = conj_a.issubset(conj_b)
print('A é subconjunto de B: {}'.format(conj_subset))


#Conversão de Lista para Conjunto
lista = ["cachorro", "cachorro", "gato", "elefante"]
conjunto = set(lista)


# # valores repetidos não são considerados
# conjunto = {1, 1, 2, 2, 2, 3}

# conjunto.add(5)
# conjunto.discard(2) #remove um elemento do conjunto
# print(type(conjunto))

# print(conjunto)