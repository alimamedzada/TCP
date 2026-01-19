package org.example;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        writeAsByte();
    }

    public static void writeAsString() throws IOException {
        Socket socket = new Socket("192.168.100.35", 6789);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.write("Salam Server, necesen?".getBytes());
        socket.close();
    }

    public static void writeAsByte() throws IOException {
        Socket socket = new Socket("192.168.100.35", 6789);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        byte[] bytes = NioFileUtility.readBytes("C:\\Users\\Asus\\Desktop\\me.jpg");
        dos.write(bytes);
        dos.flush();
        socket.close();
    }
}