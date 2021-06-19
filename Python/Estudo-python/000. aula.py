##Uso do for e range

for x in range(6):
    print(x)

#Uso do dicionário

carros = {
    "modelo": "fusca",
    "ano": "2020",
    "cor": "azul"
}
#Adicionar novo item ao dicionario
carros["marca"]="Chevrolet"

#Atualizar um dicionario
carros["modelo"] = "Onix"

#Remove um item do dicionario
carros.pop("ano")

#Esvazia a lista
carros.clear()

if (carros.clear):
    print("A lista está vazia")
else:
    print(carros.get("marca") + " "+ carros.get("modelo"))

#Forma de usar IF Else em uma única linha
print("A lista está vazia") if carros.clear else print(carros.get("marca") + " "+ carros.get("modelo"))