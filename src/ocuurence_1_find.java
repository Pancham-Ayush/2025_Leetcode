//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
//
//public class ocuurence_1_find {
//
//       static public int[] singleNumber(int[] nums) {
//            int arr[]= new int[2];
//            HashSet<Integer> hashSet = new HashSet<>();
//            for (int x :nums){
//                if(!hashSet.add(x)){
//                   hashSet.remove(x);
//                }
//            }
//           Iterator<Integer> i = hashSet.iterator();
//            arr[0]=i.next();
//            arr[1]=i.next();
//            return arr;
//        }
//
//    public static void main(String[] args) {
//        int a[]={1,2,2,3,3,5};
//        System.out.println(singleNumber(a));
//    }
//}


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Scanner;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
    String userRole()

            default "GUEST";

    int budgetLimit();
}

class FamilyMember {
    @FamilyBudget(userRole = "SENIOR", budgetLimit = 100)
    public void seniorMember(int budget, int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }

    @FamilyBudget(userRole = "JUNIOR", budgetLimit = 50)
    public void juniorUser(int budget, int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
}
 class Solution {
    @SuppressWarnings({ "resource", "rawtypes" })
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String role = in.next();
            int spend = in.nextInt();
            try {
                Class annotatedClass = FamilyMember.class;
                Method[] methods = annotatedClass.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(FamilyBudget.class)) {
                        FamilyBudget family = method.getAnnotation(FamilyBudget.class);
                        String userRole = family.userRole();
                        int budgetLimit = family.budgetLimit();
                        if (userRole.equals(role)) {
                            if (spend <= budgetLimit) {
                                method.invoke(FamilyMember.class.newInstance(), budgetLimit, spend);
                            } else {
                                System.out.println("Budget Limit Over");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            testCases--;
        }
    }
}