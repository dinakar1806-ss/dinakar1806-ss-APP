import socket

server = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
server.bind(("localhost", 12346))

print("UDP Weather Server Started...")

while True:
    data, addr = server.recvfrom(1024)
    temperature = data.decode().strip()

    print("Temperature received:", temperature, "°C")
    server.sendto("Temperature received successfully".encode(), addr)
