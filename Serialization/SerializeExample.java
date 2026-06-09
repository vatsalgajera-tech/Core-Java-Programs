
import java.io.*;

class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializeExample {

    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Vatsal");
            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("student.txt")
            );

            oos.writeObject(s1);  // serialize object

            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
