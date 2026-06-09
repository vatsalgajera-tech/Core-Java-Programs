import java.io.*;

public class DeserializeExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject();  // deserialize

            ois.close();
            fis.close();

            System.out.println("ID: " + s2.id);
            System.out.println("Name: " + s2.name);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}