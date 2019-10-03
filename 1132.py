x = int(input())
y = int(input())
total = 0
if x>y:
    big = x
    small = y
else:
    big = y
    small = x
for i in range(small, big+1):
    if(i%13!=0):
        total = total + i
print(str(total))
