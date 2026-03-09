public class Class1 {
    void checkPrime(int num) {
        boolean prime = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        } 
        else
            prime = false;
        if (prime)
            System.out.println(num + " is prime.");
        else
            System.out.println(num + " is not a prime.");
    }

    int arraySize(int arr[]) {
        return arr.length;
    }

    void checkPalindrom(int num) {
        int original = num, reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        if (original == reverse)
            System.out.println(original + " is Palindrom.");
        else
            System.out.println(original + " is not a Palindrom.");

    }

    long factorial(int num) {
        long fact = 1;
        for (int i = num; i > 0; i--)
            fact = fact * i;
        return fact;
    }

    void swapValues(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swaping:-\na = " + a + "\nb = " + b);
    }

    void drawPattren(char a){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++)
                System.out.print(a);
            System.out.println("");
        }
    }
}
