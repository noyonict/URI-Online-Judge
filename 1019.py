#Python3 1019

N = int(input())
seconds = N % 60
minites = int(N / 60)
hours = int(minites / 60)
minites = minites % 60
print(str(hours) + ':' + str(minites) + ':' + str(seconds))

