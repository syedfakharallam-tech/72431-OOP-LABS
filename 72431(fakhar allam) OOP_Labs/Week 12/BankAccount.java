import java.util.Scanner;

abstract class BankAccount {
    abstract void deposit(int m);
    abstract void withdraw(int m);
}

class SavingsAccount extends BankAccount {
    int balance = 50000;

    void deposit(int m) {
        if (m > 0) {
            balance += m;
            System.out.println("Amount has been deposited.");
        } else
            System.out.println("Invalid amount");
    }

    void withdraw(int m) {
        if (m <= balance && m <= 5000) {
            balance -= m;
            System.out.println("Amount has been withdrawn.");
        } else
            System.out.println("Invalid amount");
    }
}

class CurrentAccount extends BankAccount {
    int balance = 45000;

    void deposit(int m) {
        if (m > 0) {
            balance += m;
            System.out.println("Amount has been deposited.");
        } else
            System.out.println("Invalid amount");
    }

    void withdraw(int m) {
        if (m <= balance) {
            balance -= (m + 5);
            System.out.println("Amount has been withdrawn.");
        } else
            System.out.println("Invalid amount");
    }
}

class Main{
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        BankAccount b;
        System.out.print("1.Saving Account\n2.Current Account\nChoice: ");
        int choice1=in.nextInt(),choice2,m;
        switch(choice1){
            case 1:
                b=new SavingsAccount();
                System.out.print("1.Deposit\n2.Withdraw\nChoice: ");
                choice2=in.nextInt();
                switch(choice2){
                    case 1:
                        System.out.print("Enter amount: ");
                        m=in.nextInt();
                        b.deposit(m);
                        break;
                    case 2:
                        System.out.print("Enter amount: ");
                        m=in.nextInt();
                        b.withdraw(m);
                        break;
                    }
            break;
            case 2:
                b=new CurrentAccount();
                System.out.print("1.Deposit\n2.Withdraw\nChoice: ");
                choice2 =in.nextInt();
                switch(choice2){
                    case 1:
                        System.out.print("Enter Amount: ");
                        m=in.nextInt();
                        b.deposit(m);
                        break;
                    case 2:
                        System.out.print("Enter Amount: ");
                        m=in.nextInt();
                        b.withdraw(m);
                        break;

                }
            break;
        }
        in.close();
    }
}
