# Declare and initialize a dictionary
animals = {
  "dog": ["Mammal", "Au au"],
  "cricket": ["Insect", "Crick crick"],
  "cow": ["Mammal", "Moo moo"],
  15: "Fifteen"
}

# Adding an object to the dictionary
animals["cat"] = ["Mammal", "Miau miau"]

# Print the whole dictionary
print("\n=== Print dictionary ===")
print(animals)

# Different ways to retrieve a value by its key
print("\n=== Accessing specific elements ===")
print("Direct access: ", animals["dog"])
print("Access thought get() method: ", animals.get("dog"))

# Try to get a key that is not in the dictionary
print("\n=== Accessing an element that is not present ===")
print(animals.get("camel"))

# Iterating a dictionary and accessing its keys and values
print("\n=== Iterate the dictionary ===")
for key, value in animals.items():
  print("Key: " + str(key))
  print("Value: " + str(value))

# Get a list of all keys or values
print("\n=== Get a list of keys and values ===")
print("Keys: ", animals.keys())
print("Values: ", animals.values())

# Check if dictionary contains a specific key
print("\n=== Other methods ===")
print("Contains camel: ", "camel" in animals)

# Remove all elements
print("\n=== Clear dictionary ===")
animals.clear()
print(animals)
