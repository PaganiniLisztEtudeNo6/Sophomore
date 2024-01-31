import pandas as pd

data = {'one' : [11,22,33,44] , 
        'two' : [55,66,77,88] , 
        'three' : [101,102,103,104]
        }

df1 = pd.DataFrame(data , index = ['p1','p2','p3','p4'])
print(data)

data2 =[[11,22,33,44],[55,66,77,88],[101,102,103,104]]
df2 = pd.DataFrame(data2 , columns=['one','two','three','four'])

print('\n' , df2)

data3 =[5,15,10,15,20,15,10,5]
idx = ['a','b','a','c','c','d','b','c']
sr = pd.Series(data3 , index = idx)

print(sr.sort_index())

g = sr.groupby(idx).sum()

print(g)