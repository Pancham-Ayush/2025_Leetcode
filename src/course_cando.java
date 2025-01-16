import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class course_cando {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length==0)
            return true;
        TreeMap<Integer,Integer>h=new TreeMap<>();
        for (int i=0;i<prerequisites.length;i++){
                h.put(prerequisites[i][1],prerequisites[i][0]);
        }
        Iterator<Integer> i =h.keySet().iterator();
        int c=0;
        while (i.hasNext()){
            c+=i.next();
        }
        if(c<(numCourses - 1) * numCourses / 2)
            return true;

        return false;
    }

}
