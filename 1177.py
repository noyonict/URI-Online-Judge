number = int(input())
print_number = 0
for i in range(1000):
    if number == print_number:
        print_number = 0
    print('N[{}] = {}'.format(i, print_number))
    print_number += 1
