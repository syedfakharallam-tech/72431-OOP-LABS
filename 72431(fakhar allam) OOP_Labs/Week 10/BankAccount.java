import java.util.Scanner;
class BankAccounts{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        SavingAccount S=new SavingAccount();
        CurrentAccount C=new CurrentAccount();
        int c1, amount,c2;
        do{
            System.out.print("1.Current Account\n2.Saving Account\n3.Exit\nEnter your choice: ");
            c1=in.nextInt();
            switch(c1){
                case 1:
                    do{
                        System.out.print("1.Deposit Money\n2.Withdraw money\n3.Check Balance\n4.Go back to main manu\nEnter your choice: ");
                        c2=in.nextInt();
                        switch(c2){
                            case 1:
                                System.out.print("Enter the amount: ");
                                amount=in.nextInt();
                                C.deposit(amount);
                                break;
                            case 2:
                                System.out.print("Enter the amount: ");
                                amount=in.nextInt();
                                C.withdraw(amount);
                                break;
                            case 3:
                                C.checkBalance();
                                break;
                            case 4:
                                break;
                            default: 
                                System.out.println("Invlid choice!");
                        }
                    }while(c2!=4);
                    break;
                case 2:
                    do{
                        System.out.print("1.Deposit Money\n2.Withdraw money\n3.Check Balance\n4.Go back to main manu\nEnter your choice: ");
                        c2=in.nextInt();
                        switch(c2){
                            case 1:
                                System.out.print("Enter the amount: ");
                                amount=in.nextInt();
                                S.deposit(amount);
                                break;
                            case 2:
                                System.out.print("Enter the amount: ");
                                amount=in.nextInt();
                                S.withdraw(amount);
                                break;
                            case 3:
                                S.checkBalance();
                                break;    
                            case 4:
                                break;
                            default: 
                                System.out.println("Invlid choice!");
                        }
                    }while(c2!=4);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(c1!=3);
        in.close();
    }
}
class Bank{
    int balance1=200000;  
    int balance2=200000;  
}
class CurrentAccount extends Bank{
    void withdraw(int m){
        int fee=50;
        if(m<=balance1-fee){
            balance1=balance1-(m+fee);
            System.out.println("Withdrawl Successfull!");
        }else{
            System.out.println("Not enough balance!");
        }
    }
    void checkBalance(){
        System.out.println("Balance = "+balance1);
    }
    void deposit(int m){
        if(m>0){
            balance1+=m;
            System.out.println("Deposit successfull!");
        }else{
            System.out.println("Invalid amount!");
        }
    }
}
class SavingAccount extends Bank{
    int withdrwalLimit=10000;
    void withdraw(int m){
        if(m<withdrwalLimit && m<balance2){
            balance2-=m;
            System.out.println("Withdrawl Successfull");
        }else{
            System.out.println("Invlid amount");
        }
    }
    void checkBalance(){
        System.out.println("Balance = "+balance2);
    }
    void deposit(int m){
        if(m>0){
            balance2+=m;
            System.out.println("Amount has been added to your account");
        }else{
            System.out.println("Invalid amount!");
        }
    }
}