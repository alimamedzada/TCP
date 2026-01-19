package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        readAsString();
    }

    public static void readAsString() throws IOException {
        ServerSocket ourFirstSocket = new ServerSocket(6789);
        while (true) {
            System.out.println("yeni socket veya yeni mushteri uchun gozleyirem...");
            Socket socket = ourFirstSocket.accept();
            System.out.println("Urra, yeni mushteri geldi");
            InputStream is = socket.getInputStream();
            InputStreamReader bis  = new InputStreamReader(is);
            BufferedReader br= new BufferedReader(bis);
            String clientMessage = bis.getEncoding();
            System.out.println("mushteri deyir ki:  " + clientMessage);
        }
    }

    public static void readAsByte() throws IOException {
        ServerSocket ourFirstSocket = new ServerSocket(6789);
        while (true) {
            System.out.println("yeni socket veya yeni mushteri uchun gozleyirem...");
            Socket socket = ourFirstSocket.accept();
            System.out.println("Urra, yeni mushteri geldi");
            InputStream is = socket.getInputStream();
            byte[] bytes = is.readAllBytes();
            System.out.println("length = " + bytes.length);
            NioFileUtility.writeBytes("C:\\Users\\Asus\\Desktop\\client.jpg", bytes);
            System.out.println("length last= " + bytes.length);
        }
    }
}