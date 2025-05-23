password1 = str(input("Enter your Password: "))
password= password1.strip()
n= len(password)

if n<6:
    print("Password is too weak")
elif n<10:
    print("Password is of medium strength")
else:
    print("Password is strong")
    