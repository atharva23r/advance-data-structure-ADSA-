public class methodoverloading {
    public static void main(String [] args){
    calculator c=new calculator();
        System.out.println("sum of two: " + c.add(2,4));
        System.out.println("sum of three: " + c.add(2,4,6));
        System.out.println("sum of two doubles: " + c.add(2.4,4.6));
    }
}
class calculator{
    int add (int a ,int b , int c){
        return a+b+c;
    }
    int add (int a,int b){
        return a+b;

    }
    double add(double a, double b){
        return a+b;
    }
}
