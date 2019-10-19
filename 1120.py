while True:
    d, n = input().split()
    if int(d) == 0 == int(n):
        break
    new_value = str(n).replace(d, '')
    if not new_value:
        new_value = 0
    print(int(new_value))
