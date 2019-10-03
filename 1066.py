#Python3 1066

l = []
even = 0
odd = 0
pos = 0
neg = 0
for i in range(5):
    l.insert(i, int(input()))
    if l[i] % 2 == 0:
        even += 1
    else:
        odd += 1
    if l[i]>0:
        pos += 1
    elif l[i]<0:
        neg += 1

print(even, 'valor(es) par(es)')
print(odd, 'valor(es) impar(es)')
print(pos, 'valor(es) positivo(s)')
print(neg, 'valor(es) negativo(s)')

