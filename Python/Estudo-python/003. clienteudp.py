import socket

def main():
    try:
        s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM, 0) #Datagrama
    except socket.error as e:
        print('Conexão falhou!!!')
        print('Erro: {}'.format(e))
        sys.exit();

    print('Socket criado com sucesso')

    
    Host = '8.8.8.8'
    Porta = 5433
    Mensagem = 'Teste'

    try:
        print('Cliente ' + Mensagem)
        s.sendto(Mensagem.encode(), (Host, 5432))

        dados, servidor = s.recvfrom(4096)
        
    except socket.error as e:
        print("Não foi possivel conectar ao host {} na porta {}".format(HostAlvo, PortaAlvo))
        print("Erro: {}".format(e))
        sys.exit() #Sair da aplicação em caso de erro.

if __name__ == "__main__":
    main()
