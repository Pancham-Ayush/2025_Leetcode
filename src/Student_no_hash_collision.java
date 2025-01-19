import java.util.HashMap;
public class Student_no_hash_collision {
        String srn;
        String name;
        @Override
        public int hashCode() {
//      hash collision occur
            return 1;
        }
        @Override
        public boolean equals(Object obj){
//      After hash collision it check via equal
        return false;
    }
        //  toString Override
        public String toString() {
            return "Student{" +
                    "srn='" + srn + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
        //  Constructor
        public Student_no_hash_collision(String srn, String name) {
            this.srn = srn;
            this.name = name;
        }
        public static void main(String[] args) {
            var map=new HashMap<Student_no_hash_collision,Integer>();
            map.put(new Student_no_hash_collision("R23EF171","pancham"),3);
            map.put(new Student_no_hash_collision("R23EF171","pancham"),4);
            System.out.println(map);

        }
    }
