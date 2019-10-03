number = int(input())

for i in range(number):
    index_input = int(input())
    a, b = 0, 1
    for n in range(index_input+1):
        fib = a
        a += b
        a, b = b, a
    print('Fib({}) = {}'.format(index_input, fib))
