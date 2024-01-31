import numpy as np
import pandas as pd
#import random 

#R = random.randint(1,9)
#while True:
#    B = int(input("Enter num "))
#    print(R)
#    if B == R:
#        print("correct")
#        break
#    else:
#        continue 


#F = int(input("Enter Floor "))
#student = []
#student = np.floor[F]

#print(student)         

list = [[1011,'Udomsak',23,98,175],
        [1012,'Kaveewat',18,71,175],
        [1013,'Thanarat',18,51,168],
        [1014,'Somchai',48,61,172],]
df = pd.DataFrame(list, columns=['HOSPCODE','NAME','AGE','WEIGHT','HEIGHT',])
df['BMI'] = df['WEIGHT']/((df['HEIGHT']/100)**2)
print(df[df['BMI']>22])                       