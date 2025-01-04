import java.io.*;

record student(String name , int id , int age)implements Serializable {
    @Override
    public String toString() {
            return "name "+name+" id "+id+" age "+age;
    }
}

public class serial {
    public static void main(String[] args) {
        student obj1 = new student("PANCHAM",101010,22);
        File f = new File("okkkay.txt");
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
            out.writeObject(obj1);
            System.out.println("object serialized");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            ObjectInputStream ins = new ObjectInputStream(new FileInputStream(f));
            student sobj=(student)ins.readObject();
            System.out.println("object De-serialized");
            System.out.println(sobj);
        } catch (Exception e) {
                throw new RuntimeException(e);
        } }
}
