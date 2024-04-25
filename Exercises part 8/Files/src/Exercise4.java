import java.util.Scanner;
import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;

class Laptop implements Serializable{
    private int ram;
    private double cpuClock;
    private String cpuModel;
    private String gpuModel;
    public Laptop(int ram, double cpuClock, String cpuModel, String gpuModel) {
        this.ram = ram;
        this.cpuClock = cpuClock;
        this.cpuModel = cpuModel;
        this.gpuModel = gpuModel;
    }
    public void print(){
        System.out.println(this.ram);
        System.out.println(this.cpuClock);
        System.out.println(this.cpuModel);
        System.out.println(this.gpuModel);
    }

}

public class Exercise4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String filename="Laptop.txt";
     ArrayList<Laptop> laptops = new ArrayList<>();
     char choise='y';
     while(choise=='y'){
         System.out.println("Do you want to enter more laptops? (y/n)");
         choise = sc.next().charAt(0);
         if(choise=='y'){
             System.out.println("Enter next laptop: ");
             int ram = sc.nextInt();
             double cpuClock = sc.nextDouble();
             String cpuModel = sc.next();
             String gpuModel = sc.next();
             Laptop laptop = new Laptop(ram, cpuClock, cpuModel, gpuModel);
             laptops.add(laptop);
         }
     }
     try{
         FileOutputStream file=new FileOutputStream(filename);
         ObjectOutputStream out=new ObjectOutputStream(file);
         for(Laptop laptop:laptops){
             out.writeObject(laptop);
         }
         out.close();
         file.close();
         System.out.println("File was write successfully!");
     }catch(Exception error){
         System.out.println("We have an error!");
         error.printStackTrace();
     }
     try{
         FileInputStream file=new FileInputStream(filename);
         ObjectInputStream in=new ObjectInputStream(file);
         for(Laptop laptop:laptops){
             laptop=(Laptop)in.readObject();
             laptop.print();
         }
         in.close();
         file.close();
         System.out.println("File was read successfully!");
     }catch(Exception error){
         System.out.println("We have an error!");
         error.printStackTrace();
     }
    }
}