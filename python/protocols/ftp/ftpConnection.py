from ftplib import *

# Connect to the FTP server
ftp = FTP("ftp.ibiblio.org")

# Print the welcome message from the server
print(ftp.getwelcome())

# Get user and password information from input and log in to the server
user = input("User: ")
password = input("Password: ")
ftp.login(user, password)

# Print current directory
print("\nCurrent directory:", ftp.pwd())

# Change directory to "pub" and list all files
print("\nChanging directory...")
ftp.cwd("pub")
print("Current directory:", ftp.pwd())
print(ftp.retrlines("LIST"))

# Close the connection
ftp.quit()