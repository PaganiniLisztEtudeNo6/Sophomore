

#name = input("Enter your Name ")
#bd = input("Enter your brithday ")
#print("Email = " , name+bd,"@rsu.ac.th")

#price = float(input("Enter your price "))
#shipping_cost = float(input("shipping_cost "))
#print("sum = ", price+shipping_cost ,"(",shipping_cost,"Bath Shipping free)") 


#age = int(input("Enter your age "))
#name1 = input("Enter your name ")
#print("name = " , name1,"\nAge =",(2565-age))

#height = int(input("Enter your height in cm: "))
#weight = int(input("Enter your weight in kg: "))
#BMI = weight / (height/100)**2
#print(f"You BMI is ",BMI)
#if BMI < 18.5:
#    print("ผอม")
#elif BMI > 18.5 and BMI < 23:
#    print("ปกติ")
#elif BMI > 23 and BMI < 25:
#    print("อ้วน")
#elif BMI > 25 and BMI < 30:
#   print("อ้สนระดับ 2")

#def rectangle() :
#   l = int(input("Enter rectangle length: "))
#   b = int(input("Enter rectangle breadth: "))
#   rect_area = l * b
#    print(f"The area of rectangle is {rect_area}")
    
#def square() :
#    s = int(input("Enter square's side length: "))
#    sqt_area = s * s
#    print(f"The area of square is {sqt_area}")
    
#def circle() :
#    r = int(input("Enter circle's radius length: "))
#    pi = 3.14
#    circ_area = pi * r * r
#    print(f"The area of triangle is {circ_area}")
    
#print("1 = rectangle\n2 = square\n3 = circle")
#Ch = int(input("Select Choice = "))
#if Ch == 1 :
#    rectangle()
#elif Ch == 2 :
#    square()   
#elif Ch == 3 :
#    circle()

#W = ""
#while True:
#    A = input("Next = ")
#    if A == "." :
#        break
#    else :
#        W += A + ""
#print(W)

#import random as rd


#while True:
#    R = rd.randint(1,9)
#    B = input("Enter num ")
#    if B == R:
#        print("correct")
#        break
#    else:
#        continue 

from array import*
from binascii import a2b_base64
import numpy as np

arr = array('i',[])
n = int(input("Enter the length of the array "))
for i in range(n):
    x = int(input("Enter value "))
    arr.append(x)

for i in range(n):
    print("Student =",(i+1)," = " ,arr[i])
    
a = int(np.average(arr))

arr1 = []
arr2 = []
for i in range(n):
    if arr[i] >= 5 : arr1.append(i)
    else : arr2.append(i)
        
print("Average = ",a)
print("\nAverage Higher score = ",max(arr))
print("\nAverage passing = ",np.average(arr1))
print("\nAverage fail score = ",np.average(arr2))



