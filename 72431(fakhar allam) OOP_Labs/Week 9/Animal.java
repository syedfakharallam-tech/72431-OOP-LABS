//Syed Fakhar Alam Bukhari
//sap id 72431
class Animal{
    void sound(){
        System.out.println("Animal makes sound...");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
    void run(){
        System.out.println("dog runs fast");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meow");
    }
}
class TestAnimal{
    public static void main(String[]args){
        Animal a;
        a = new Dog();
        a.sound();
        ((Dog)a).run();
        a=new Cat();
        a.sound();
    }
}