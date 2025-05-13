import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.Stack;

public class sort {
   static void bubbleSort(int arr[]){
        for (int i=0;i< arr.length-1;i++)
            for (int j =0;j<arr.length-1-i;j++)
                if (arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

    }
    static void selectionsort(int arr[]){

        for (int j =0;j<arr.length;j++) {
            int min=arr[j];
            int index =j;

            for (int i = j; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    index = i;
                }
            }
            if(j!=index) {
                int temp = arr[j];
                arr[j] = min;
                arr[index] = temp;
            }
        }
    }
    static void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // Shift elements greater than current to the right
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place current in the correct location
            arr[j + 1] = current;
        }
    }
    void dfs(int arr[][]){
      int x =0;
      int v[]=new int[arr.length];
      v[x]=1;
        Stack<Integer> s = new Stack<>();
        s.push(x);
        while (!s.isEmpty()){
            int y = s.pop();
            for (int j =0;j<arr.length;j++){
                if(arr[y][j]==1 && v[j]==0){
                    s.push(j);
                    v[j]=1;
                }
            }
        }

    }
    public int[] runningSum(int[] nums) {
        int r[] = new int [nums.length];
        int prev=0 ;
        for (int i =0;i< nums.length;i++){
            prev+=nums[i];
            r[i]=prev;
        }
        return r;
    }/**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    static int gcd(int m,int n){
        if(n==0)
            return m;
        return gcd(n,m%n);
    }

    static int binarysearch(int ar[],int n ,int low ,int high){
        if (low > high) {
            return -1; // not found
        }
        int mid=(low+high)/2;

        if(ar[mid]==n){
            return mid+1;
        }
        if(n>ar[mid]) {
            return binarysearch(ar, n, mid + 1, high);
        }
        else {
            return binarysearch(ar, n, low, mid - 1);
        }
    }

    static void prime(int n){
        if (n<2)
        {
            System.out.println("not prime");
            return;
        }
        for (int i =2;i<=Math.sqrt(n);i++){

            if(n%i==0) {
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }
    static void prime2(int n){
        int arr[]=new int [n+1];
        for (int i=2;i<=n;i++){
            if (arr[i]==0){
                arr[i]=1;
                for (int x=i*2;x<=n;x+=i){
                    arr[x]=-1;
                }
            }

        }
        if (arr[n]==1)
            System.out.println("prime");
        else
            System.out.println("not");
    }
    public static void main(String[] args) {
        int[] arr = {10,15,19,56,100};
        System.out.println(5%10);
        prime2(12);
   }
}
