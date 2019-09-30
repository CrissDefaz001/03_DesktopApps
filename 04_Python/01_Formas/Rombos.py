print('Rombo normal:')
num = 7
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
max = 7
if(max%2 != 0):
  max +=1  

for i in range(0, max, 2):
  for j in range(max, i, -2):
    #print(f'j:{j}')
    print('. ', end='') #Remover '.' por ''
  for k in range(i, 1, -1):
    #print(f'k:{k}')
    print('* ', end='')
  print('')
for i in range(max, 0, -2):
  for j in range(max, i, -2):
    print('. ', end='')
  for k in range(i, 1, -1):
    print('* ',end='')
  print('')