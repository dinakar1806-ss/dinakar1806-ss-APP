import socket

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(("localhost", 12345))
server.listen(5)

print("TCP Student Result Server is waiting...")

while True:
    conn, addr = server.accept()
    print("Connected to:", addr)

    regno = conn.recv(1024).decode().strip()

    results = {
        "101": "Pass - 85 Marks",
        "102": "Pass - 90 Marks",
        "103": "Fail - 35 Marks",
        "104": "Pass - 95 Marks"
    }

    result = results.get(regno, "Register Number Not Found")
    conn.sendall(result.encode())
    print("Result sent:", result)
    conn.close()
