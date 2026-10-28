public class inheritance {
    // inheritance animal class in dog class and overriding
    public static void main(String [] args){
    Dog d=new Dog();
    d.eat();
    d.sound();
    }
}
class animal{
    void eat(){
        System.out.println("animal eats");
    }
    void sound(){
        System.out.println("animals makes sound");
    }
}
class Dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }

}
