#Python3 1036

import math
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
try:
    R1 = -(B - math.sqrt((B*B)-(4*A*C)))/(2*A)
    R2 = -(B + math.sqrt((B*B)-(4*A*C)))/(2*A)
    print('R1 = %.5f' % R1)
    print('R2 = %.5f' % R2)
except:
    print('Impossivel calcular')

