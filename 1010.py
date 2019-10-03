#Python3 1010

p1code = input()
flag = 0
a = ''
b = ''
c = ''
for i in p1code:
    if i.isspace():
        flag += 1
    if flag == 0:
        a = a + i
    elif flag == 1:
        b = b + i
    elif flag == 2:
        c = c + i
a = int(a)
b = int(b)
c = float(c)

p2code = input()
flag2 = 0
x = ''
y = ''
z = ''
for i in p2code:
    if i.isspace():
        flag2 += 1
    if flag2==0:
        x = x + i
    elif flag2 == 1:
        y = y + i
    elif flag2 == 2:
        z = z + i
x = int(x)
y = int(y)
z = float(z)
print('VALOR A PAGAR: R$ %.2f' % ((b*c)+(y*z)))
