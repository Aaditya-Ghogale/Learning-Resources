input_str=str(input("Enter the word "))
reversed_str=""

for char in input_str:
    reversed_str=char+reversed_str
print("Reversed string is: ",reversed_str)