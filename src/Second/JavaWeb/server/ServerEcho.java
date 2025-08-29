package Second.JavaWeb.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ServerEcho {

    public static void main(String[] args) throws IOException {
        /*established a server connection with socket*/
        try (var socket = new ServerSocket(8189))
        {
            /*wait for client connection*/
            try (Socket incoming = socket.accept())
            {
                InputStream inStream = incoming.getInputStream();
                OutputStream outStream = incoming.getOutputStream();

                try (var in = new Scanner(inStream, StandardCharsets.UTF_8))
                {
                    var out = new PrintWriter(new OutputStreamWriter(outStream, StandardCharsets.UTF_8), true);
                    out.println("Hello! Enter Bye to exit.");

                    boolean done = false;
                    while (!done && in.hasNextLine())
                    {
                        String line = in.nextLine();
                        out.println("Echo: " + line);
                        if (line.strip().equals("Bye")) done = true;
                    }
                }
            }
        }
    }
}
