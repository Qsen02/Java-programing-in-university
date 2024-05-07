//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.Math;

class Worker{
    public String firstname;
    public String lastname;
    public double salary;
    public int probation;
    public String speciality;
    public Worker(String firstname, String lastname, double salary, int probation, String speciality){
        this.firstname=firstname;
        this.lastname=lastname;
        this.salary=salary;
        this.probation=probation;
        this.speciality=speciality;
    }
    public void printWorker(){
        System.out.printf("Name: %s %s\n",this.firstname,this.lastname);
        System.out.printf("Salary: %.2f\n",this.salary);
        System.out.printf("Probation: %d\n",this.probation);
        System.out.printf("Speciality: %s\n",this.speciality);
    }
}

class Cleaner extends Worker{
    public Cleaner(String firstname, String lastname, double salary, int probation) {
        super(firstname, lastname, salary, probation, "Cleaner");
    }
}

class Accountant extends Worker{
    public Accountant(String firstname, String lastname, double salary, int probation) {
        super(firstname, lastname, salary, probation, "Accountant");
    }
}

class Programmer extends Worker{
    public Programmer(String firstname, String lastname, double salary, int probation) {
        super(firstname, lastname, salary, probation, "Programmer");
    }
}

class Manager extends Worker{
    public Manager(String firstname, String lastname, double salary, int probation) {
        super(firstname, lastname, salary, probation, "Manager");
    }
}

class Piar extends Worker{
    public Piar(String firstname, String lastname, double salary, int probation) {
        super(firstname, lastname, salary, probation, "Piar");
    }
}

class Planet{
    public double diameter;
    public double mass;
    public String type;
    public Planet(double diameter,double mass,String species){
        this.diameter=diameter;
        this.mass=mass;
        this.type =species;
    }
    public void printPlanet(){
        System.out.printf("Diameter: %f\n",this.diameter);
        System.out.printf("Mass: %f\n",this.mass);
        System.out.printf("Type: %s\n",this.type);
    }
}

class Mercury extends Planet{
    public Mercury(double diameter,double mass,String type){
        super(diameter,mass,type);
    }
}

class Venus extends Planet{
    public Venus(double diameter,double mass,String type) {
        super(diameter, mass, type);
    }
}

class Earth extends Planet{
    public Earth(double diameter,double mass,String type) {
        super(diameter, mass, type);
    }
}

class Jupiter extends Planet{
    public Jupiter(double diameter,double mass,String type) {
        super(diameter, mass, type);
    }
}

class Saturn extends Planet{
    public Saturn(double diameter,double mass,String type) {
        super(diameter, mass, type);
    }
}

class Figure{
    public double area;
    public double perimeter;
    public Figure(double area,double perimeter){
        this.area=area;
        this.perimeter=perimeter;
    }
    public void print(){
        System.out.printf("Periemeter: %f\n",this.perimeter);
        System.out.printf("Area: %f\n",this.area);
    }
}

class Triangle extends Figure{
    private int a;
    private int b;
    private int c;
    private int h;
    public Triangle(double area, double perimeter,int a, int b,int c, int h){
        super(area,perimeter);
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
    }
    public void triangleArea(){
        this.area=(this.a*this.h)/2;
    }
    public void trianglePeriemeter(){
        this.perimeter=this.a+this.b+this.c;
    }
}

class Rectangle extends Figure{
    private int a;
    private int b;
    public Rectangle(double area, double perimeter,int a, int b){
        super(area,perimeter);
        this.a=a;
        this.b=b;
    }
    public void rectangleArea(){
        this.area=this.a*this.b;
    }
    public void rectanglePerimeter(){
        this.perimeter=(this.a+this.b)*2;
    }
}

class Circle extends Figure{
    private int r;
    public Circle(double area,double perimeter,int r){
        super(area,perimeter);
        this.r=r;
    }
    public void circlePerimeter(){
        this.perimeter=2*Math.PI*r;
    }
    public void circleArea(){
        this.area=Math.PI*Math.pow(r,2);
    }
}

class Trapezoid extends Figure{
    private int a;
    private int b;
    private int c;
    private int h;
    public Trapezoid(double area, double perimeter, int a, int b, int c, int h){
        super(area,perimeter);
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
    }
    public void trapezoidArea(){
        this.area=((this.a+this.b)*this.h)/2;
    }
    public void trapezoidPerimeter(){
        this.perimeter=this.a+this.b+2*this.c;
    }
}

class Parallelogram extends Figure{
    private int a;
    private int b;
    private int h;
    public Parallelogram(double area,double perimeter,int a, int b, int h){
        super(area,perimeter);
        this.a=a;
        this.b=b;
        this.h=h;
    }
    public void parallelogramArea(){
        this.area=this.a*this.h;
    }
    public void parallelogramPer(){
        this.perimeter=(this.a+this.b)*2;
    }
}

class Atom{
    public int protons;
    public int electrons;
    public Atom(int protons, int electrons){
        this.protons=protons;
        this.electrons=electrons;
    }
    public void printAtom(){
        System.out.printf("Protons: %d\n",this.protons);
        System.out.printf("Electrons: %d\n",this.electrons);
    }
}

class Oxygen extends Atom{
    public Oxygen(int protons, int electrons){
        super(protons,electrons);
    }
}

class Hydrogen extends Atom{
    public Hydrogen(int protons, int electrons){
        super(protons,electrons);
    }
}

class Chlorine extends Atom{
    public Chlorine(int protons, int electrons){
        super(protons,electrons);
    }
}

class Aluminium extends Atom{
    public Aluminium(int protons, int electrons){
        super(protons,electrons);
    }
}

class Titanium extends Atom{
    public Titanium(int protons, int electrons){
        super(protons,electrons);
    }
}
public class Main
{
    public static void four(){
        System.out.println("--4--");
        Cleaner cl=new Cleaner("Ivan","Ivanov",900,4);
        cl.printWorker();
        Accountant acc=new Accountant("Mariq","Dimitrova",1200.50,7);
        acc.printWorker();
        Programmer pr=new Programmer("Gosho", "Goshev",2000,5);
        pr.printWorker();
        Manager mn=new Manager("Pesho","Peshov",3000,10);
        mn.printWorker();
        Piar p=new Piar("Alexandra","Georgieva",1500,3);
        p.printWorker();;
    }
    public static void three(){
        System.out.println("--3--");
        System.out.println("Mercury");
        Mercury mer=new Mercury(2353.5,25435.75,"Rocky planet");
        mer.printPlanet();
        System.out.println("Venus");
        Venus ven=new Venus(4034.35,45356.134,"Rocky planet");
        ven.printPlanet();
        System.out.println("Earth");
        Earth earth=new Earth(6021.35,63425.134,"Rocky planet");
        earth.printPlanet();
        System.out.println("Jupiter");
        Jupiter jup=new Jupiter(60032.353,634257.257,"Gas giant");
        jup.printPlanet();
        System.out.println("Saturn");
        Saturn sat=new Saturn(40235.353,425433.257,"Gas giant");
        sat.printPlanet();
    }
    public static void two(){
        System.out.println("--2--");
        System.out.println("Triangle:");
        Triangle tr=new Triangle(0,0,3,2,5,6);
        tr.triangleArea();
        tr.trianglePeriemeter();
        tr.print();
        System.out.println("Rectangle:");
        Rectangle rec=new Rectangle(0,0,4,7);
        rec.rectangleArea();
        rec.rectanglePerimeter();
        rec.print();
        System.out.println("Circle");
        Circle c=new Circle(0,0,6);
        c.circleArea();
        c.circlePerimeter();
        c.print();
        System.out.println("Trapezoid:");
        Trapezoid trap=new Trapezoid(0,0,2,4,3,5);
        trap.trapezoidPerimeter();
        trap.trapezoidArea();
        trap.print();
        System.out.println("Parallelogram:");
        Parallelogram paral=new Parallelogram(0,0,5,3,4);
        paral.parallelogramArea();
        paral.parallelogramPer();
        paral.print();
    }
    public static void one(){
        System.out.println("--1--");
        System.out.println("Oxygen:");
        Oxygen o=new Oxygen(7,3);
        o.printAtom();
        System.out.println("Hydrogen:");
        Hydrogen h= new Hydrogen(2,3);
        h.printAtom();
        System.out.println("Chlorine:");
        Chlorine ch=new Chlorine(6,9);
        ch.printAtom();
        System.out.println("Aluminium:");
        Aluminium al=new Aluminium(10,15);
        al.printAtom();
        System.out.println("Titanium:");
        Titanium t=new Titanium(12,25);
        t.printAtom();
    }
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
    }
}