package Second.JavaWeb.socket;

import java.io.*;
import java.net.*;
import java.nio.charset.*;
import java.util.*;

public class SocketTest {

    public static void main(String[] args) throws Exception{
        try (var socket = new Socket("time-a.nist.gov", 13);
            var in = new Scanner(socket.getInputStream(), StandardCharsets.UTF_8);)
        {
            while (in.hasNextLine())
            {
                String Line = in.nextLine();
                System.out.println(Line);
            }
        }
    }
}
