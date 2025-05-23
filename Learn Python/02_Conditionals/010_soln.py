pet1=str(input("Enter pet Species: \n"))
pet2=pet1.lower()
pet=pet2.strip()

pet_age=int(input("Enter pet age: "))

if pet=="dog":
    if pet_age<2:
        print("Feed it puppy food")
    else:
        print("Feed it dog food")
elif pet=="cat":
    if pet_age<2:
        print("Feed it kitten food")
    else:
        print("Feed it cat food")