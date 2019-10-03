#Python3 1020

days = int(input())
y = int(days / 365)
m = int((days % 365) / 30)
d = int((days % 365) % 30)
print(y,'ano(s)')
print(m,'mes(es)')
print(d,'dia(s)')
