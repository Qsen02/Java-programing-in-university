import java.util.Scanner;
import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;

class Student implements Serializable{
    private String fname;
    private String lname;
    private double grade;
    private char gender;
    public Student(String fname, String lname, double grade, char gender) {
        this.fname = fname;
        this.lname = lname;
        this.grade = grade;
        this.gender = gender;
    }
    public void print(){
        System.out.println(this.fname);
        System.out.println(this.lname);
        System.out.println(this.grade);
        System.out.println(this.gender);
    }
}

public class Exercise3 {
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    ArrayList<Student> students=new ArrayList<>();
    String filename="Students.txt";
    char choice='y';
    while(choice=='y'){
        System.out.println("Do you want to add more students? (y/n):");
        choice=obj.next().charAt(0);
        if(choice=='y'){
            System.out.println("Enter student name:");
            String fname=obj.next();
            String lname=obj.next();
            double grade=obj.nextDouble();
            char gender=obj.next().charAt(0);
            Student student=new Student(fname,lname,grade,gender);
            students.add(student);
        }
    }
    try{
        FileOutputStream file=new FileOutputStream(filename);
        ObjectOutputStream out=new ObjectOutputStream(file);
        for(Student student:students) {
            out.writeObject(student);
        }
        out.close();
        file.close();
        System.out.println("File written successfully!");
    }catch(Exception error){
        System.out.println("We have an error!");
        error.printStackTrace();
    }
    try{
        FileInputStream file=new FileInputStream(filename);
        ObjectInputStream in=new ObjectInputStream(file);
        for(Student student:students) {
            student = (Student) in.readObject();
            student.print();
        }
        System.out.println("File read successfully!");
        in.close();
        file.close();
    }catch(Exception error){
        System.out.println("We have an error!");
        error.printStackTrace();
    }
    }
}