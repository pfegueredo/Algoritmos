# Numero primo

a = int(input('Entre com o numero: '))
div = 0
for x in range(1,a+1):
    resto = a % x

    if resto == 0:
        div += 1        

if div == 2:
    print('O numero {} é primo'.format(x))
else:
    print('O numero {} não é primo'.format(x))