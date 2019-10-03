#Python3 1071

a = int(input())
b = int(input())
sum = 0
if a != b:
    if a > b:
        if b % 2 == 0:
            b += 1
        else:
            b += 2

        for i in range(b, a, 2):
            sum += i
    else:
        if a % 2 == 0:
            a += 1
        else:
            a += 2
        for i in range(a, b, 2):
            sum += i

print(sum)
