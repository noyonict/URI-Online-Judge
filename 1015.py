#Python3 1015

import math
firstInput = input()
flag1 = 0
x1 = ''
y1 = ''

for i in firstInput:
    if i.isspace():
        flag1 += 1
    if flag1 == 0:
        x1 = x1 + i
    elif flag1 == 1:
        y1 = y1 + i
x1 = float(x1)
y1 = float(y1)


secondInput = input()
flag2 = 0
x2 = ''
y2 = ''

for i in secondInput:
    if i.isspace():
        flag2 += 1
    if flag2==0:
        x2 = x2 + i
    elif flag2 == 1:
        y2 = y2 + i

x2 = float(x2)
y2 = float(y2)
Distance = math.sqrt(((x2 - x1) ** 2) + ((y2 - y1) ** 2))
print('%.4f' % Distance)

