# List declaration and initialization
names = ["Peter", "John", "Jack", "Marvin", "Kevin"]

print("=== Print list of names ===")

# Using a for loop to print items of a list
for name in names:
  print(name)

# Appending and removing items
names.append("Mack")
names.append("Robert")
names.remove("John")

print("=== Names list after appending and removing ===")

for name in names:
  print(name)

# Modifying values of a list using an index
names[1] = "CHANGED"
# Deleting values using the "del" keyword and an index
del names[0]

print("=== Names after direct value manipulation ===")

for name in names:
  print(name)
