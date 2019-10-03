x = int(input())
t = int(input())
count = 1
while x >= t:
    t = int(input())

result = x
while t > result:
    x += 1
    result += (x-1)
    count += 1

print(count)
