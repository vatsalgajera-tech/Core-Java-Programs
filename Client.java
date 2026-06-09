import java.io.*;
import java.net.*;

class Client {

    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(s.getInputStream())
            );
            BufferedWriter output = new BufferedWriter(
                    new OutputStreamWriter(s.getOutputStream())
            );

            output.write("Hello from Client", 0, 0);
            output.flush();
            String rresponse = input.readLine();
            System.out.println("Response from Server : " + rresponse);

            input.close();
            output.close();
            s.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
