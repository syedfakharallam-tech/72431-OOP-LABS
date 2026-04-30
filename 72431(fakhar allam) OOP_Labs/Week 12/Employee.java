import java.util.Scanner;
abstract class Employee{
    int fuelAllowence=500;
    int bonus=200;
    int hrs;
    int Salery;
    abstract void calculateSalery();
    void displayInfo(){
        System.out.println("Displaying info...");
    }

    Employee(int hrs){
        this.hrs=hrs;
    }
}

class Manager extends Employee{
    Manager(int hrs){
        super(hrs);
    }
    void calculateSalery(){
        System.out.println("Employee 1:");
        System.out.println("Name: Ubaid Ullah");
        System.out.println("Rank: Ace dominator");
        System.out.println("Daily Wage: "+((hrs*300)+bonus+fuelAllowence));
    }
}

class Programer extends Employee{
    Programer(int hrs){
        super(hrs);
    }
    void calculateSalery(){
        System.out.println("Employee 2:");
        System.out.println("Name: Abdullah");
        System.out.println("Rank: Crown");
        System.out.println("Working hrs: ");
        System.out.println("Daily Wage: "+((hrs*280)+bonus+fuelAllowence));
    }
}

class Main{
    public static void main(String[]args){
        Employee e;
        Scanner in=new Scanner(System.in);
        System.out.print("===Calculate Salery===\n1.Manager\n2.Programmer\nEnter choice: ");
        int choice=in.nextInt(),hrs;
        switch(choice){
            case 1:
                System.out.print("Enter working hrs: ");
                hrs=in.nextInt();
                e=new Manager(hrs);
                e.displayInfo();
                e.calculateSalery();
                break;
            case 2:
                System.out.print("Enter working hrs:");
                hrs=in.nextInt();
                e=new Programer(hrs);
                e.displayInfo();
                e.calculateSalery();
                break;
        }
        in.close();
    }
}