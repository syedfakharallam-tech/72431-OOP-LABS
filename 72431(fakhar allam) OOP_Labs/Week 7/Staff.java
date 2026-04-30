class Staff{
    void work(){
        System.out.println("Staff is working");
    }
}
class Teacher extends Staff{
    void work(){
        System.out.println("Teacher is teaching");
    }
}
class Librarian extends Staff{
    void work(){
        System.out.println("Librairan is managing books");
    }
}
class Exe{
    public static void main(String[]args){
        Staff s;
        s=new Teacher();
        s.work();
        s=new Librarian();
        s.work();
    }
}