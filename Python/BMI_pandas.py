import pandas as pd 

list = [[9435 , 'a' , 95 , 51 , 159],
        [9435 , 'b' , 69 , 71 , 177],
        [9435 , 'c' , 56 , 90 , 181],
        [9435 , 'd' , 48 , 42 , 161]]

df = pd.DataFrame(list , columns = ['Hospcode' , 'name' , 'age' , 'W' , 'H'])
print(df)

df['BMI'] = df['W'] / ( ((df['H']/100) * (df['H'])/100) )
print(df)
df3 = df[(df['BMI'] >= 22)]
print(df3)




