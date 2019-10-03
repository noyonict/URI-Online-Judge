#Python3 1080

list = []
big = 0
for i in range(100):
    list.append(int(input()))
for i in range(99):
    if list[i] > list[i+1]:
        if list[i] > big:
            big = list[i]
            index = list.index(list[i])
    else:
        if list[i+1] > big:
            big = list[i+1]
            index = list.index(list[i+1])
print(big)
print(index+1)
