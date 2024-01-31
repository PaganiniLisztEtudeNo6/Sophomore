while True:
    try :
        income = float (input("Enter your yearly income "))
    except ValueError:
        print("pls enter input in number")
        continue
    else :
        break

print('\nYearly income : ',income)
if income <= 3000:
    rate = 1.2
if income > 3000 and income <= 5000:
    rate = 6.5
if income > 5000 and income <= 10000:
    rate = 10
    
print('tax Rate : ',rate,'%')
sum = float ((income/100) * rate)
print('Total Tax = ',sum)
print('Amount to be paid =',(income - sum))