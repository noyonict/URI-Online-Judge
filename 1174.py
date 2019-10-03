array = []

for i in range(100):
    number = float(input())
    array.append(number)
    if number <= 10:
        print('A[{}] = {:.1f}'.format(i, number))
