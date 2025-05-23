input = str(input("Enter the string "))

for char in input:
    if input.count(char)==1:
        print(char ,"is first non-repeated")
        break