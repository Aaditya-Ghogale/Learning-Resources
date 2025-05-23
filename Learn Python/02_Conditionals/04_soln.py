fruit1=str(input("Enter a fruit: "))
fruit2=fruit1.lower()
fruit=fruit2.strip()

color1=str(input("Enter a color: "))
color2=color1.lower()
color=color2.strip()

if fruit =="banana":
    if color=="green":
        print("UNRIPE")
    elif color=="yellow":
        print("RIPE")
    elif color=="brown":
        print("OVER RIPE")
else:
    print("Ye phal ke bare me nahi pata")