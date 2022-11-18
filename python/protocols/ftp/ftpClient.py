import os
from ftplib import *

# Connect to the FTP server
ftp = FTP(input("Enter FTP server address: "))

# Print the welcome message from the server
print(ftp.getwelcome())

# Get user and password information from input and log in to the server
user = input("User: ")
password = input("Password: ")
ftp.login(user, password)

print("\nConnection successful!")
print("\nCurrent directory:", ftp.pwd())

# Variable to control the user's selected option
menu = "1"

while menu == "1" or menu == "2" or menu == "3":
  # Get user option
  menu = input("\nChoose an option: " + "\n1. List files" + "\n2. Change directory" + "\n3. Download file" 
  + "\nOr press any other key to quit\n")
  if menu == "1":
    # Print a list of all files in the current directory
    print(ftp.dir())
  elif menu == "2":
    # Ask the user for a directory to change to
    ftp.cwd(input("\nEnter a directory: "))
    print("\nCurrent directory is: ", ftp.pwd())
  elif menu == "3":
    # Get type of file (binary or ASCII) through user input
    type = input("\nType B to download a binary file or any other key for ASCII file\n").upper()
    if type == "B":
      with open(input("Enter destination file: "), "wb") as file:
        ftp.retrbinary("RETR " + input("Enter the name of the file to download: "), file.write)
    else:
      with open(input("Enter destination file: "), "w") as file:
        def writeLine(data):
          file.write(data)
          file.write(os.linesep)
        command = "RETR " + input("Enter the name of the file to download: ")
        ftp.retrlines(command, writeLine)
    print("\nDownload successfull!")
  else:
    break

# Close the connection
ftp.quit()
