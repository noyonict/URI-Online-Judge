#Python3 1013

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
A = int(A)
B = int(B)
C = int(C)
if A>B and A>C:
    print(A, 'eh o maior')
elif B>A and B>C:
    print(B, 'eh o maior')
else:
    print(C, 'eh o maior')


