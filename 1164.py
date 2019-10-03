n = int(input())
while n > 0:
    mul = 0
    x = int(input())
    for i in range(1, x):
        if x % i == 0:
            mul += i
    if mul == x:
        print(x, 'eh perfeito')
    else:
        print(x, 'nao eh perfeito')
    n -= 1
