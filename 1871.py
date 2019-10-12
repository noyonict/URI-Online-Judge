while True:
    m, n = input().split()
    if int(m) == 0 == int(n):
        break
    add = str(int(m) + int(n)).replace('0', '')
    print(add)

