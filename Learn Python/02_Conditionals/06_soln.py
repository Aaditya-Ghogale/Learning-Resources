distance= int(input("Enter the distance to be travelled: "))

if distance <= 3:
    print("Take a walk")
elif distance <= 10:
    print("Take a bus")
else:
    print("Take a car")