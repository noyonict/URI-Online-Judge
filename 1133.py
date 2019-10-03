x = int(input())
y = int(input())
if x > y:
    big = x
    small = y
else:
    big = y
    small = x
for i in range(small+1, big):
    if i % 5 == 2 or i % 5 == 3:
        print(str(i))

