import java.util.Scanner;
import java.lang.Math;

class Series{
    public static int tribonachi(int n) {
        if (n == 1 || n == 2 || n == 3) {
            return 1;
        } else {
            return tribonachi(n - 1) + tribonachi(n - 2) + tribonachi(n - 3);
        }
    }
}

class Average{
    public static boolean checkAverage(int[] arr1, int[] arr2){
        int sum1=0,sum2=0;
      for(int el: arr1){
        sum1+=el;
      }
      for(int el: arr2){
          sum2+=el;
      }
      if((sum1/arr1.length)==(sum2/arr2.length)){
          return true;
      }else{
          return false;
      }
    }
}

class Triplet{
    public static boolean checkP(int a, int b, int c){
        if(Math.pow(c,2)==Math.pow(a,2)+Math.pow(b,2)){
            return true;
        }else{
            return false;
        }
    }
}

class Equation{
    public static void makeEquation(int p, int q){
        System.out.printf("x^2-%dx+%dx",p+q,p*q);
    }
}

class Order{
    public static double deliveryPrice=5.5;
    public static void calcPrice(double pizzaPrice,int pizzaAmount,double drinkPrice,int drinkAmount){
        if(pizzaPrice<0||pizzaAmount<0||drinkPrice<0||drinkAmount<0){
            System.out.println("Error");
        }else{
            System.out.println(pizzaAmount*pizzaPrice+drinkPrice*drinkAmount+deliveryPrice);
        }
    }
}

class Trip{
    public static double bedPrice=7.5;
    public static double calc(int days,int beds, double ticket){
        return beds*bedPrice*days+2*ticket;
    }
}

class Employee{
    public static void print(String fname,String lname, int age, String position){
        if(age<0){
            System.out.println("Invalid age!");
        }else{
            System.out.printf("Name: %s %s\n",fname,lname);
            System.out.printf("Age: %d\n",age);
            System.out.printf("Position: %s",position);
        }
    }
}

class Point{
    public static double distance(int x1,int y1,int x2, int y2){
        return Math.sqrt(Math.pow(y2-y1,2)+Math.pow(x2-x1,2));
    }
}

class Triangle{
    public static double area(double a, double h){
        if(a<0||h<0){
            return -1;
        }else{
            return (a*h)/2;
        }
    }
}

public class Methods
{
    public static void nine(){
        System.out.println("--9--");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(Series.tribonachi(i));
        }
    }
    public static void eigth(){
        System.out.println("--8--");
        Scanner obj=new Scanner(System.in);
        int[] arr1=new int[10];
        int[] arr2=new int[10];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=obj.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=obj.nextInt();
        }
        System.out.println(Average.checkAverage(arr1,arr2));
    }
    public static void seven(){
        System.out.println("--7--");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        System.out.println(Triplet.checkP(a,b,c));
    }
    public static void six(){
        System.out.println("--6--");
        Scanner obj=new Scanner(System.in);
        int p=obj.nextInt();
        int q=obj.nextInt();
        Equation.makeEquation(p,q);
    }
    public static void five(){
        System.out.println("--5--");
        Scanner obj=new Scanner(System.in);
        double pizzaPrice=obj.nextDouble();
        int pizzaAmount=obj.nextInt();
        double drinkPrice=obj.nextDouble();
        int drinkAmount=obj.nextInt();
        Order.calcPrice(pizzaPrice,pizzaAmount,drinkPrice,drinkAmount);
    }
    public static void four(){
        System.out.println("--4--");
        Scanner obj=new Scanner(System.in);
        int days=obj.nextInt();
        int beds=obj.nextInt();
        double ticket=obj.nextDouble();
        System.out.println(Trip.calc(days,beds,ticket));
    }
    public static void three(){
        System.out.println("--3--");
        Scanner obj=new Scanner(System.in);
        String fname=obj.next();
        String lname=obj.next();
        int age=obj.nextInt();
        String position=obj.next();
        Employee.print(fname,lname,age,position);
    }
    public static void two(){
        System.out.println("--2--");
        Scanner obj=new Scanner(System.in);
        int x1=obj.nextInt();
        int y1=obj.nextInt();
        int x2=obj.nextInt();
        int y2=obj.nextInt();
        System.out.println(Point.distance(x1,y1,x2,y2));
    }
    public static void one(){
        System.out.println("--1--");
        Scanner obj=new Scanner(System.in);
        double a=obj.nextDouble();
        double h=obj.nextDouble();
        System.out.println(Triangle.area(a,h));
    }
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
        six();
        seven();
        eigth();
        nine();
    }
}