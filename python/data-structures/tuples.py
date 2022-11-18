# Declare and initialize a tuple
users = (["John", 28], ["Jack", 35], ["Sarah", 41], ["Mike", 45])

# Iterate the tuple and print the values
print("\n=== Iterating the tuple ===")
for user in users:
  print(user)

# Accessing an item in the tuple by its index
print("\n=== Accessing an element by index ===")
print(users[1])

# Note: data in tuples can't be changed or deleted
# del users[1] raises an error
# users[1] = ["Jane", 37] also raises an error
