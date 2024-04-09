/* A2. Write a program to find the name and addresses of the local machine as well as a remote host (also
a group of remote hosts) using InetAddress class in Java. */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NameAndAddress {

    public static void main(String[] args) {
        try {
            // Local host information
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + localHost.getHostName());
            System.out.println("Local Host Address: " + localHost.getHostAddress());

            System.out.println("\n==============================\n");

            // info using IP Address
            String localMachineIP = "127.0.0.1";
            InetAddress localMachine = InetAddress.getByName(localMachineIP);
            System.out.println("Local Machine Name: " + localMachine.getHostName());
            System.out.println("Local Machine Address: " + localMachine.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
