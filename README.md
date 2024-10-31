# Chat Application with Java Sockets

## Project Overview
The **Chat Application** is a Java console-based program that allows multiple clients to connect to a server and exchange messages in real time. This project showcases skills in Java socket programming, multi-threading, and networking fundamentals.

## Features
1. **Real-Time Chat**: Multiple clients can send and receive messages in real time.
2. **Server-Client Architecture**: The server broadcasts each client's messages to all connected clients.

## How to Use
1. **Start the Server**:
   - Compile and run `Server.java`:
     ```bash
     javac Server.java
     java Server
     ```

2. **Start the Client**:
   - Compile and run `Client.java`:
     ```bash
     javac Client.java
     java Client
     ```

## Example
- Server starts and waits for clients to connect.
- Each client can send messages, which are broadcasted to other connected clients.

## Future Enhancements
- Add a GUI for a more user-friendly interface.
- Implement user authentication with usernames and passwords.
- Encrypt messages for secure communication.

## Disclaimer
This is a basic chat application intended for learning and demonstration purposes. It should not be used in production environments without modifications.
