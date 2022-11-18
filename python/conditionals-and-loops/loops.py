# While loops
count = int(input("Input a number from 0 to 100: "))

if count < 0 or count > 100:
  print("Invalid number")
else:
  while count <= 100:
    print(str(count))
    count += 1

# For loops
newCount = int(input("Input another number from 0 to 100: "))

if newCount < 0 or newCount > 100:
  print("Invalid number")
else:
  for number in range(newCount, 101, 1):
    print(str(number))

print ("=== End ===")
