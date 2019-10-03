a = input()
b = input()
c = input()

l = [a, b, c]
w = ['A', 'B', 'C']
for i in range(3):
    for j in range(3):
        index = i + j
        if j == 2:
            print(w[j], '=', str(l[index % 3]))
        else:
            print(w[j], '=', str(l[index % 3]) + ',', end=' ')
