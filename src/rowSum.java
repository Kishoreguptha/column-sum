import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class rowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int columnSize = sc.nextInt();
        int array[][] = new int[rowSize][columnSize];
        for(int i=0;i<rowSize;i++)
        {
            for(int j=0;j<columnSize;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        rowSum(array,rowSize,columnSize);
    }
    public static void rowSum(int[][] array,int row,int column)
    {
        int res[] = new int[row];
        for(int i=0;i<row;i++)
        {
            int sum=0;
            for(int j=0;j<column;j++)
            {
                sum+=array[j][i];
            }
            res[i] = sum;
        }
        System.out.println(Arrays.toString(res));
}
}