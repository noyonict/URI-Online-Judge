c = int(input())

for line in range(c):
    user_input = input()
    n, m = user_input.split(' ')
    result = int(n)**int(m)
    print(len(str(result)))
