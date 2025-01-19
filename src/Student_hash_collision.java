import java.util.HashMap;
public class Student_hash_collision {
    String srn;
    String name;
    @Override
    public boolean equals(Object obj){
        Student_hash_collision x =(Student_hash_collision) obj;
        return this.srn.equals( x.srn )&& this.name.equals(x.name);
    }
    @Override
    public int hashCode() {
        return 1;
    }
//  toString Override
    public String toString() {
        return "Student{" +
                "srn='" + srn + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
//  Constructor
    public Student_hash_collision(String srn, String name) {
        this.srn = srn;
        this.name = name;
    }
    public static void main(String[] args) {
        var map=new HashMap<Student_hash_collision,Integer>();
        map.put(new Student_hash_collision("R23EF171","pancham"),3);
        map.put(new Student_hash_collision("R23EF171","pancham"),4);
        System.out.println(map);

    }
}
