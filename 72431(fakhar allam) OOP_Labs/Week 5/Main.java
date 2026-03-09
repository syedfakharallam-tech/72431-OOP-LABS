import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Name: Syed Fakhar Alam
        // Sap: 72431
        Scanner in = new Scanner(System.in);
        Class1 c1 = new Class1();
        int num, arr[] = { 1, 2, 4, 6, 7, 8, 98 }, a, b;

        System.out.print("Enter Number: ");
        num = in.nextInt();
        // check prime
        c1.checkPrime(num);
        // check palindrom
        c1.checkPalindrom(num);
        // size of an array
        System.out.println("\nSize of an array: " + c1.arraySize(arr));
        // Factorial
        System.out.println("\nFactorial of " + num + " = " + c1.factorial(num));
        // Swapping values
        System.out.print("\nEnter value of a = ");
        a = in.nextInt();
        System.out.print("Enter value of b = ");
        b = in.nextInt();
        c1.swapValues(a, b);
        //draw pattren
        c1.drawPattren('*');
        in.close();
    }
}
