// Main file
import java.util.Scanner;
public class task_3 {
    public static void main(String[]args){
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two number: ");
        a=input.nextInt();
        b=input.nextInt();
        System.out.println("Sum of two numbers is: "+calculator.sum(a,b));
        System.out.println("Difference of two numbers is: "+calculator.sub(a,b));
        System.out.println("Product of two numver is: "+calculator.mul(a, b));
        System.out.println("Division of two numver: "+calculator.div(a,b));
        input.close();

    }
}
