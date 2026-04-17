public class Compare_Version_Numbers {
    public static int compareVersion(String version1, String version2) {


        int m1=version1.length();
        int m2=version2.length();
        int i=0,j=0;
        outer:
            while (i<m1 || j<m2){

                int x1=i;
                while (x1<m1 ) {
                    if (version1.charAt(x1)=='.')
                        break ;
                    x1++;
                }
                int x2=j;
                while (x2<m2) {
                    if(version2.charAt(x2)=='.')
                        break ;
                    x2++;
                }
                var s1_=i<m1?version1.substring(i,x1):"0";
                var s2_=j<m2?version2.substring(j,x2):"0";
                int s1 = Integer.valueOf(s1_);
                int s2 = Integer.valueOf(s2_);

                i=++x1;
                j=++x2;
                if(s1==s2)
                    continue outer;

                if(s1>s2)
                    return 1;
                if(s1<s2)
                    return -1;
            }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(        compareVersion("1.2","1.20")
);    }
}
