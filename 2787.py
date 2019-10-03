L = int(input())
C = int(input())

if L % 2 == 0:
    if C % 2 == 0:
        print('1')
    else:
        print('0')
else:
    if C % 2 == 0:
        print('0')
    else:
        print('1')
