import java.util.HashMap;

public class Student_hash {

        String srn;
        String name;

    @Override
    public String toString() {
        return "Student_hash{" +
                "srn='" + srn + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    //  Constructor

        public Student_hash(String srn, String name) {
            this.srn = srn;
            this.name = name;
        }
        public static void main(String[] args) {
            var map=new HashMap<Student_hash,Integer>();
            map.put(new Student_hash("R23EF171","pancham"),3);
            map.put(new Student_hash("R23EF171","pancham"),4);
            System.out.println(map);

        }
    }
