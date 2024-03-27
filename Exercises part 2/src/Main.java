//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        one();
        two();
    }
    public static void one() {
        System.out.println("--1--");
     Scanner obj=new Scanner(System.in);
     int elements;
     elements=obj.nextInt();
     int[] array=new int[elements];
     for(int i=0;i<elements;i++){
         array[i]=obj.nextInt();
     }
     for(int i=array.length-1;i>=0;i--){
         System.out.println(array[i]);
     }
    }
    public static void two() {
        System.out.println("--2--");
        Scanner obj=new Scanner(System.in);
        int elements;
        double product=1,sum=0;
        elements=obj.nextInt();
        int[] array=new int[elements];
        for(int i=0;i<elements;i++){
            array[i]=obj.nextInt();
        }
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            product*=array[i];
        }
        System.out.printf("Sum: %f ",sum);
        System.out.printf("Product: %f ",product);
        System.out.printf("Average: %f ",sum/array.length);
    }
}