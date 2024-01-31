import numpy as np

a = np.random.randint(1 , 11 ,[3,4])
b = np.random.choice([10,20,30],[3,4])
print(a , a+b , a+10 , sep='\n\n')