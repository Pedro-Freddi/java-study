from socket import *

# Define server address and port
server = "127.0.0.1"
port = 43210

# Create a socket using IPv4 for addressing and UDP for transportation
socketObj = socket(AF_INET, SOCK_DGRAM)

# Bind the socket to the server's address and port
socketObj.bind((server, port))
print("Server is ready...")

while True:
  # Receive packets with a max size of 65535 bytes
  data, origin = socketObj.recvfrom(65535)
  print("Origin:", origin)
  print("Data:", data.decode())
  answer = input("Message to the client: ")
  # Send the answer
  socketObj.sendto(answer.encode(), origin)
  if data.decode().upper() == "END":
    break
socketObj.close()
