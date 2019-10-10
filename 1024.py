for i in range(int(input())):
    msg = input()
    new_msg = ''
    for l in msg:
        if l.isalpha():
            new_l = chr(ord(l) + 3)
            new_msg += new_l
        else:
            new_msg += l
    new_msg = new_msg[::-1]
    print(new_msg[:len(new_msg)//2], end='')
    final_msg = ''
    for j in new_msg[len(new_msg)//2:]:
        final_msg += chr(ord(j) - 1)
    print(final_msg)
