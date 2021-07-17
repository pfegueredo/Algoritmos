#Tupla é imutavel

lista = ["teste", "oi"]
tupla = (1, 2, 5, 3)

tupla_convertida = tuple(lista) #converter pra tupla
print(type(tupla_convertida))

lista_recuperada = list(tupla_convertida) #converter pra lista

#lista_recuperada.insert()