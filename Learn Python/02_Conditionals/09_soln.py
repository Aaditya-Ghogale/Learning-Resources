year=int(input("Enter the year: "))

if (year%4==0 and year%100!=0 )or (year %400==0):
    print("Leap year hai.......")
else:
    print("Leap year nahi hai.......")


# Alternate soln:

# import calendar
# year= int(input("Enter the year: "))
# if calendar.isleap(year):
#     print("Leap year hai.......")
# else:   
#     print("Leap year nahi hai.......")
