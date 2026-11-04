import socket

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(("localhost", 12345))

regno = input("Enter Register Number: ")
client.sendall(regno.encode())

result = client.recv(1024).decode()
print("Examination Result:", result)

client.close()
