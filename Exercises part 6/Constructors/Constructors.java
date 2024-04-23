import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Time{
    private int hour;
    private int minute;
    private int second;
    private int millisecond;
    public Time(int hour, int minute, int second,int millisecond){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.millisecond = millisecond;
    }
    public int getHour(){
        return hour;
    }
    public void setHour(int newHour){
        this.hour = newHour;
    }
    public int getMinute(){
        return minute;
    }
    public void setMinute(int newMinute){
        this.minute = newMinute;
    }
    public int getSecond(){
        return second;
    }
    public void setSecond(int newSecond){
        this.second = newSecond;
    }
    public int getMillisecond(){
        return millisecond;
    }
    public void setMillisecond(int newMillisecond){
        this.millisecond = newMillisecond;
    }
    public void printTime(){
        System.out.printf("%d:%d:%d:%d", this.hour, this.minute, this.second, this.millisecond);
    }
}

class Triangle{
    private int a,b,c;
    public Triangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int getA(){
        return a;
    }
    public void setA(int newA){
        this.a=newA;
    }
    public int getB(){
        return b;
    }
    public void setB(int newB){
        this.b=newB;
    }
    public int getC(){
        return c;
    }
    public void setC(int newC){
        this.c=newC;
    }
}

class Student{
    private String firstName;
    private String lastName;
    private double grade;
    private String gender;
    public Student(String firstName,String lastName, double grade ,String gender){
        this.firstName=firstName;
        this.lastName=lastName;
        this.grade=grade;
        this.gender=gender;
    }
    public String getFirstName(){

        return firstName;
    }
    public void setFirstName(String newFirstName){
        this.firstName=newFirstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String newLastName){
        this.lastName=newLastName;
    }
    public double getGrade(){
        return grade;
    }
    public void setGrade(double newGrade){
        this.grade=newGrade;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String newGender){
        this.gender=newGender;
    }
}

class Point{
    private int x;
    private int y;
    public Point(int coordX,int coordY){
        this.x=coordX;
        this.y=coordY;
    }
    public int getX(){
        return x;
    }
    public void setX(int newX){
        this.x=newX;
    }
    public int getY(){
        return y;
    }
    public void setY(int newY){
        this.y=newY;
    }
}

class Rational{
    private int numenator;
    private int denumenator;
    public Rational(int num, int denum){
        this.numenator=num;
        this.denumenator=denum;
    }
    public int getNumenator(){
        return numenator;
    }
    public void setNumenator(int newNum){
        this.numenator=newNum;
    }
    public void setDenumenator(int newDenum){
        this.denumenator=newDenum;
    }
    public int getDenumenator(){
        return denumenator;
    }
}

public class Constructors {
    public static void five(){
        System.out.println("--5--");
        Scanner obj=new Scanner(System.in);
        int hour=obj.nextInt();
        int minute=obj.nextInt();
        int second=obj.nextInt();
        int millisecond=obj.nextInt();
        Time t=new Time(0,0,0,0);
        if((hour<13 && hour>0)&&(minute<60 && minute>0)&&(second<60 && second>0)&&(millisecond<1000 && millisecond>0)){
            t.setHour(hour);
            t.setMinute(minute);
            t.setSecond(second);
            t.setMillisecond(millisecond);
            t.printTime();
        }else{
            System.out.println("Error");
        }
    }
    public static void four(){
        System.out.println("--4--");
        Scanner obj=new Scanner(System.in);
        int a= obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        Triangle t=new Triangle(0,0,0);
        if(a<c+b && b<a+c && c<a+b){
            t.setA(a);
            t.setB(b);
            t.setC(c);
            System.out.println("Yes this is a triangle");
            System.out.printf("a:%d b:%d c:%d",t.getA(),t.getB(),t.getC());
        }else{
            System.out.println("No this is not a triangle");
        }
    }
    public static void three(){
        System.out.println("--3--");
        Scanner obj=new Scanner(System.in);
        ArrayList<Student> studentlist=new ArrayList<Student>();
        String choose="y";
        while(choose.equals("y")){
            System.out.println("Do you want to add more Students(y/n)?");
            choose=obj.next();
            if(choose.equals("y")){
                System.out.println("Next student:");
                Student student=new Student(" "," ",0," ");
                String firstName= obj.next();
                String lastName= obj.next();
                double grade= obj.nextDouble();
                String gender= obj.next();
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setGrade(grade);
                student.setGender(gender);
                studentlist.add(student);
            }else{
                break;
            }
        }
        for(Student student:studentlist){
            System.out.printf("First name:%s Last name:%s Grade:%f Gender:%s\n",student.getFirstName(),student.getLastName(),student.getGrade(),student.getGender());
        }
    }
    public static void two(){
        System.out.println("--2--");
        Scanner obj=new Scanner(System.in);
        Point p1=new Point(0,0);
        System.out.println("Enter coord for first point:");
        int x= obj.nextInt();
        int y= obj.nextInt();
        p1.setX(x);
        p1.setY(y);
        Point p2=new Point(0,0);
        System.out.println("Enter coord for second point:");
        int x1= obj.nextInt();
        int y1= obj.nextInt();
        p2.setX(x1);
        p2.setY(y1);
        System.out.println(Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2)));
    }
    public static void one(){
        System.out.println("--1--");
        Scanner obj=new Scanner(System.in);
        Rational rt1=new Rational(0,0);
        System.out.println("Enter numenator1:");
        int num= obj.nextInt();
        System.out.println("Enter denumenator1:");
        int denum= obj.nextInt();
        rt1.setNumenator(num);
        rt1.setDenumenator(denum);
        Rational rt2=new Rational(0,0);
        System.out.println("Enter numenator2:");
        int num1= obj.nextInt();
        System.out.println("Enter denumenator2:");
        int denum1= obj.nextInt();
        rt2.setNumenator(num1);
        rt2.setDenumenator(denum1);
        System.out.printf("Sum:%d/%d\n",rt1.getNumenator()+rt2.getNumenator(),rt1.getDenumenator()+rt2.getDenumenator());
        System.out.printf("Subtraction:%d/%d",rt1.getNumenator()-rt2.getNumenator(),rt1.getDenumenator()-rt2.getDenumenator());
    }
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
    }
}