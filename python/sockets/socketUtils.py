# Import socket module
import socket

# Get an IP by name
url = "www.google.com"
print("URL: ", url)
print("IP: ", socket.gethostbyname(url))

# Get the port of some services by name
print("HTTP port:", socket.getservbyname("http"))
print("FTP port:", socket.getservbyname("ftp"))
print("Domain port:", socket.getservbyname("domain"))
