print('Rombo normal:')
num = 8
if(num%2 == 0):
  num2 = int(num/2)
else:
  num2 = int((num+1)/2)

for i in range(num2, 0, -1):
  for j in range(i, num2):
    print('* ', end="")
  print('')
for i in range(0, num2):
  for j in range(i, num2):
    print ('* ',end="")
  print('')
  
print('\nRombo con forma:\n')

if(num%2 == 0):
  num +=1

for i in range(0, num, 2):
  for j in range(i+2,num, 2):
    print('. ', end='') #Remover '.' por ''
  for k in range(0, i+1):
    print('* ', end='')
  print('')
  
for i in range(num, 1, -2):
  for j in range(num+2, i, -2):
    print('. ', end='')
  for k in range(i-2, 0, -1):
    print('* ',end='')
  print('')
  