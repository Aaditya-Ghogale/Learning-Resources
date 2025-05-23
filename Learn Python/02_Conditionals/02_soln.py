age = int(input("Give me age: "))
day1 = str(input("Give me day: "))
day2=day1.lower()
day=day2.strip()

price = 12 if age>=18 else 8

if day == "wednesday":
    # price =price-2
    price-=2

print("Today Your Price is $",price)
