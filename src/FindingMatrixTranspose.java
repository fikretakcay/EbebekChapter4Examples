import java.util.Scanner;

public class FindingMatrixTranspose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s;
        int i,j;

        System.out.println("Please enter creating row and column numbers: ");
        s = scan.nextInt();
        int[][] matrix = new int[s][s];
        int[][] transpose = new int[s][s];

        for(i = 0 ; i<s ;i++){
            for (j=0;j<s;j++){
                System.out.println((i+1) + "x"+(j+1) +"enter number");
                matrix[i][i] = scan.nextInt();
                transpose[j][j] = matrix[i][i];
            }
        }
        for(i = 0 ; i<s;i++){
            for (j=0;j<s;j++){
                System.out.println(matrix[i][i]+"\t");
            }
        }
    }
}
