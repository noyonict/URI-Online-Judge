a = input()
b = input()
c = input()

l_ = [a, b, c]
for i in range(4):
    for j in range(3):
        if i >= 3:
            print(l_[(i+j) % 3][:10], end='')
        else:
            print(l_[(i+j) % 3], end='')
    print()
