alcohol = 0
gasoline = 0
diesel = 0
end = 0
while end != 4:
    end = int(input())
    if end == 1:
        alcohol += 1
    elif end == 2:
        gasoline += 1
    elif end == 3:
        diesel += 1
    elif end == 4:
        break
print('MUITO OBRIGADO')
print('Alcool: ' + str(alcohol))
print('Gasolina: ' + str(gasoline))
print('Diesel: ' + str(diesel))
