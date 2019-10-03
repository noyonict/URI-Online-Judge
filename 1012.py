#Python3 1012

userInput = input()
flag = 0
A = ''
B = ''
C = ''
for i in userInput:
    if i.isspace():
        flag += 1
    if flag == 0:
        A = A + i
    elif flag == 1:
        B = B + i
    elif flag == 2:
        C = C + i
A = float(A)
B = float(B)
C = float(C)
print('TRIANGULO: %.3f' % ((A * C)/2))
print('CIRCULO: %.3f' % (3.14159 * C * C))
print('TRAPEZIO: %.3f' % ((C * (A + B))/2))
print('QUADRADO: %.3f' % (B**2))
print('RETANGULO: %.3f' % (A * B))
