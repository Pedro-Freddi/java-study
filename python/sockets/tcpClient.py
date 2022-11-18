from socket import *

# Variables to hold server address and port
server = "localhost"
port = 43210

while True:
  # Message to send to the server (must be converted to bytes)
  message = bytes(input("Type a message to the server: "), "utf-8")

  # Create a socket object
  socketObj = socket(AF_INET, SOCK_STREAM)

  # Connect to the server
  socketObj.connect((server, port))

  # Send the message
  socketObj.send(message)

  # Store the answer in a variable
  answer = str(socketObj.recv(1024))[2:-1]
  print("Received:", answer)

  # Condition to end the loop
  if str(message)[2:-1].upper() == "END":
    break

# Close the socket
socketObj.close()
