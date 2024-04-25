import java.util.Scanner;
import java.io.*;
public class Exercise1 {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        try {
            File file=new File("Users.txt");
            System.out.println("Choose otpion between(register/login)");
            String option=obj.next();
            System.out.println("Enter username and password");
            String username=obj.next();
            String password=obj.next();
            if(option.equals("register")) {
                FileWriter writer=new FileWriter("Users.txt");
                writer.write(username+" "+password+"\n");
                writer.close();
                System.out.println("Your registration was succesfull!");
            }else if(option.equals("login")) {
                System.out.println("Enter username and password");
                Scanner myReader=new Scanner(file);
                boolean isRegister=false;
                while(myReader.hasNextLine()){
                    String data=myReader.nextLine();
                    if((username+" "+password).equals(data)) {
                        System.out.println("You have logged in correctly!");
                        isRegister=true;
                        break;
                    }
                }
                if(!isRegister) {
                    System.out.println("You dont have registration!");
                }
                myReader.close();
                obj.close();
            }
        }catch(IOException error) {
            System.out.println("We have an error");
            error.printStackTrace();
        }
    }
}
