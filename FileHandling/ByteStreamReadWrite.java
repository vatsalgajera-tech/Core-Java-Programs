import java.io.*;

public class ByteStreamReadWrite {
    public static void main(String[] args) {
        try {
            // Writing data to file
            FileOutputStream fos = new FileOutputStream("bytefile.txt");
            String data = "Hello Byte Stream!";
            fos.write(data.getBytes());  // convert string to bytes
            fos.close();

            // Reading data from file
            FileInputStream fis = new FileInputStream("bytefile.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);  // convert byte to char
            }
            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}