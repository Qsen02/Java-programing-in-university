import java.io.*;
import java.util.Scanner;
import java.io.Serializable;

class User implements Serializable{
    private String username;
    private String password;
    public User(String username,String password) {
        this.username=username;
        this.password=password;
    }
    public void print() {
        System.out.println(this.username);
        System.out.println(this.password);
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String filename="AnotherUsers.txt";
        System.out.println("Enter username and password");
        String username=obj.next();
        String password=obj.next();
        User user=new User(username,password);
        try {
            FileOutputStream file=new FileOutputStream(filename);
            ObjectOutputStream ou=new ObjectOutputStream(file);
            ou.writeObject(user);
            ou.close();
            file.close();
            System.out.println("Serialization was succesful");
        }catch(Exception error) {
            System.out.println("We have an error");
            error.printStackTrace();
        }
        User u2=null;
        try {
            FileInputStream file=new FileInputStream(filename);
            ObjectInputStream in=new ObjectInputStream(file);
            u2=(User)in.readObject();
            in.close();
            file.close();
            System.out.println("Reading was succesful");
            user.print();
        }catch(Exception error) {
            System.out.println("We have an error");
            error.printStackTrace();
        }
    }
}