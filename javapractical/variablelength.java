
public class variablelength {
    static int sum (int ... numbers){
        int total=0;
        
        for(int n : numbers){
            total +=n;
        }

        return  total;
    }
    public static void main(String [ ]args){
        System.out.println("sum of two numbers "+ sum(20,30,50));
        System.out.println("sum of two numbers "+ sum(2,3,5));
        System.out.println("sum of two numbers "+ sum(20,30,50,60,50));

    }
}

