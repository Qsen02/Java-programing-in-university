import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

class Book{
    public String authorModel;
    public String titleModel;
    public int yearModel;
   public Book(String author,String title,int year){
       authorModel=author;
       titleModel=title;
       yearModel=year;
   }

   public void printInfo(){
       System.out.printf("Author:%s Title:%s Year:%d\n",authorModel,titleModel,yearModel);
   }
}
class Student{
    public String nameModel;
    public int ageModel;
    public double gradeModel;
    public String genderModel;

    public Student(String name, int age, double grade, String gender){
        nameModel=name;
        ageModel=age;
        gradeModel=grade;
        genderModel=gender;
    }

    public void showStudent(){
        System.out.printf("Name:%s Age:%d Grade:%f Gender:%s",nameModel,ageModel,gradeModel,genderModel);
    }
}

public class DynamicStructures {
    public static void main(String[] args) {
 		one();
 		two();
        three();
        four();
        five();
        six();
    }

    public static void one() {
        System.out.println("--1--");
        Scanner obj = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n;
        while (true) {
            n = obj.nextInt();
            if (n == -1) {
                break;
            }
            list.add(n);
        }
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        int divider = obj.nextInt();
        int index = list.indexOf(divider);
        for (int i = 0; i < index; i++) {
            list1.add(list.get(i));
        }
        for (int i = index + 1; i < list.size(); i++) {
            list2.add(list.get(i));
        }
        String firsLitst = "";
        String secondList = "";
        for (int num : list1) {
            firsLitst += num + " ";
        }
        System.out.println(list1);
        for (int num : list2) {
            secondList += num + " ";
        }
        System.out.println(list2);
    }

    public static void two() {
        System.out.println("--2--");
        Scanner obj = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        int n;
        n = obj.nextInt();
        for (int i = 0; i <= n; i++) {
            double num = Math.pow(-i, 2) + 3 * i - 2;
            list.add(num);
        }
        for (double num : list) {
            System.out.println(num);
        }
    }

    public static void three() {
        System.out.println("--3--");
        Scanner obj = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        int n;
        n = obj.nextInt();
        for (int i = 0; i <= n; i++) {
            double num = Math.pow(2, i);
            list.add(num);
        }
        for (double num : list) {
            System.out.println(num);
        }
    }

    public static void four() {
        System.out.println("--4--");
        Scanner obj = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listModifier = new ArrayList<Integer>();
        int n;
        n = obj.nextInt();
        for (int i = 0; i <= 9; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            listModifier.add(n);
            listModifier.add(list.get(i));
        }
        String result = "";
        for (int num : listModifier) {
            result += num + " ";
        }
        System.out.println(result);
    }

    public static void five() {
        System.out.println("--5--");
        Scanner obj = new Scanner(System.in);
        ArrayList<Student> studentlist = new ArrayList<Student>();
        String choice = "y";
        while (choice.equals("y")) {
            System.out.println("Do you want to enter more students (y/n)?");
            choice = obj.next();
            if (choice.equals("y")) {
                System.out.println("Add student:");
                String name = obj.next();
                int age = obj.nextInt();
                double grade = obj.nextDouble();
                String gender = obj.next();
                Student student = new Student(name, age, grade, gender);
                studentlist.add(student);
            } else {
                break;
            }
        }
        System.out.println("Enter student for searching");
        String studentName = obj.next();
        for (Student curStudent : studentlist) {
            Student student = curStudent;
            if (student.nameModel.equals(studentName)) {
                student.showStudent();
            }
        }
    }

    public static void six() {
        System.out.println("--6--");
        Scanner obj = new Scanner(System.in);
        ArrayList<Book> booklist = new ArrayList<Book>();
        String choice = "y";
        while (choice.equals("y")) {
            System.out.println("Do you want to enter more books (y/n)?");
            choice = obj.next();
            if (choice.equals("y")) {
                System.out.println("Add book:");
                String author = obj.next();
                String title = obj.next();
                int year = obj.nextInt();
                Book book = new Book(author, title, year);
                booklist.add(book);
            } else {
                break;
            }
        }
        for (Book curBook : booklist) {
            Book book = curBook;
            book.printInfo();
        }
    }
}