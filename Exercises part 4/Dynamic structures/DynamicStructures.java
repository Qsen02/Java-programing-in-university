import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;


public class DynamicStructures {
    public static void main(String[] args) {
 		one();
 		two();
        three();
        four();
    }
    public static void one(){
        System.out.println("--1--");
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int n;
        while(true){
            n=obj.nextInt();
            if(n==-1){
                break;
            }
            list.add(n);
        }
        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        int divider=obj.nextInt();
        int index=list.indexOf(divider);
        for(int i=0;i<index;i++){
            list1.add(list.get(i));
        }
        for(int i=index+1;i<list.size();i++){
            list2.add(list.get(i));
        }
        String firsLitst="";
        String secondList="";
        for(int num:list1){
            firsLitst+=num+" ";
        }
        System.out.println(list1);
        for(int num:list2){
            secondList+=num+" ";
        }
        System.out.println(list2);
    }
    public static void two(){
        System.out.println("--2--");
        Scanner obj=new Scanner(System.in);
        ArrayList<Double> list=new ArrayList<Double>();
        int n;
        n=obj.nextInt();
        for(int i=0;i<=n;i++){
            double num=Math.pow(-i,2)+3*i-2;
            list.add(num);
        }
        for(double num:list){
            System.out.println(num);
        }
    }
    public static void three(){
        System.out.println("--3--");
        Scanner obj=new Scanner(System.in);
        ArrayList<Double> list=new ArrayList<Double>();
        int n;
        n=obj.nextInt();
        for(int i=0;i<=n;i++){
            double num=Math.pow(2,i);
            list.add(num);
        }
        for(double num:list){
            System.out.println(num);
        }
    }
    public static void four(){
        System.out.println("--4--");
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> listModifier=new ArrayList<Integer>();
        int n;
        n=obj.nextInt();
        for(int i=0;i<=9;i++){
            list.add(i);
        }
        for(int i=0;i<list.size();i++){
            listModifier.add(n);
            listModifier.add(list.get(i));
        }
        String result="";
        for(int num:listModifier){
            result+=num+" ";
        }
        System.out.println(result);
    }
}