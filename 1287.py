user_input = input()
actual_int = ''
for i in user_input:
    if i == 'o' or i == 'O':
        actual_int += '0'
    elif i == 'l':
        actual_int += '1'
    elif i != ',' and i != ' ':
        actual_int += i

if actual_int.isdigit() and int(actual_int) <= 2147483647:
    print(int(actual_int))
else:
    print('error')
