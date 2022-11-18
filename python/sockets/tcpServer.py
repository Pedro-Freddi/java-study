from socket import *

# Variables to hold server address and port
server = "localhost" # Could also be "127.0.0.1"
port = 43210

# Create a new socket object
# AF_INET represents the IPv4 protocol (packet addressing)
# SOCK_STREAM represents the TCP protocol (packet transport)
socketObj = socket(AF_INET, SOCK_STREAM)

# Bind the socket to the server
socketObj.bind((server, port))

# Have the socket listen for a max of two simultaneous connections
socketObj.listen(2)
print("Waiting for client...")

while True:
  # Accept connection from a client
  con, client = socketObj.accept()
  print("Connected to:", client)
  while True:
    receivedMsg = str(con.recv(1024))
    print("Received:", str(receivedMsg)[2:-1])
    answer = bytes(input("Type a message to the client: "), "utf-8")
    con.send(answer)
    break
  con.close()
