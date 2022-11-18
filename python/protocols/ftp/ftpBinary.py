from ftplib import *

# Connect to the FTP server and print the welcome message
ftp = FTP("ftp.ibiblio.org")
print(ftp.getwelcome())

# Login as an anonymous user
ftp.login()

# Change to the specified directory
ftp.cwd("/pub/linux/logos/pictures")

# Retrieve a JPG file from the server and write it to the "linus_picture.jpg" file
with open("linus_picture.jpg", "wb") as file:
  ftp.retrbinary("RETR linus-father-of-linux.jpg", file.write)

# Close the connection
ftp.quit()