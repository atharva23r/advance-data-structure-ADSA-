import java.util.Scanner;
public class loops {
    public static void main(String [] args){
        //odd or even
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("the number is even");

        }
        else {
            System.out.println("the number is odd");
        }
    //find the largest three numbers.
            System.out.println("enter the number");
        int a=sc.nextInt();
        System.out.println("enter the number");
        int b=sc.nextInt();
        System.out.println("enter the number");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("largest no. is:"+a);
        }
        else if (b>=a && b>=c){
            System.out.println("largest no is :"+ b);
        }
        else {
            System.out.println("largest no is "+ c);
        }

        // factorial of a number
        System.out.println("enter the no.");
        int f=sc.nextInt();
        int fact=1;
        for(int i=1;i<=f;i++){
            fact = fact* i;
        }
        System.out.println("factorial:"+ fact);
        
        
        
    
    }


    
}
