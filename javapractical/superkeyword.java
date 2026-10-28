public class superkeyword {
    public static void main(String[] args) {
        dog d=new dog();
        d.display();
    }

    
}
class animal{
    String name="animal: ";
}
class dog extends animal{
    String name="dog";

    void display(){
        System.out.print(super.name);
        System.out.println(name);
    }
}
