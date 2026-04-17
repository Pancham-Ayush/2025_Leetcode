import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streams_ {

    public static void main(String[] args) {
//        List<Student> students = List.of(
//                new Student("Ram", 85),
//                new Student("Shyam", 92),
//                new Student("Hari", 78),
//                new Student("Sita", 92),
//                new Student("Gita", 60)
//        );
//
//        students.stream().filter(x -> x.marks>80).collect(Collectors.toList());
//        students.stream().max((x , y) -> x.marks-y.marks).get();
//        students.stream().collect(Collectors.toMap(x -> x.name, x -> x.marks));
//        System.out.println( students.stream().collect(Collectors.groupingBy(x->x.marks)));
//        students.stream()
//                .collect(Collectors.
//                        groupingBy(x->x.marks,
//                                Collectors.mapping
//                                        (
//                                                Student::getName,
//                                                Collectors.toList()))
//        );

        List<String> list = List.of("apple","bal","bal","htgrfedw");
        list.stream().sorted((x,y)-> {
            if(x.length() < y.length())
                return 1;
            if(x.length()==y.length())
                return 0;
            else
                return -1;
        } ).forEach(System.out::println);
    }

}
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return name+" "+marks;
    }
    public String getName() { return name; }
    public int getMarks() { return marks; }

    @Override
   public boolean equals(Object object){
        if(this.hashCode()==object.hashCode())
            return true;
        Student obj= (Student) object;
        return this.marks == obj.marks;
    }
}
