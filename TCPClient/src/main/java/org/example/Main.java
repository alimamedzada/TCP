package org.example;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.100.3", 6789);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.write("Salam Server, necesen?".getBytes());
        socket.close();
    }
}