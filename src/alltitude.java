
//leetcode 1732
public class alltitude {
    public int largestAltitude(int[] gain) {

        int big=0;
int a[]=new int[gain.length+1];
a[0]=0;
for (int i =0;i<gain.length;i++){
    a[i+1]=a[i]+gain[i];
    big=(big<a[i+1])?a[i+1]:big;
}
return big;

    }
}
