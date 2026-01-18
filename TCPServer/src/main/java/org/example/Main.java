package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket ourFirstSocket = new ServerSocket(6789);
        while (true) {
            System.out.println("yeni socket veya yeni mushteri uchun gozleyirem...");
            Socket socket = ourFirstSocket.accept();
            System.out.println("Urra, yeni mushteri geldi");
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader bis = new BufferedReader(isr);
            String clientSentence = bis.readLine();
            System.out.println("mushteri deyir ki:  " + clientSentence);
        }
    }
}