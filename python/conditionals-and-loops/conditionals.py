# If statements
alive = input("Are you alive? (y/n) ")

if alive == "y":
  print("You are alive")

# If-else statements
age = int(input("Type your age: "))

if age >= 18:
  print("You are not underage.")
else:
  print("You are underage.")

# If-elif-else statements
number = int(input("Type a number from 1 to 3: "))

if number == 1:
  print("Number is 1")
elif number == 2:
  print("Number is 2")
elif number == 3:
  print("Number is 3")
else:
  print("Invalid number")

# Logical operators AND/OR
icecreamFlavor = input("What flavor of icecream you want? (chocolate/vanilla) ")
willConsumeHere = input("Will you consume it here? (y/n) ")

if icecreamFlavor == "chocolate" and willConsumeHere == "y":
  print("Chocolate icecream to consume here coming up!")
elif icecreamFlavor == "chocolate" and willConsumeHere == "n":
  print("Chocolate icecream to go coming up!")
elif icecreamFlavor == "vanilla" and willConsumeHere == "y":
  print("Vanilla icecream to consume here coming up!")
elif icecreamFlavor == "vanilla" and willConsumeHere == "n":
  print("Vanilla icecream to go coming up!")
elif (icecreamFlavor != "chocolate" and icecreamFlavor != "vanilla") or (willConsumeHere != "y" and willConsumeHere != "n"):
  print("Invalid options")

# Nested conditions
wantSteak = input("Do you want a steak? (y/n) ")

if wantSteak == "y":
  wantWellDone = input("Do you want your steak well done? (y/n) ")
  if wantWellDone == "y":
    print("Well done steak coming up!")
  elif wantWellDone == "n":
    print("Steak coming up!")
  else:
    print("Invalid option")
elif wantSteak == "n":
  print("No steak then...")
else:
  print("Invalid option")

print("=== End of program ===")
