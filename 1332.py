for i in range(int(input())):
    word = input()
    if len(word) == 3:
        if word[0] == 'o' and word[-1] == 'e':
            print(1)
        elif word[0] == 'o' and word[1] == 'n':
            print(1)
        elif word[1] == 'n' and word[-1] == 'e':
            print(1)
        else:
            print(2)
    else:
        print(3)

