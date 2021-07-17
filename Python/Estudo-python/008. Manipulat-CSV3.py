#Usando dicionários
import csv

with open('email.csv', 'r') as emails:
    leitor = csv.DictReader(emails, delimiter=';') #a primeira linha é lida como um cabeçalho
    for linha in leitor:
        print(linha['Login email']) #podemos chamar um valor específico de cada linha pela chave no cabeçallho


with open('names.csv', 'w', newline='') as csvfile:
    chaves = ['first_name', 'last_name'] # definimos o cabeçalho
    writer = csv.DictWriter(csvfile, fieldnames=chaves) # especificamos o cabeçalho

    writer.writeheader() # escrevemos o cabeçalho
    writer.writerow({'first_name': 'Senhor', 'last_name': 'Batata'}) # escrevemos linhas com as chaves e valores
    writer.writerow({'first_name': 'Will', 'last_name': 'Smith'})
    writer.writerow({'first_name': 'Elon', 'last_name': 'Musk'})