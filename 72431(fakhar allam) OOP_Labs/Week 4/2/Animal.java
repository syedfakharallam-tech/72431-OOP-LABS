public class Animal {
    public static void main(String[]args){
        Cat cat=new Cat();
        Dog dog=new Dog();
        System.out.println("-----CAT-----");
        cat.eat();
        cat.sleep();
        cat.sound();
        System.out.println("-----DOG-----");
        dog.eat();
        dog.sleep();
        dog.sound();
    }
}
