for i in range(int(input())):
    a, b = input().split()
    final = ''
    extra = ''
    a_len, b_len = len(a), len(b)
    if a_len > b_len:
        extra = a[b_len:]
        a = a[:b_len]
    elif a_len < b_len:
        extra = b[a_len:]
        b = b[:a_len]

    for c in range(len(a)):
        final += a[c] + b[c]

    if extra:
        final += extra

    print(final)
