public class abstractclass {
    public static void main(String[] args){
        shape d=new rectangle();
        d.info();
        d.area();
    }
}
abstract class shape{
    abstract void area();
    
    void info(){
        System.out.print("I'm a shape: ");
    }
}
class rectangle extends shape{
    void area(){
        System.out.println(4*5);
    }
}
