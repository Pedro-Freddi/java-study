from socket import *

# Define server address and port
server = "127.0.0.1"
port = 43210

# Create socket object with IPv4 for addressing and UDP for transportation
socketObj = socket(AF_INET, SOCK_DGRAM)

# Connect to the server
socketObj.connect((server, port))

breakLoop = False

while not breakLoop:
  message = input("Type a message to the server: ")
  socketObj.sendto(message.encode(), (server, port))
  data, origin = socketObj.recvfrom(65535)
  print("Server answer:", data.decode())
  userInput = input("Press 0 to quit or anything else to continue... ")
  if userInput == "0":
    breakLoop = True
socketObj.close()
