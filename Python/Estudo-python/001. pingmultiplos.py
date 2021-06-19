import os, time 

with open('hosts.txt') as file: #abre o arquivo
    conteudo_arquivo = file.read() #carrega o resulado para a variavel conteudo_arquivo
    conteudo_arquivo = conteudo_arquivo.splitlines() #separa a variarel por linha

    for hosts in conteudo_arquivo:
        print('Verificando o host: ', hosts)
        print('-'*60)
        os.system('ping -n 2 {}'.format(hosts))
        print('-'*60)
        time.sleep(5) #Pertence a biblioteca time