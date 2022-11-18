# open() method is used to read and write to files
# the second parameter specifies if we are reading, writing, appending, etc.
# "with" keyword manages the resource's memory management automatically
with open("test.txt", "w") as file:
  file.write("Hello Python!")
  file.write("\nIt's very easy to create a file.")

with open("test.txt", "a") as file:
  file.write("\nWe can also append lines to an existing file.")

with open("test.txt", "r") as file:
  # Read the whole file at once; returns a string
  # print(file.read())
  # Read the file by line; returns a list
  lines = file.readlines()
  print("Type: ", type(lines))
  print("Lines: ", lines)
  