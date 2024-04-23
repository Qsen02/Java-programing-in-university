import java.util.Scanner;
import java.lang.Math;

class Reseat{
    private String date;
    private int amount;
    private double price;
    public Reseat(String date, int amount, double price){
        this.date = date;
        this.amount = amount;
        this.price = price;
    }
    public String getDate(){
        return this.date;
    }
    public int getAmount(){
        return this.amount;
    }
    public double getPrice(){
        return this.price;
    }
    public void setDate(String newDate){
        this.date = newDate;
    }
    public void setAmount(int newAmount){
        this.amount = newAmount;
    }
    public void setPrice(double newTax){
        this.price = newTax;
    }
    public void printTax(){
        System.out.printf("Date:%s Amount:%d Tax:%f", this.date, this.amount,this.price *this.amount);
    }
}

class Date {
    private int dayOfMonth;
    private int month;
    private int dayOfWeek;
    private int year;

    public Date(int dayOfMonth, int month, int dayOfWeek, int year) {
        this.dayOfMonth = dayOfMonth;
        this.month = month;
        this.dayOfWeek = dayOfWeek;
        this.year = year;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public int getMonth() {
        return month;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public int getYear() {
        return year;
    }

    public void setDayOfMonth(int newDayOfMonth) {
        this.dayOfMonth = newDayOfMonth;
    }

    public void setMonth(int newMonth) {
        this.month = newMonth;
    }

    public void setDayOfWeek(int newDayOfWeek) {
        this.dayOfWeek = newDayOfWeek;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void printDate() {
            System.out.printf("%d.%d.%d.%d\n", this.dayOfMonth, this.month, this.dayOfWeek, this.year);
    }
}

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

 class Constructors {
    public static void seven(){
        System.out.println("--7--");
        Scanner obj = new Scanner(System.in);
        String date = obj.nextLine();
        int amount = obj.nextInt();
        double price=obj.nextDouble();
        if(amount>=0 && price>=0){
            Reseat res=new Reseat(date,amount,price);
            res.printTax();
        }else{
            System.out.println("Error");
        }
    }
    public static void six() {
        System.out.println("--6--");
        Scanner obj = new Scanner(System.in);
        int dm = obj.nextInt();
        int m = obj.nextInt();
        int dw = obj.nextInt();
        int y = obj.nextInt();
        if ((dm < 32 && dm > 0) && (m < 13 && m > 0) && (dw < 8 && dw > 0)) {
            Date date=new Date(dm,m,dw,y);
            date.printDate();
        }else{
            System.out.println("Invalid date!");
        }
    }
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
        System.out.println("Enter first student:");
        String firstName1=obj.next();
        String lastName1=obj.next();
        double grade1=obj.nextDouble();
        String gender1=obj.next();
        System.out.println("Enter second student:");
        String firstName2=obj.next();
        String lastName2=obj.next();
        double grade2=obj.nextDouble();
        String gender2=obj.next();
        System.out.println("Enter third student:");
        String firstName3=obj.next();
        String lastName3=obj.next();
        double grade3=obj.nextDouble();
        String gender3=obj.next();
        System.out.println("Enter fourth student:");
        String firstName4=obj.next();
        String lastName4=obj.next();
        double grade4=obj.nextDouble();
        String gender4=obj.next();
        Student s1=new Student(firstName1,lastName1,grade1,gender1);
        Student s2=new Student(firstName2,lastName2,grade2,gender2);
        Student s3=new Student(firstName3,lastName3,grade3,gender3);
        Student s4=new Student(firstName4,lastName4,grade4,gender4);
        System.out.printf("First name:%s Last name:%s Grade:%f Gender:%s\n",s1.getFirstName(),s1.getLastName(),s1.getGrade(),s1.getGender());
        System.out.printf("First name:%s Last name:%s Grade:%f Gender:%s\n",s2.getFirstName(),s2.getLastName(),s1.getGrade(),s2.getGender());
        System.out.printf("First name:%s Last name:%s Grade:%f Gender:%s\n",s3.getFirstName(),s3.getLastName(),s1.getGrade(),s3.getGender());
        System.out.printf("First name:%s Last name:%s Grade:%f Gender:%s\n",s4.getFirstName(),s4.getLastName(),s1.getGrade(),s4.getGender());
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
        six();
        seven();
    }
}