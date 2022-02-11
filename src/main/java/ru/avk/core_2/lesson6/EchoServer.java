package ru.avk.core_2.lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    private static final String HOST = "localhost";
    private static final int PORT = 12265;
          private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        
        try (Socket socket = new Socket(HOST,PORT)) {
            System.out.println("Connected");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            System.out.println("Client connected!");


            while (true) {
                String message = SCANNER.nextLine();
                System.out.println(message);
                Thread.sleep(200);
                out.writeUTF("Received: " + message);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
