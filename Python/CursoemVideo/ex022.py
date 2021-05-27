# Crie um programa que leia o nome completo de uma pessoa e mostre:

# O nome com todas as letras maiusculas
# O nome com todas as minusculas
# Quantas letras ao todo (sem considerar espaços)
# Quantas letras tem o primeiro nome

nome = input(str('Digite seu nome completo: '))

print(end='\n')

print('Exibindo seu nome em maiusculo: ')
print(nome.upper())
print(end='\n')

print('Exibindo seu nome em minusculo: ')
print(nome.lower())
print(end='\n')

dividido = nome.split()


print('Quantas letras total tem seu nome (sem espaço): ', len(dividido[0]+dividido[1]))
print(end='\n')

print('Quantas letras tem seu primeiro nome: ', len(dividido[0]))
