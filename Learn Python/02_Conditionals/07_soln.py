order_size=str(input("Tell the size of coffee you want to order (Big / Medium / Small):"))
order2=order_size.lower()
order=order2.strip()

extra1= str(input("Do you want an extra shot of espresso? (yes[y]/no[n]) \n"))
extra2=extra1.lower()
extra=extra2.strip()

if extra=="yes" or extra=="y":
    coffee= order+"Coffee with extra shot of Espresso"
    print("Order:" , coffee)
else:
    coffee= order+"Coffee without extra shot of Espresso"
    print("Order:" , coffee)
 