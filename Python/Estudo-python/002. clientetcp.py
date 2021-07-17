import socket, sys

def main():
    try:
        s = socket.socket(socket.AF_INET, socket.SOCK_STREAM, 0)
    except socket.error as e:
        print('Conexão falhou!!!')
        print('Erro: {}'.format(e))
        sys.exit();

    print('Socket criado com sucesso')

    HostAlvo = input("Digite o IP ou hostname a ser conectado: ")
    PortaAlvo = input("Digite a porta a ser conectada: ")

    try:
        s.connect((HostAlvo, int(PortaAlvo)))
        print("Cliente TCP conectado com sucesso no Host: "+ HostAlvo)
        s.shutdown(2)
    except socket.error as e:
        print("Não foi possivel conectar ao host {} na porta {}".format(HostAlvo, PortaAlvo))
        print("Erro: {}".format(e))
        sys.exit() #Sair da aplicação em caso de erro.

if __name__ == "__main__":
    main()
