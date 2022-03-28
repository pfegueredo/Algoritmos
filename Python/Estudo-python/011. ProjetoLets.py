import csv
import datetime as dt
import requests as r
from typing import final
from PIL import Image
from IPython.display import display
from requests.api import options
from urllib.parse import quote



url = 'https://api.covid19api.com/dayone/country/brazil'
resp = r.get(url)

#print(resp.status_code)

raw_data = resp.json()


final_data = []
for obs in raw_data:
    final_data.append([obs['Confirmed'], obs['Deaths'], obs['Recovered'], obs['Active'], obs['Date']])

final_data.insert(0, ['Confirmados', 'Obitos', 'Recuperados', 'Ativos', 'Data'])
print(final_data)

CONFIRMADOS = 0
OBITOS = 1
RECUPERADOS = 2
ATIVOS = 3
DATA = 4

for i in range(1, len(final_data)):
    final_data[i][DATA] = final_data[i][DATA][:10]




with open('arquivo_covid.csv', 'w') as file:
    escritor = csv.writer(file)
    escritor.writerows(final_data)

for i in range(1, len(final_data)):
    final_data[i][DATA] = dt.datetime.strptime(final_data[i][DATA], '%Y-%m-%d')

#print(final_data)
"""
def definir_datasets(y, labels):
    if type(y[0]) == list:
        datasets = []
        for i in range(len(y)):
            datasets.append({
                'label': labels[i],
                'data': y[i]
            })
        return datasets
    else:
        return [
            {
                'label': labels[0],
                'data': y
            }
        ]

def definir_titulo(title=''):
    if title != '':
        display = 'true'
    else:
        display = 'false'
    return {
        'title': title,
        'display': display
    }

def criar_grafico(x, y, labels, kind='bar', title=''):

    datasets = definir_datasets(y, labels)
    options = definir_titulo(title)

    chart = {
        'type': kind,
        'data': {
            'labels': x,
            'datasets': datasets
        },
        'options': options
    }
    return chart


def get_api_chart(chart):
    url_base = 'https://quickchart.io/chart'
    resp = r.get(f'{url_base}?c={str(chart)}')
    return resp.content

def salvar_image(caminho, content):
    with open(caminho, 'wb') as imagem:
        imagem.write(content)

def mostra_imagem(caminho):
    img_pil = Image.open(caminho)
    display(img_pil)

y_data_1 = []
for obs in final_data[1::10]:
    y_data_1.append(obs[CONFIRMADOS])

y_data_2 = []
for obs in final_data[1::10]:
    y_data_2.append(obs[RECUPERADOS])

labels = ['Confirmados', 'Recuperados']

x = []
for obs in final_data[1::10]:
    x.append(obs[DATA].strftime('%d/%m/%Y'))

chart = criar_grafico(x, [y_data_1, y_data_2], labels, title='Gráfico Confirmados x Recuperados')
chart_content = get_api_chart(chart)
salvar_image('meu_primeiro_grafico.png', chart_content)
mostra_imagem('meu_primeiro_grafico.png')

def get_api_qrcode(link):
    text = quote(link)
    url_base = 'https://quickchart.io/qr'
    resp = r.get(f'{url_base}?text={text}')
    return resp.content

url_base = url_base = 'https://quickchart.io/chart'
link = f'{url_base}?c={str(chart)}'
salvar_image('qr-code.png', get_api_qrcode(link))
mostra_imagem('qr-code.png')
"""