#import json
import datetime
import os
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
import smtplib

message = 'vazio'

with open('hosts.txt', 'r', encoding='utf-8') as arquivo:

    for hostname in arquivo:
        print(hostname)
        response = os.system("ping -c 1 " + hostname)
        if response == 0:
           message = 'Todos os hosts estão ativos'
        else:
            message = "Os seguintes dispositivos não responderam {} ".format(hostname, datetime.date.today())
    arquivo.close()



# Corpo da mensagem do email #
msg = MIMEMultipart()



# Credenciais e assunto do email #
password = ('P@ul0983')
msg['From'] = ('sistemastecnologiabrasil@gmail.com')
msg ['To'] = ('paulo.fegueredo@gmail.com')
msg ['Subject'] = "Monitor de hosts ativos" # Assunto do email

# Monta conexão e envia o email #
msg.attach(MIMEText(message, 'plain'))
server = smtplib.SMTP('smtp.gmail.com', port=587)
server.starttls()
server.login(msg['From'], password)
server.sendmail(msg['From'], msg['To'], msg.as_string())
server.quit()