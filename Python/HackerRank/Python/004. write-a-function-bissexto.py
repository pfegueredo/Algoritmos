"""Determinar se um ano é bissexto
Entrada: um ano no formato aaaa
Saida: True or False
"""

def is_leap(year):
    leap = False
    
    # Write your logic here
    if ((year % 4 == 0) and (year % 100 !=0 or year % 400 == 0)):
        leap = True
    
    return leap

year = int(input())
print(is_leap(year))