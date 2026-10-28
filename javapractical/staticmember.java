public class staticmember {
    public static void main(String [] args){
    student s1=new student(1,"piyush");
    student s2=new student(2, "roshan");
    s1.display();
    s2.display();
    student.displaycollege();
    }

}
class student{
    int rollno;
    String name;
    static String college= "VCET";

    student(int r, String n){
        this.rollno=r;
        this.name=n;
    }

    static void displaycollege(){
        System.out.println("college: "+ college);
    }
    void display(){
        System.out.println("rollno: "+ rollno);
        System.out.println("name :"+ name);
        System.out.println("college: "+ college);
    }


}
