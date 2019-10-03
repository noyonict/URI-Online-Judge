array = []

for i in range(20):
    number = int(input())
    array.append(number)

count = 0
for i in range(19, -1, -1):
    print('N[{}] = {}'.format(count, array[i]))
    count += 1
