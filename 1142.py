n = int(input())
printedNumber = 1
for i in range(n*4):
    if printedNumber % 4 != 0:
        print(printedNumber, end=' ')
    else:
        print('PUM')
    printedNumber += 1
