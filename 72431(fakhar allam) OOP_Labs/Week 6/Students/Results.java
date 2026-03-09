import java.util.Scanner;
public class Results extends Students {
    void display(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter student's I'd : ");
        int id=in.nextInt();
        displayinfo(id);
        System.out.print("Grade:\t");
        if(marks[id]>100) System.out.println("Invalid Marks!");
        else if(marks[id]>89) System.out.println("A+");
        else if(marks[id]>79) System.out.println("A");
        else if(marks[id]>69) System.out.println("B");
        else if(marks[id]>59) System.out.println("C");
        else if(marks[id]>39) System.out.println("D");
        else System.out.println("F");
                
        in.close();
    }       
}
