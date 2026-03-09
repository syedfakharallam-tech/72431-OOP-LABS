import java.util.Scanner;

public class Cal2 {
    int div(int a,int b){
        return a/b;
    }
    int mod(){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter Values:-");
            int a=input.nextInt(),b=input.nextInt();
            input.close(); 
            return a%b;
        }
}
