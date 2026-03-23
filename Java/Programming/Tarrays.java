import java.util.Scanner;
public class Tarrays {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter no  of rows:");
        int N = dc.nextInt();
        System.out.println("Enter no  of columns:");
        int M = dc.nextInt();
        int[][] arr=new int[N][M];
        System.out.println("Enter " + N*M + " integers:" );
        int sum=0;
        int min=0;
        int max=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j] = dc.nextInt();
                sum += arr[i][j];
                if(i == 0 && j == 0) {
                    min=arr[i][j];
                    max=arr[i][j];
                } else {
                    if(arr[i][j] < min) {
                        min=arr[i][j];
                    }
                    if(arr[i][j] > max) {
                        max=arr[i][j];
                    }
                }
            }
        }
        System.out.println("The matrix is:");
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of the matrix: " + sum);
        System.out.println("Maximum value in the matrix: " + max);
        System.out.println("Minimum value in the matrix: " + min);
        dc.close();
    }
}
