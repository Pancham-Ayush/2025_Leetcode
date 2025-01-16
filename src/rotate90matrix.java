import java.lang.reflect.Array;
import java.util.Arrays;

public class rotate90matrix {
    static public void rotate(int[][] matrix) {
        int a[][] = new int[matrix[0].length][matrix.length];
        int x =0;
        int y=0;

            for (int i = matrix.length - 1; i >= 0; i--) {
                for (int j = 0; j < matrix.length; j++) {
                a[x][y]=matrix[i][j];
                x++;
            }
                x=0;
                y++;
        }
       for (int i=0;i<matrix.length;i++){
           for (int j =0;j<matrix.length;j++){
               matrix[i][j]=a[i][j];
           }
       }
    }

    public static void main(String[] args) {
int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
rotate(ar);
    }
}


