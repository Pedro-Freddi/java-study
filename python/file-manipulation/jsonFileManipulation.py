# Import necessary modules
import json
import os

# Check if "test.json" file already exists
if os.path.exists("test.json"):
  # If it does, load its content into the "data" variable
  with open("test.json", "r") as jsonFile:
    data = json.load(jsonFile)
    print("File loaded successfully")
else:
  data = {}

for number in range(1, 10, 1):
  data[number] = "Number " + str(number)

with open("test.json", "w") as jsonFile:
  json.dump(data, jsonFile)
  print("Saved file")
