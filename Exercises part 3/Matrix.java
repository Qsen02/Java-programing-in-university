import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        one();
        two();
        three();
    }
    public static void one() {
        System.out.println("--1--");
        Scanner obj=new Scanner(System.in);
        int[][] matrix=new int[4][4];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=obj.nextInt();
            }
        }
        String col="";
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                col+=matrix[j][i];
            }
            System.out.println(col);
            col="";
        }
    }
    public static void two() {
        System.out.println("--2--");
        Scanner obj=new Scanner(System.in);
        int[][] matrix=new int[4][4];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=obj.nextInt();
            }
        }
        int sum=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                sum+=matrix[i][j];
            }
            System.out.printf("Row:%d Sum:%d\n",i+1,sum);
            sum=0;
        }
    }
    public static void three() {
        System.out.println("--3--");
        Scanner obj = new Scanner(System.in);
        int[][] matrix=new int[4][4];
        int generalDiagonal=1, secondaryDigonal=1;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
                    generalDiagonal*=matrix[i][i];
        }
        for(int i=0;i<matrix.length;i++){
            secondaryDigonal*=matrix[i][matrix.length-1-i];
        }
        System.out.printf("General diagonal:%d\n",generalDiagonal);
        System.out.printf("Secondary diagonal:%d\n",secondaryDigonal);
        if(generalDiagonal>secondaryDigonal){
            System.out.println("General diagonal is  bigger");
        }else if(generalDiagonal==secondaryDigonal){
            System.out.println("The diagonals are equal");
        }else if(generalDiagonal<secondaryDigonal){
            System.out.println("Secondary diagonal is bigger");
        }
    }
}