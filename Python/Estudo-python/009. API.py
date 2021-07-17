#Instalar a biblioteca para consultas API: pip install requests
# https://www.exchangerate-api.com/docs/free-exchange-rate-api
import requests

url = 'https://api.exchangerate-api.com/v6/latest'

req = requests.get(url)

print(req.status_code)

dados = req.json()

print(dados)

valor_reais = float(input('Informe o valor em reais a ser convertido: '))
cotacao = dados['rates']['BRL']
print(f"R$ {valor_reais} em dolar valem US$ {(valor_reais / cotacao):.2f}")
