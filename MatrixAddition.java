import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int noOfRowsFirstMatrix = sc.nextInt();
        System.out.println("Enter number of columms:");
        int noOfColumnsFirstMatrix = sc.nextInt();
        System.out.println("Enter number of rows (2nd Matrix):");
        int noOfRowsSecondMatrix = sc.nextInt();
        System.out.println("Enter no of columns(2nd matrix):");
        int noOfColumnsSecondMatrix = sc.nextInt();
        if(noOfRowsFirstMatrix != noOfColumnsFirstMatrix || noOfColumnsFirstMatrix!=noOfColumnsSecondMatrix || noOfRowsFirstMatrix != noOfRowsSecondMatrix ){
            System.out.println("Matrix Addition Not Possible");
        }
        else{
            int firstMatrix[][] = new int[noOfRowsFirstMatrix][noOfColumnsFirstMatrix];
            for (int i = 0 ; i<noOfRowsFirstMatrix ; i++){
                for (int j = 0 ;j<noOfColumnsFirstMatrix  ;j++){
                    System.out.printf("Enter %d %d element(first matrix)\n",i+1,j+1);
                    firstMatrix[i][j] = sc.nextInt();
                }
            }
            int secondMatrix[][] = new int[noOfRowsSecondMatrix][noOfColumnsSecondMatrix];
            for (int i = 0; i<noOfRowsSecondMatrix  ; i++){
                for (int j = 0 ; j<noOfColumnsSecondMatrix  ; j++){
                    System.out.printf("Enter %d %d element(second matrix)\n",i+1,j+1);
                    secondMatrix[i][j] = sc.nextInt();
                }
            }
            System.out.println();
            int addMatrix[][]= new int[noOfColumnsFirstMatrix][noOfColumnsSecondMatrix];
            for(int i = 0 ; i<noOfColumnsFirstMatrix;i++){
                for (int j =0;j<noOfColumnsFirstMatrix;j++){
                    addMatrix[i][j]=(firstMatrix[i][j] + secondMatrix[i][j]);
                }
            }
            for(int i = 0 ; i<noOfColumnsFirstMatrix;i++){
                for (int j =0;j<noOfColumnsFirstMatrix;j++){
                    System.out.print(addMatrix[i][j]+" ");
                }
                System.out.println("");
            }

        }
        sc.close();
    }

}
