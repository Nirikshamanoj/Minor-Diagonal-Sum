import java.util.Scanner;
public class MinorDiagonalSum {
    static void findMinorDiagonalSum(int[][] A,int size)
    {
        int i=0,j=size-1;
        int sum=0;
        while (i<size && j>=0)
        {
            sum+=A[i][j];
            i++;
            j--;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int A[][]=new int[N][N];
        for (int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                A[i][j]=scanner.nextInt();
            }
        }
        findMinorDiagonalSum(A,N);
    }
}
