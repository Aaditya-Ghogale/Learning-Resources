n = int(input("Enter the number "))

sum_even = 0

for i in range(1,n+1):
    if i%2==0:
        sum_even+=i
        print(i)
print("Sum of even numbers from 1 to",n,"is: ",sum_even)