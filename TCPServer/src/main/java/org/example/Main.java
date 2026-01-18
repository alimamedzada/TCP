package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket ourFirstSocket = new ServerSocket(5678);
        while (true) {
            Socket socket = ourFirstSocket.accept();
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader bis = new BufferedReader(isr);
            String clientSentence = bis.readLine();
            System.out.println("recieved= " + clientSentence);
        }
    }
}