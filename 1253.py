for i in range(int(input())):
    first_line = input()
    second_line = int(input())
    new_string = ''
    for c in first_line:
        new_c = ord(c) - second_line
        if new_c < 65:
            new_c += 26
        new_string += chr(new_c)
    print(new_string)

