//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.Math;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
        six();
        seven();
        eight();
        nine();
        ten();
        eleven();
        twelve();
        thirteen();
        fourteen();
        fifteen();
        sixteen();
    }
    public static void one(){
        System.out.println("--1--");
        double a=2.5,b=3.756;
        double c=Math.pow(a,3)+Math.pow(b,2);
        System.out.println(c);
    }

    public static void two(){
        System.out.println("--2--");
        double a=3.1415,b=2.71828 ;
        double c=Math.pow(a,3)-Math.pow(b,2);
        System.out.println(c);
    }

    public static void three(){
        System.out.println("--3--");
        double a=2,b=1.27,c=-2,d=2.7;
        double result=(Math.pow(a,2.65)-Math.pow(b,6.75))/(Math.pow(c,4)-Math.pow(d,3.45));
        System.out.println(result);
    }

    public static void four(){
        System.out.println("--4--");
        double a=2.18,b=3.18;
        double result=Math.pow(Math.pow(a,2)+Math.pow(b,7.15),2.138-3.1);
        System.out.println(result);
    }

    public static void five(){
        System.out.println("--5--");
        double a=2,b=-3;
        double result=Math.pow(a,-1)+Math.pow(b,-1);
        System.out.println(result);
    }
    public static void six(){
        System.out.println("--6--");
        boolean result=Math.pow(1+2+3,2)== Math.pow(4-3-2,2);
        System.out.println(result);
    }
    public static void seven(){
        System.out.println("--7--");
        boolean result=7%4==6%3;
        System.out.println(result);
    }

    public static void eight(){
        System.out.println("--8--");
        boolean truthy=true;
        boolean falsy=false;
        boolean result=!(truthy&&falsy);
        System.out.println(result);
    }
    public static void nine(){
        System.out.println("--9--");
        boolean truthy=true;
        boolean falsy=false;
        boolean result=!truthy&&!falsy;
        System.out.println(result);
    }
    public static void  ten(){
        System.out.println("--10--");
        Scanner myObj=new Scanner(System.in);
        int month;
        month=myObj.nextInt();
        int days=0;
        if(month==1){
            days=31;
        }else if(month==2){
            days=28;
        }else if(month==3){
            days=31;
        }else if(month==4){
            days=30;
        }else if(month==5){
            days=31;
        }else if(month==6){
            days=30;
        }else if(month==7){
            days=31;
        }else if(month==8){
            days=31;
        }else if(month==9){
            days=30;
        }else if(month==10){
            days=31;
        }else if(month==11){
            days=30;
        }else if(month==12) {
            days=31;
        }else{
            System.out.println("Invalid month!");
        }
        System.out.println(days);
    }
    public static void eleven() {
        System.out.println("--11--");
       Scanner myObj=new Scanner(System.in);
       int n;
       n=myObj.nextInt();
       double result=0;
       for(int i=1;i<=n;i++){
           result+=(Math.pow(i,2)-1)/(Math.pow(i,2)+1);
       }
       System.out.println(result);
    }
    public static void twelve() {
        System.out.println("--12--");
        Scanner myObj=new Scanner(System.in);
        int n;
        n=myObj.nextInt();
        double result=1;
        for(int i=2;i<=n;i++){
            result*=(i-1)/(i+1);
        }
        System.out.println(result);
    }
    public static void thirteen(){
        System.out.println("--13--");
        Scanner myObj=new Scanner(System.in);
        int n, count=0;
        n=myObj.nextInt();
        if(n>0){
            System.out.println("Number must be negative!");
            return;
        }
        for(int i=-1;i>=n;i--){
            if(i%7==0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void fourteen(){
        System.out.println("--14--");
        Scanner myObj=new Scanner(System.in);
        int n;
        n=myObj.nextInt();
        for(int i=1;i<=n;i++){
           if(Math.pow(i,2)<n){
           System.out.println(i);
           }
        }
    }
    public static void fifteen(){
        System.out.println("--15--");
        Scanner myObj=new Scanner(System.in);
        int n,before=0;
        n=myObj.nextInt();
        for(int i=1;i<=n;i++){
            if(i+before<=n){
                System.out.println(i);
            }
            before=i;
        }
    }
    public static void sixteen() {
        System.out.println("--16--");
        Scanner myObj=new Scanner(System.in);
        int rows;
        String symbol="";
        rows=myObj.nextInt();
        for(int i=1;i<=rows;i++) {
            symbol+="*";
            if(i>1) {
                for(int j=2;j<=i;j++){
                    symbol+=" ";
                }
                symbol += "*";
            }
            System.out.println(symbol);
            symbol="";
        }
        for(int i=1;i<=rows;i++){
            symbol+="*";
        }
        System.out.println(symbol);
    }
}