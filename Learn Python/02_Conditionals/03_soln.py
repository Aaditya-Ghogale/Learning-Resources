score=int(input("Enter your score: "))

if score<0 or score>100:
    print("Invalid score")
    exit()

if score>=90:
    grade="A"

elif score>=80:
    grade="B"

elif score>=70:
    grade="C"

elif score>=60:
    grade="D"

else:
    grade="F"

print("Your grade is: ",grade)