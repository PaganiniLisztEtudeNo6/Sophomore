import pandas as pd
import numpy as np

##df = pd.DataFrame([[11,22,33,44],[55,66,77,88],[10,20,30,40]])

##print(df[0],df[2],df[0][0],df[1][2])'

data = {'one': np.random.randint(100,1000,10),
        'two': np.random.randint(1,10,10),
        'three': np.random.rand(10),
        'four': np.random.randint(1,100,10),
        'five': np.random.uniform(1,100,10),
        'six': np.random.choice([101,555,108,123,777],10),
        }

df = pd.DataFrame(data , index = list ('abcdefghij'))

print(df [1 : 4],
      df[::2],
      df['a' : 'i' : 3 ],
      df[:'d']
      )

print(df[-3: ][['one','two','three']])
print(df[1::3][['two','four','six']])

print(df.loc[['a','c','d','j']])
print('\n')
print(df.iloc[[1,3,5,9]])