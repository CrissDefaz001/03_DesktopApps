# Triángulos:
# 1
print('Hacia arriba:')
num = 5
for i in range(num, 0, -1):
  for j in range(i, num):
    print ('*',end="")
  print('')

""" 
*
**
***
****
"""
  
# 2
print('\nHacia abajo:\n')
num = 5
for i in range(0, num):
  for j in range(i, num):
    print ('*',end="")
  print('')

""" 
*****
****
***
**
*
"""
# 3: Con formas
print('\nFormado hacia arriba:')
max = 10
for i in range(0, max, 2):
  for j in range(max, i, -2):
    print('  ', end='')
  for k in range(i, 1, -1):
    print('* ',end='')
  print('')
  
  """
        * 
      * * * 
    * * * * * 
  * * * * * * * 
  """
  
# 4: Forma hacia abajo:
print('\nFormado hacia abajo:\n')
max = 10
for i in range(max, 0, -2):
  for j in range(max, i, -2):
    print('  ', end='')
  for k in range(i, 1, -1):
    print('* ',end='')
  print('')
  
  """
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
  """
  