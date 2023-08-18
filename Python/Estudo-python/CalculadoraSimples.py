print('Calculadora Simples')

try:
    num1 = float(input('Digite o primeiro número: '))
    operador = input('Digite a operação: ')
    num2 = float(input('Digite o segundo número: '))
    resultado = 0
    
    match(operador):
        case '+':
            resultado = num1 + num2
        case '-':
            resultado = num1 - num2
        case '/':
            if num2 == 0:
                print('Não é possivel dividir por 0')
            else:
                resultado = num1 / num2
        case '*':
            resultado = num1*num2
        case _:
            print: 'O operador digitado foi inválido'

except:
    print('Ocorreu um erro')

finally:
 #   print('Fim do programa')
 print('O resultado da operação é: ', resultado)
