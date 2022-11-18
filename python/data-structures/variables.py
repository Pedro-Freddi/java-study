# Declare and initialize some variables of different types
firstName = "Bruce"
lastName = "Wayne"
age = 38
height = 1.88

# Concatenate them with other strings and print the results
print("Name: " + firstName + " " + lastName)
print("Age: " + str(age))
print("Height:", height, "m")

# Ask the user for input
favoriteHobby = input("Type your favorite hobby: ")
mealFrequency = int(input("How many meals you have in a day? "))

# Print some strings using the input provided by the user
print("Favorite hobby is " + favoriteHobby)
print("You eat " + str(mealFrequency) + " meals in a day")

# Check the type of some variables
print(type(firstName))
print(type(age))
print(type(height))
