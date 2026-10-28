public class constoverload {
    public static void main(String [] args){
        student s1=new student();
        student s2=new student(44 , "atharva");

        s1.display();
        s2.display();

    }
    
}
class student{
    int rollno;
    String name;
// constructer overloading and use this keyword..
    student(){
        rollno=0;
        name="unknown";
    }
    student(int r , String n){
        this.rollno=r;
        this.name=n;

    }
    void display(){
        System.out.println("rollno: "+ this.rollno);
        System.out.println("name: "+ this.name);
    }
}
