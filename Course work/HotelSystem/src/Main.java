import java.util.Scanner;
import java.io.*;
import java.io.Serializable;
import java.time.*;
import java.util.regex.*;

class User implements Serializable {
    public String username;
    public String password;
    public LocalDateTime regDate;
    public String uid;
    public String email;
    public double deposit;
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.regDate = LocalDateTime.now();
        this.uid = String.valueOf(Instant.now().getEpochSecond());
        this.email=email;
        this.deposit=0;
    }
    public boolean checkPassword(String password) {
        if(this.password.equals(password)) {
            return true;
        }else{
            return false;
        }
    }
    public static boolean validatePassword(String password) {
        Pattern p1=Pattern.compile("[\\d+]");
        Pattern p2=Pattern.compile("[a-z||A-Z]");
        Pattern p3=Pattern.compile("[^\\w+]");
        Matcher m=p1.matcher(password);
        boolean first=m.find();
        System.out.println(first);
        m=p2.matcher(password);
        boolean second=m.find();
        System.out.println(second);
        m=p3.matcher(password);
        boolean third=m.find();
        System.out.println(third);
        if(first&&second&&third && password.length()>=6) {
            return true;
        }else{
            return false;
        }
    }
}

class Rooms implements Serializable {
    public double price;
    public int number;
    public boolean isReserv;
    public int peopleCount;
    public int days;
    public Rooms(double price, int number) {
        this.price = price;
        this.number = number;
        this.isReserv = false;
        this.peopleCount = 0;
        this.days = 0;
    }
    public double calcPrice(){
        return this.price*this.peopleCount*this.days;
    }
}

class Reservation {
    public static User regUser(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username, password and email");
        String username=sc.next();
        String password=sc.next();
        String email=sc.next();
        try{
            if(User.validatePassword(password)){
                User user=new User(username,password,email);
                File userfile=new File("users.txt");
                Scanner reader=new Scanner(userfile);
                String list="";
                while(reader.hasNextLine()){
                    list+=reader.nextLine()+"\n";
                }
                reader.close();
                if(list.equals("\n")){
                    list="";
                }
                list+=user.uid+", "+user.username;
                FileWriter writer=new FileWriter(userfile);
                writer.write(list+"\n");
                writer.close();
                FileOutputStream file=new FileOutputStream(user.uid+".ser");
                ObjectOutputStream out=new ObjectOutputStream(file);
                out.writeObject(user);
                out.close();
                file.close();
                System.out.println("Registration was succesfull!");
                return user;
            }else{
                System.out.println("Password must be at least 6 characters with digits, upper and lower case letters and special symbol!");
                return Reservation.regUser();
            }
        }catch(Exception e){
            System.out.println("We have an error");
            return null;
        }
    }
    public static User userLog(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username, password");
        String username=sc.next();
        String password=sc.next();
        try {
            File userfile=new File("users.txt");
            Scanner reader = new Scanner(userfile);
            String data="";
            boolean isReg=false;
            while (reader.hasNextLine()) {
                data = reader.nextLine();
                String[] arr = data.split(", ");
                if (arr[1].equals(username)) {
                    isReg=true;
                    break;
                }
            }
            if (isReg){
                String[] arr=data.split(", ");
                FileInputStream file = new FileInputStream(arr[0]+".ser");
                ObjectInputStream in=new ObjectInputStream(file);
                User user=(User)in.readObject();
                if(user.checkPassword(password)){
                    System.out.println("You have logged in!");
                    return user;
                }else{
                    System.out.println("Wrong password!");
                    return null;
                }
            }else{
                System.out.println("You dont have registration!");
                return null;
            }
        }catch(Exception error){
            System.out.println("We have an Error");
            error.printStackTrace();
            return null;
        }
    }
    public static boolean adminLog(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username and password");
        String username=sc.next();
        String password=sc.next();
        try {
            File adminsfile=new File("admins.txt");
            Scanner reader = new Scanner(adminsfile);
            boolean isReg=false;
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                if(data.equals(username+", "+password)){
                    isReg=true;
                    break;
                }
            }
            if(isReg){
                System.out.println("You have logged in!");
                return true;
            }else{
                System.out.println("Username or password is incorrect!");
                return false;
            }
        }catch(Exception error){
            System.out.println("We have an Error");
            error.printStackTrace();
            return false;
        }
    }
    public static void addRoom(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter room number and price");
        int roomNumber=sc.nextInt();
        double price=sc.nextDouble();
        Rooms room=new Rooms(price,roomNumber);
        try{
            File rooms=new File("roomList.txt");
            Scanner reader=new Scanner(rooms);
            String data="";
            while (reader.hasNextLine()) {
                    data += reader.nextLine() + "\n";
            }
            reader.close();
            if(data.equals("\n")){
                data="";
            }
            String strRoomNumber=String.valueOf(roomNumber);
            String strPrice=String.valueOf(price);
            data+=strRoomNumber+", "+strPrice;
            FileWriter writer=new FileWriter(rooms);
            writer.write(data+"\n");
            writer.close();
            FileOutputStream file=new FileOutputStream(strRoomNumber+".ser");
            ObjectOutputStream out=new ObjectOutputStream(file);
            out.writeObject(room);
            out.close();
            file.close();
            System.out.println("Room added successfully!");
        }catch(Exception error){
            System.out.println("We have an Error");
            error.printStackTrace();
        }
    }
    public static Rooms searchRoom(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter room number");
        int roomNumber=sc.nextInt();
        try{
            File rooms=new File("roomList.txt");
            Scanner reader=new Scanner(rooms);
            String data="";
            String room="";
            while (reader.hasNextLine()) {
                data= reader.nextLine();
                String[] arr=data.split(", ");
                if(arr[0].equals(String.valueOf(roomNumber))){
                    room=arr[0];
                    break;
                }
            }
            reader.close();
            FileInputStream file=new FileInputStream(room+".ser");
            ObjectInputStream in=new ObjectInputStream(file);
            Rooms roomObj=(Rooms)in.readObject();
            System.out.printf("Room number: %d\n",roomObj.number);
            System.out.printf("Price: %.2f\n",roomObj.price);
            System.out.printf("Reserve: %b\n",roomObj.isReserv);
            return roomObj;
        }catch(Exception error){
            System.out.println("We have an Error");
            error.printStackTrace();
            return null;
        }
    }
    public static void reservRoom(Rooms room,User user){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter people count and days");
        int peopleCount=sc.nextInt();
        int days=sc.nextInt();
        try{
            FileInputStream readFile=new FileInputStream(String.valueOf(room.number)+".ser");
            ObjectInputStream in=new ObjectInputStream(readFile);
            Rooms roomObj=(Rooms)in.readObject();
            in.close();
            readFile.close();
            FileInputStream readUserFile=new FileInputStream(user.uid+".ser");
            ObjectInputStream inU=new ObjectInputStream(readUserFile);
            User user1=(User)inU.readObject();
            inU.close();
            System.out.printf("All price for this room: %.2f\n", roomObj.price*peopleCount*days);
            System.out.printf("Your deposit: %.2f\n", user1.deposit);
            System.out.println("Do you want to reservе this room? (y/n)");
            String answer2 = sc.next();
            if (answer2.equals("y")) {
                if(user1.deposit>=roomObj.price*peopleCount*days) {
                    readUserFile.close();
                    roomObj.peopleCount = peopleCount;
                    roomObj.days = days;
                    roomObj.isReserv = true;
                    user1.deposit-=roomObj.calcPrice();
                    FileOutputStream writeFile = new FileOutputStream(String.valueOf(room.number) + ".ser");
                    ObjectOutputStream out = new ObjectOutputStream(writeFile);
                    out.writeObject(roomObj);
                    out.close();
                    writeFile.close();
                    FileOutputStream writeUserFile=new FileOutputStream(user.uid+".ser");
                    ObjectOutputStream outU=new ObjectOutputStream(writeUserFile);
                    outU.writeObject(user1);
                    outU.close();
                    writeUserFile.close();
                    System.out.printf("Your deposit: %.2f\n", user1.deposit);
                    System.out.println("Your reservation was successful!");
                }else{
                    System.out.println("You dont have enough deposit for this room!");
                }
            } else {
                System.out.println("Have a nice day!");
            }
        }catch(Exception error){
            System.out.println("We have an Error");
            error.printStackTrace();
        }
    }
    public static void addDeposit(User user){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter deposit amount");
        double amount=sc.nextDouble();
        try{
            FileInputStream readFile=new FileInputStream(user.uid+".ser");
            ObjectInputStream in=new ObjectInputStream(readFile);
            User user1=(User)in.readObject();
            user1.deposit+=amount;
            in.close();
            readFile.close();
            FileOutputStream writeFile=new FileOutputStream(user.uid+".ser");
            ObjectOutputStream out=new ObjectOutputStream(writeFile);
            out.writeObject(user1);
            out.close();
            writeFile.close();
            System.out.println("Your transaction was successfull!");
            System.out.printf("Deposit amount: %.2f\n",user1.deposit);
        }catch(Exception error){
            System.out.println("We have an Error");
            error.printStackTrace();
        }
    }
    public static void menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Reservation System!");
        System.out.println("Are you user or admin? (admin/user)");
        String option=sc.next();
        if(option.equals("admin")){
            boolean isLog=Reservation.adminLog();
            if(isLog){
                System.out.println("Do you want to add room to the reservation system? (y/n)");
                String answer=sc.next();
                if(answer.equals("y")) {
                    while(answer.equals("y")) {
                        Reservation.addRoom();
                        System.out.println("Do you want to add room to the reservation system? (y/n)");
                        answer=sc.next();
                    }
                    System.out.println("Have a nice day!");
                }else{
                    System.out.println("Have a nice day!");
                }
            }
        }else if(option.equals("user")){
            System.out.println("Register or login? (register/login)");
            String option1=sc.next();
            if(option1.equals("register")){
                Reservation.regUser();
            }else if(option1.equals("login")) {
                User user=Reservation.userLog();
                if(user!=null){
                    System.out.println("Do you want to search rooms for reservation or add deposit? (search/deposit/exit)");
                    String answer=sc.next();
                    if(answer.equals("search")) {
                        Rooms room = Reservation.searchRoom();
                        while(answer.equals("search")){
                            if (room.isReserv) {
                                System.out.println("This room is reserved do you want to search new room? (search/exit)");
                                 answer = sc.next();
                                if (answer.equals("search")) {
                                    Reservation.searchRoom();
                                } else {
                                    System.out.println("Have a nice day!");
                                    break;
                                }
                            }else {
                                System.out.println("This room is not reserved, do you want to reserve it or search new room? (search/reservе/exit)");
                                answer = sc.next();
                                if (answer.equals("search")) {
                                    Reservation.searchRoom();
                                } else if (answer.equals("reserve")) {
                                    Reservation.reservRoom(room, user);
                                    break;
                                } else {
                                    System.out.println("Have a nice day!");
                                    break;
                                }
                            }
                        }
                    }else if(answer.equals("deposit")){
                        Reservation.addDeposit(user);
                    }else{
                        System.out.println("Have a nice day!");
                    }
                }
            }else{
                System.out.println("Invalid option!");
            }
        }else{
            System.out.println("Invalid option!");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Reservation.menu();
    }
}