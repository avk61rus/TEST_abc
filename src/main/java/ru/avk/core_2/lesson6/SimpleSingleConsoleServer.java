package ru.avk.core_2.lesson6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleSingleConsoleServer {
    private static final int PORT = 12265;
    private static Socket socket;
    private static DataInputStream in;
    private static DataOutputStream out;
    private Thread serverConsoleThread;

    public static void main(String[] args) {

    }

    private void runServer() throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server started!");

        waitForConnectionAndInitResources(serverSocket);

        serverConsoleThread = new Thread(() -> {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        });
            


    }

    private void waitForConnectionAndInitResources(ServerSocket serverSocket) throws IOException {
        System.out.println("Server is connected!");
        socket = serverSocket.accept();
        System.out.println("Client connected....");
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
    }


}
