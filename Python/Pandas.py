from multiprocessing.sharedctypes import Value
import pandas as pd 
s1 =pd.Series(['a','b','c'])
print(s1)
list = [[1 , 'a' , 500 , 50],[2 , 'b' , 600 , 60],[3 , 'c' , 700 , 70]]
df = pd.DataFrame(list , columns = ['Num' , 'name' , 'value1' , 'value2'])
print(df)


print(df['name'])
df1 = df[['name','value1']]
print(df)


df['Value3'] = df['value1'] / (df['value2']*df['value2'])
print(df)
df3 = df[(df['Value3'] >= 0.2)]
print(df3)

print(df.loc[0,['name','value2']])
  