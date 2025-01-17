import java.util.Arrays;

class selection_sort_via_recur {
    public static void main(String[] args) {
        int a[] = {3, 5, 1,22222,0, 2, 33, 0, -1};
        selection(a, 0,a.length);
        System.out.println(Arrays.toString(a));
    }




   static void selection(int arr[],int s,int end){
        if(end<=0)
            return;
        int max=s;
        for (int i=s;i<end-1;i++)
        {
            max=(arr[max]>arr[i])?max:i;
        }
        int temp =arr[end-1];
        arr[end-1]=arr[max];
        arr[max]=temp;
        selection(arr,s,--end);
    }
}