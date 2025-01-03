import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

 class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("HI AFTER");
        var h = new HashMap<Integer, HashMap<String, HashMap<Double, String>>>();
        HashMap<String, HashMap<Double, String>> innerMap = new HashMap<>();
        HashMap<Double, String> lastmap = new HashMap<>();

             // Create a nested HashMap for the value

            lastmap.put(100.0, "saveing");
            innerMap.put("Ayush", lastmap);
            h.put(1001, innerMap);

        System.out.println(h.get(1001));
        lastmap.put(10.0, "saveing");
        innerMap.put("Ayush", lastmap);
        h.put(1001, innerMap);

        System.out.println(h);}
}
