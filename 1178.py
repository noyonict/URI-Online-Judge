number = float(input())
for i in range(100):
    print('N[{}] = {:.04f}'.format(i, number))
    number /= 2
