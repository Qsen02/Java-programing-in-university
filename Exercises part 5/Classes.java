import java.util.Scanner;
import java.lang.Math;

class Laptop{
    public int ram;
    public double cpuClock;
    public String cpuModel;
    public String gpuModel;
}

class Reseat {
  public String date;
  public int amount;
  public int tax;
}

class Date{
    public int daydOfMonth;
    public int daydOfWeek;
    public int month;
    public int year;
}
class Time{
    public int hour;
    public int minute;
    public int second;
    public int milisecond;
}

class Triangle{
    public double a;
    public double b;
    public double c;
}

class Student{
    public String firstName;
    public String lastName;
    public double grade;
    public String gender;
}

class Point{
    public int x;
    public int y;
}

class Rational{
    public int enumerator;
    public int denumerator;
}

public class Classes
{

    public static void main(String[] args) {
        System.out.println("--1--");
        Scanner obj=new Scanner(System.in);
        Rational f1=new Rational();
        Rational f2=new Rational();
        f1.enumerator=obj.nextInt();
        f1.denumerator=obj.nextInt();
        f2.enumerator=obj.nextInt();
        f2.denumerator=obj.nextInt();
        System.out.println((f1.enumerator*f2.denumerator+f2.enumerator*f1.denumerator)/(f1.denumerator*f2.enumerator));

        System.out.println("--2--");
        Point p1=new Point();
        Point p2=new Point();
        p1.x=obj.nextInt();
        p1.y=obj.nextInt();
        p2.x=obj.nextInt();
        p2.y=obj.nextInt();
        System.out.println(Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2)));

        System.out.println("--3--");
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        System.out.println("Student 1:");
        s1.firstName=obj.next();
        s1.lastName=obj.next();
        s1.grade=obj.nextDouble();
        s1.gender=obj.next();
        System.out.println("Student 2:");
        s2.firstName=obj.next();
        s2.lastName=obj.next();
        s2.grade=obj.nextDouble();
        s2.gender=obj.next();
        System.out.println("Student 3:");
        s3.firstName=obj.next();
        s3.lastName=obj.next();
        s3.grade=obj.nextDouble();
        s3.gender=obj.next();
        System.out.println("Student 4:");
        s4.firstName=obj.next();
        s4.lastName=obj.next();
        s4.grade=obj.nextDouble();
        s4.gender=obj.next();
        System.out.printf("firstName: %s lastName: %s grade: %f gender: %s/n",s1.firstName,s1.lastName,s1.grade,s1.gender);
        System.out.printf("firstName: %s lastName: %s grade: %f gender: %s/n",s2.firstName,s2.lastName,s2.grade,s2.gender);
        System.out.printf("firstName: %s lastName: %s grade: %f gender: %s/n",s3.firstName,s3.lastName,s3.grade,s3.gender);
        System.out.printf("firstName: %s lastName: %s grade: %f gender: %s/n",s4.firstName,s4.lastName,s4.grade,s4.gender);

        System.out.println("--4--");
        Triangle t=new Triangle();
        double side1=obj.nextInt();
        double side2=obj.nextInt();
        double side3=obj.nextInt();
        if(side1<side2+side3 && side2<side1+side3 && side3<side2+side1){
            t.a=side1;
            t.b=side2;
            t.c=side3;
            System.out.println(t.a);
            System.out.println(t.b);
            System.out.println(t.c);
        }else{
            System.out.println("Error");
        }

        System.out.println("--5--");
        Time tm=new Time();
        int h=obj.nextInt();
        int m=obj.nextInt();
        int s=obj.nextInt();
        int ms=obj.nextInt();
        if((h<12 && h>=0) && (m<60 && m>=0)&& (s<60 && s>=0)&& (ms<1000 && ms>=0)){
            tm.hour=h;
            tm.minute=m;
            tm.second=s;
            tm.milisecond=ms;
            System.out.printf("%d:%d:%d:%d",tm.hour,tm.minute,tm.second,tm.milisecond);
        }else{
            System.out.println("Error");
        }

        System.out.println("--6--");
        Date dt=new Date();
        int dm=obj.nextInt();
        int dw=obj.nextInt();
        int month=obj.nextInt();
        int y=obj.nextInt();
        if ((dm < 32 && dm > 0) && (dw < 8 && dw > 0) && (month < 13 && month > 0) ) {
            dt.daydOfMonth=dm;
            dt.daydOfWeek=dw;
            dt.month=month;
            dt.year=y;
            System.out.printf("%d.%d.%d.%d",dt.daydOfMonth,dt.daydOfWeek,dt.month,dt.year);
        }else{
            System.out.println("Error");
        }

        System.out.println("--7--");
        Reseat fac=new Reseat();
        String date=obj.nextLine();
        int amount=obj.nextInt();
        int tax=obj.nextInt();
        if(amount<0 || tax<0){
            System.out.println("Error");
        }else{
            fac.date=date;
            fac.amount=amount;
            fac.tax=tax;
            System.out.printf("Date: %s amount: %d price: %d",fac.date,fac.amount,fac.tax);
        }

        System.out.println("--8--");
        Laptop l1=new Laptop();
        Laptop l2=new Laptop();
        System.out.println("First laptop");
        l1.ram=obj.nextInt();
        l1.cpuClock=obj.nextDouble();
        l1.cpuModel=obj.next();
        l1.gpuModel=obj.next();
        System.out.println("Second laptop");
        l2.ram=obj.nextInt();
        l2.cpuClock=obj.nextDouble();
        l2.cpuModel=obj.next();
        l2.gpuModel=obj.next();
        if(l1.ram>l2.ram){
            System.out.println("first laptop is better");
        }else if(l2.ram>l1.ram){
            System.out.println("second laptop is better");
        }else if(l1.ram==l2.ram){
            if(l1.cpuClock>l2.cpuClock){
                System.out.println("first laptop is better");
            }else{
                System.out.println("second laptop is better");
            }
        }
    }
}