package Intro_Java_Exercises.zju;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * SocketTest
 */
public class SocketTest {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(InetAddress.getByName("localhost"), 1234);
            PrintWriter out = new PrintWriter(
                        new BufferedWriter(
                            new OutputStreamWriter(socket.getOutputStream()
                            )));
            out.println("Hello");
            out.flush();
            
            BufferedReader in = new BufferedReader(
                new InputStreamReader(
                    socket.getInputStream()));

            String line;
            line = in.readLine();
            System.out.println(line);
            out.close();
            socket.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}


