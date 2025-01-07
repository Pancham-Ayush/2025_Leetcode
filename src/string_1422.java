public class string_1422  {
//   static public int maxScore(String s) {
//        int max=0;
//
//        for(int i=1;i<s.length();i++){
//            String l = s.substring(0,i),r=s.substring(i);
//            int left=0;
//            int right=0;
//            for(char x: l.toCharArray())
//                if(x=='0')
//                    left++;
//            for(char y: r.toCharArray())
//                if(y=='1')
//                    right++;
//            if(max<(left+right)){
//                max=right+left;
//            }
//        }
//        return max;
//    }

    static public int maxScore(String s) {
        int max=0;
        int t1=0;
        for(char x: s.toCharArray())
            if(x=='1')
                t1++;
        int t0 =0;
        for (int i =0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0')
                t0++;
            else
                t1--;
            max=Math.max(max,t0+t1);
        }
        return  max;
    }

    public static void main(String[] args) {

        System.out.println(maxScore("011101"));
    }
}

