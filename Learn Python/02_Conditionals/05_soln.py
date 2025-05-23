weather1 = str(input("Enter the weather: "))
weather= weather1.strip()

if weather.lower() == "rainy":
    print("Read a Book.")
elif weather.lower() == "sunny":
    print("Go for a Walk.")
elif weather.lower() == "snowy":
    print("Build a Snowman.")
