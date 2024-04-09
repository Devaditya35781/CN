
import java.io.*;
import java.net.*;
public class TCPServer {
    public static void main(String argv[]) throws Exception {
        String clientSentence;
        String capitalizedSentence;
        ServerSocket welcomeSocket = new ServerSocket(4000);
        while (true) {
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader( connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream( connectionSocket.getOutputStream());
            clientSentence = inFromClient.readLine();
            capitalizedSentence = "I am Devaditya: the " + clientSentence.toUpperCase() + '\n';
            outToClient.writeBytes(capitalizedSentence);
        }
    }
}