abstract class Students{
    abstract void grades();
    void show(){
        System.out.println("Ali is students.");
    }
}
class Graduates extends Students{
    void grades(){
        System.out.println("Grade: A");
    }
}

class Main{
    public static void main(String[]args){
        Students s= new Graduates();
        s.grades();
        s.show();
    }
}