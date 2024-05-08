class Vessel{
    public String type;
    public Vessel(String type){
        this.type=type;
    }
    public void printVessel(){
        System.out.printf("Type: %s\n",this.type);
    }
}

class Ship extends Vessel{
    public Ship(String type){
        super(type);
    }
    public void printVessel(){
        System.out.printf("Type: %s\n",this.type);
    }
}

class CargoShip extends Ship{
    private String company;
    private double volume;
    private String name;
    public CargoShip(String type, String company, double volume, String name){
        super(type);
        this.company=company;
        this.volume=volume;
        this. name=name;
    }
    public void printVessel(){
        System.out.printf("Type: %s\n",this.type);
        System.out.printf("Company: %s\n",this.company);
        System.out.printf("Volume: %f\n",this.volume);
        System.out.printf("Name: %s\n",this.name);
    }
}

class PassengerShip extends Ship{
    private String company;
    private double volume;
    private String name;
    public PassengerShip(String type, String company, double volume, String name){
        super(type);
        this.company=company;
        this.volume=volume;
        this.name=name;
    }
    public void printVessel(){
        System.out.printf("Type: %s\n",this.type);
        System.out.printf("Company: %s\n",this.company);
        System.out.printf("Volume: %f\n",this.volume);
        System.out.printf("Name: %s\n",this.name);
    }
}

class Account{
    public String holderNames;
    public String holderEgn;
    public String currency;
    public String type;
    public Account(String holderNames,String holderEgn,String currency,String type){
        this.holderNames=holderNames;
        this.holderEgn=holderEgn;
        this.currency=currency;
        this.type=type;
    }
    public void showDetails(){
        System.out.printf("Names: %s\n",this.holderNames);
        System.out.printf("EGN: %s\n",this.holderEgn);
        System.out.printf("Currency: %s\n",this.currency);
        System.out.printf("Type: %s\n",this.type);
    }
}

class SavingAccount extends Account{
    public double minSum;
    public double tax;
    public String status;
    public SavingAccount(String holderNames,String holderEgn,String currency,String type,double minSum, double tax, String status){
        super(holderNames,holderEgn,currency,type);
        this.minSum=minSum;
        this.tax=tax;
        this.status=status;
    }
    public void showDetails(){
        System.out.printf("Names: %s\n",this.holderNames);
        System.out.printf("EGN: %s\n",this.holderEgn);
        System.out.printf("Currency: %s\n",this.currency);
        System.out.printf("Type: %s\n",this.type);
        System.out.printf("Min sum: %.2f\n",this.minSum);
        System.out.printf("Tax: %.2f\n",this.tax);
        System.out.printf("Status: %s\n",this.status);
    }
}

class PaymantAccount extends Account{
    public double minSum;
    public double tax;
    public String status;
    public PaymantAccount(String holderNames,String holderEgn,String currency,String type,double minSum, double tax, String status){
        super(holderNames,holderEgn,currency,type);
        this.minSum=minSum;
        this.tax=tax;
        this.status=status;
    }
    public void showDetails(){
        System.out.printf("Names: %s\n",this.holderNames);
        System.out.printf("EGN: %s\n",this.holderEgn);
        System.out.printf("Currency: %s\n",this.currency);
        System.out.printf("Type: %s\n",this.type);
        System.out.printf("Min sum: %.2f\n",this.minSum);
        System.out.printf("Tax: %.2f\n",this.tax);
        System.out.printf("Status: %s\n",this.status);
    }
}

class BalanceS extends SavingAccount{
    private double amount;
    public BalanceS(String holderNames,String holderEgn,String currency,String type,double minSum, double tax, String status,double amount){
        super(holderNames,holderEgn,currency,type,minSum,tax,status);
        this.amount=amount;
    }
    public void showBalance(){
        System.out.printf("Balance: %.2f\n",this.amount);
    }
    public void depositMoney(int amount){
        this.amount+=amount;
    }
    public void pay(int amount){
        if(this.amount<amount){
            System.out.println("You dont have enough money!");
            return;
        }
        this.amount-=amount;
    }
}

class BalanceP extends PaymantAccount{
    private double amount;
    public BalanceP(String holderNames,String holderEgn,String currency,String type,double minSum, double tax, String status,double amount){
        super(holderNames,holderEgn,currency,type,minSum,tax,status);
        this.amount=amount;
    }
    public void showBalance(){
        System.out.printf("Balance: %.2f\n",this.amount);
    }
    public void depositMoney(int amount){
        this.amount+=amount;
    }
    public void pay(int amount){
        if(this.amount<amount){
            System.out.println("You dont have enough money!");
            return;
        }
        this.amount-=amount;
    }
}

class Animal{
    public String species;
    public Animal(String species){
        this.species=species;
    }
    public void show(){
        System.out.printf("Species: %s\n",this.species);
    }
}

class Cat extends Animal{
    public String breed;
    public Cat(String species,String breed){
        super("Cat");
        this.breed=breed;
    }
    public void show(){
        System.out.printf("Species: %s\n",this.species);
        System.out.printf("Breed: %s\n",this.breed);
    }
}

class AngoraCat extends Cat{
    private String name;
    private int age;
    public AngoraCat(String name,int age){
        super("Cat","Angora");
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.printf("Species: %s\n",this.species);
        System.out.printf("Breed: %s\n",this.breed);
        System.out.printf("Name: %s\n",this.name);
        System.out.printf("Age: %d\n",this.age);
    }
}

class PersianCat extends Cat{
    private String name;
    private int age;
    public PersianCat(String name,int age){
        super("Cat","Persian");
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.printf("Species: %s\n",this.species);
        System.out.printf("Breed: %s\n",this.breed);
        System.out.printf("Name: %s\n",this.name);
        System.out.printf("Age: %d\n",this.age);
    }
}

class SiameseCat extends Cat{
    private String name;
    private int age;
    public SiameseCat(String name,int age){
        super("Cat","Siamese");
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.printf("Species: %s\n",this.species);
        System.out.printf("Breed: %s\n",this.breed);
        System.out.printf("Name: %s\n",this.name);
        System.out.printf("Age: %d\n",this.age);
    }
}
public class Main
{
    public static void three(){
        System.out.println("--3--");
        System.out.println("Passenger ship:");
        PassengerShip passShip=new PassengerShip("passenger","bla bla",563.76,"Ship");
        passShip.printVessel();
        System.out.println("Cargo ship:");
        CargoShip cargoShip=new CargoShip("cargo","la la la",782.78,"Ship");
        cargoShip.printVessel();

    }
    public static void two(){
        System.out.println("--2--");
        System.out.println("Saving account:");
        BalanceS bal1=new BalanceS("Ivan Ivanov","2834728312","leva","neshto",10,50,"in process",100);
        bal1.depositMoney(50);
        bal1.pay(25);
        bal1.showBalance();
        bal1.showDetails();
        System.out.println("Paymant account:");
        BalanceP bal2=new BalanceP("Petar Petrov","573485823","dolars","nishto",20,70,"in process",200);
        bal2.pay(100);
        bal2.depositMoney(50);
        bal2.showBalance();
        bal2.showDetails();
    }
    public static void one(){
        System.out.println("--1--");
        System.out.println("Persian cat:");
        PersianCat perCat=new PersianCat("Gosho",10);
        perCat.show();
        System.out.println("Angora cat:");
        AngoraCat angCat=new AngoraCat("Pesho",7);
        angCat.show();
        System.out.println("Siamese cat:");
        SiameseCat simCat=new SiameseCat("Tosho",4);
        simCat.show();
    }
    public static void main(String[] args) {
        one();
        two();
        three();
    }
}