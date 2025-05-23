unique = input("Enter a string seperated by commas: ").split(",")

unique_set= set()

for item in unique:
    if item in unique_set:
        print("The string  ", item ," is not unique.")
        break
    else:
        unique_set.add(item)