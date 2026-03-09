import java.util.Scanner;

public class Exe {
    public static void main(String[] args) {

        int a, b;

        Scanner input = new Scanner(System.in);
        Cal1 c1 = new Cal1();
        Cal2 c2= new Cal2();

        System.out.println("Enter Values:-");
        a = input.nextInt();
        b = input.nextInt();
        
        System.out.println("Sum: " + c1.sum(a, b));
        System.out.print("Multiplication: "); 
        c1.mul(a, b);
        
        System.out.println("Division: "+c2.div(a, b));
        System.out.println("Modulus: "+c2.mod());
        input.close();


    }
}