package Second.JavaWeb.inetAddress;

import java.io.*;
import java.net.*;

public class InetAddressTest {

    public static void main(String[] args) throws IOException{
        if (args.length > 0)
        {
            String host = args[0];
            InetAddress[] addresses = InetAddress.getAllByName(host);
            for (var addr : addresses)
                System.out.println(addr);
        }
        else
        {
            InetAddress localhostAddress = InetAddress.getLocalHost();
            System.out.println(localhostAddress);
        }
    }

}
