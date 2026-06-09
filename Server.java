import java.io.*;
import java.net.*;

class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            Socket s = ss.accept();
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(s.getInputStream())
            );
            BufferedWriter output = new BufferedWriter(
                    new OutputStreamWriter(s.getOutputStream())
            );

            output.write("Hello from Server");
            output.flush();
            String Request = input.readLine();
            System.out.println("Request from Client : " + Request);

            input.close();
            output.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

    }
}