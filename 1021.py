#Python3 1021

a = float(input())
print('NOTAS:')
print(int(a / 100), 'nota(s) de R$ 100.00')
a = a % 100
print(int( a / 50), 'nota(s) de R$ 50.00')
a = a % 50
print((int(a / 20)), 'nota(s) de R$ 20.00')
a = a % 20
print(int(a / 10), 'nota(s) de R$ 10.00')
a = a % 10
print(int(a / 5), 'nota(s) de R$ 5.00')
a = a % 5
print(int(a / 2), 'nota(s) de R$ 2.00')
print('MOEDAS:')
a = a % 2
print(int(a), 'moeda(s) de R$ 1.00')
a = a % 1
print(int(a / .50), 'moeda(s) de R$ 0.50')
a = a % .50
print(int(a / .25), 'moeda(s) de R$ 0.25')
a = a % .25
print(int(a / .10), 'moeda(s) de R$ 0.10')
a = a % .10
print(int(a / .05), 'moeda(s) de R$ 0.05')
a = a % .05
a = round(a, 2)
print(int(a / .01), 'moeda(s) de R$ 0.01')
