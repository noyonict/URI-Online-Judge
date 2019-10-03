n = int(input())
x = 0
y = 1
fib = 0
for i in range(n):
    if i != (n-1):
        print(fib, end=' ')
    else:
        print(fib)
    x, y = y, fib
    fib = x + y
