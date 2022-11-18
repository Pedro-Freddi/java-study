import os
from ftplib import *

# Function to write data to a file
def writeLine(data):
  file.write(data)
  file.write(os.linesep)

# Variable to define if ftp connection will be active or passive
ftpActiveConn = False

# Connect to the FTP server and print the welcome message
ftp = FTP("ftp.ibiblio.org")
print(ftp.getwelcome())

# Login as an anonymous user
ftp.login()

# Set whether connection will be active or passive
ftp.set_pasv(ftpActiveConn)

# Retrieve README file from the server and write it to the "ftp_retrieved.txt" file
with open("retrieved_readme.txt", "w") as file:
  ftp.retrlines("RETR README", writeLine)

# Close the connection
ftp.quit()