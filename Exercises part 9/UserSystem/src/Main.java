//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.*;
import java.io.Serializable;
import java.time.*;
import java.util.regex.*;
import java.util.ArrayList;

class User implements Serializable{
    public String username;
    public String password;
    public String id;
    public String email;
    public LocalDateTime regDate;
    public  double deposit;

    public User(String username, String password,String email) {
        this.username=username;
        this.password=password;
        this.id=String.valueOf(Instant.now().getEpochSecond());
        this.email=email;
        this.regDate=LocalDateTime.now();
        this.deposit=0;
    }
    public boolean checkPass(String pass) {
        if(this.password.equals(pass)) {
            return true;
        }else {
            return false;
        }
    }
    public boolean makeDeposit(double amount) {
        try {
            this.deposit+=amount;
            return true;
        }catch(Exception e) {
            return false;
        }
    }
    public static boolean verifyPassword(String password) {
        Pattern pattern1=Pattern.compile("[\\d+]");
        Pattern pattern2=Pattern.compile("[a-z]||[A-Z]");
        Pattern pattern3=Pattern.compile("[^\\w+]");

        Matcher matcher=pattern1.matcher(password);
        boolean first=matcher.find();
        System.out.println(first);
        matcher=pattern2.matcher(password);
        boolean second=matcher.find();
        System.out.println(second);
        matcher=pattern3.matcher(password);
        boolean third=matcher.find();
        System.out.println(third);
        if(first && second && third && password.length()>=8) {
            return true;
        }else {
            return false;
        }
    }
}

class Book implements Serializable{
    public String title;
    public String author;
    public String content;
    public String ISBN;
    public Book(String title, String author,String content,String ISBN) {
        this.author=author;
        this.title=title;
        this.content=content;
        this.ISBN=ISBN;
    }
}

class Administration{
    public static User regUser() {
        try {
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter username and password and email");
            String username=obj.next();
            String password=obj.next();
            String email=obj.next();

            if(User.verifyPassword(password)) {
                User user1= new User(username,password,email);
                File userFile=new File("Users.txt");
                FileWriter writer=new FileWriter(userFile);
                writer.write(user1.id+","+user1.username+"\n");
                writer.close();
                FileOutputStream file=new FileOutputStream(user1.id+".ser");
                ObjectOutputStream ou=new ObjectOutputStream(file);
                ou.writeObject(user1);
                ou.close();
                file.close();
                System.out.println("Your registration was succesfull!");
                return user1;
            }else {
                return Administration.regUser();
            }
        }catch(Exception error) {
            System.out.println("We have an error!");
            return Administration.regUser();
        }
    }
    public static User logUser() {
        try {
            File userFile=new File("Users.txt");
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter username and password");
            String username=obj.next();
            String password=obj.next();
            Scanner myReader=new Scanner(userFile);
            String data = "";
            boolean isAvail=false;
            while(myReader.hasNextLine()) {
                 data=myReader.nextLine();
                 String[] arr=data.split(",");
                if(arr[1].equals(username)) {
                    isAvail=true;
                    break;
                }
            }
            if(!isAvail) {
                System.out.println("You dont have registration!");
                return null;
            }else {
                String[] arr=data.split(",");
                FileInputStream file=new FileInputStream(arr[0]+".ser");
                ObjectInputStream in=new ObjectInputStream(file);
                User user1=(User)in.readObject();
                in.close();
                file.close();
                if(user1.checkPass(password)) {
                    System.out.println("You have logged in!");
                    return user1;
                }else {
                    System.out.println("Password not match!");
                    return null;
                }
            }
        }catch(Exception error){
            System.out.println("We have an error!");
            return null;
        }
    }
    public static boolean adminLog() {
        try {
            File adminFile=new File("admins.txt");
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter username and password");
            String username=obj.next();
            String password=obj.next();
            Scanner myReader=new Scanner(adminFile);
            String data= "";
            boolean isAvail=false;
            while(myReader.hasNextLine()) {
                data=myReader.nextLine();
                if(data.equals(username+","+password)) {
                    isAvail=true;
                    break;
                }
            }
            if(!isAvail) {
                System.out.println("Username or password not match!");
                return false;
            }else {
                System.out.println("You have logged in!");
                return true;
            }
        }catch(Exception error){
            System.out.println("We have an error!");
            return false;
        }
    }
    public static Book addBook(){
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter title,author,content and ISBN of the book");
            String title = obj.next();
            String author = obj.next();
            String content = obj.next();
            String ISBN = obj.next();
            Book book = new Book(title, author, content, ISBN);
            File bookFile = new File("catalogue.txt");
            FileWriter writer = new FileWriter(bookFile);
            writer.write(book.title+","+book.ISBN);
            writer.close();
            FileOutputStream file=new FileOutputStream(book.ISBN+".ser");
            ObjectOutputStream ou=new ObjectOutputStream(file);
            ou.writeObject(book);
            ou.close();
            file.close();
            System.out.println("Book was added successfully!");
            return book;
        }catch(Exception error){
            System.out.println("Book failed to add!");
            return null;
        }

    }

    public static double enterDeposit(){
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter username");
            String username = obj.next();
            File userFile=new File("Users.txt");
            Scanner myReader = new Scanner(userFile);
            String data = "";
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                String[] arr = data.split(",");
                if (arr[1].equals(username)) {
                    break;
                }
            }
            String[] arr = data.split(",");
            System.out.println("Enter deposit amount");
            double deposit = obj.nextDouble();
            FileInputStream readFile = new FileInputStream(arr[0] + ".ser");
            ObjectInputStream in = new ObjectInputStream(readFile);
            User user = (User)in.readObject();
            user.deposit+=deposit;
            in.close();
            readFile.close();
            FileOutputStream writeFile=new FileOutputStream(arr[0]+".ser");
            ObjectOutputStream ou=new ObjectOutputStream(writeFile);
            ou.writeObject(user);
            System.out.println("Transfer was successful!");
            System.out.printf("Your deposit:%f",user.deposit);
            ou.close();
            writeFile.close();
            return deposit;
        }catch(Exception error){
            System.out.println("We have an error!");
            return 0;
        }

    }
    public static void menu() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Are you admin or user? (admin/user)");
        String option = obj.next();
        if (option.equals("admin")) {
            boolean isAdmin=Administration.adminLog();
            if(isAdmin) {
                System.out.println("Do you want to add books? (yes/no)");
                String bookOption = obj.next();
                if (bookOption.equals("yes")) {
                    Administration.addBook();
                } else {
                    System.out.println("Have a nice day!");
                }
            }
        } else {
            System.out.println("Login or resgiter? (login/resgiter)");
            String newOption = obj.next();
            if (newOption.equals("login")) {
                User isUser=Administration.logUser();
                if(isUser!=null) {
                    System.out.println("Do you want to enter deposit? (yes/no)");
                    String depositOption = obj.next();
                    if (depositOption.equals("yes")) {
                        Administration.enterDeposit();
                    } else {
                        System.out.println("Have a nice day!");
                    }
                }
            } else {
                Administration.regUser();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Administration.menu();
    }
}