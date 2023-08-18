import psycopg2

try:
    conexao = psycopg2.connect(database = "postgres", 
                           host = "localhost",
                           user = "postgres",
                           password = "paulo83",
                           port = "5432")
except:
    print('Ocorreu um erro ao tentar conectar com o BD')

class CalculaIR:
    def __init__(self, salario, ir, desconto):
        self.salario = salario
        self.ir = ir
        self.desconto = desconto

salario = 1000
def imprimirsalario(self):
    salario = float(input('Digite o valor do salario: '))

    if(salario > 4664.68):
        ir = (salario*27.5)/100
        print(ir)
    elif((salario >= 3751.06) and (salario <= 4664.68)):
        ir = (salario*22.5)/100
        print(ir)
    elif((salario >= 2826.66) and (salario <= 3751.05)):
        ir = (salario*7.5)/100
    elif((salario >= 1903.99) and (salario <= 2826.65)):
        ir = (salario*7.5)/100
    else:
        ir = 0


    print('Salário bruto: ', salario)
    print('Valor a ser descontado: ', ir)
    print('Salario líquido: ', (salario-ir))

imprimirsalario(salario)
print(conexao.info)
cursor = conexao.cursor()
contato = cursor.execute('select nome, email from contato;')


print(cursor.fetchall())