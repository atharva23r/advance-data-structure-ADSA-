public class democlassobj {
    public static void main(String[] args) {
        student s1= new student();
        
        s1.rollno= 44;
        s1.name= "atharva";
        s1.display();
    }


}
class student{
    int rollno;
    String  name;
    String branch="It";

    void display(){
        System.out.println("rollno: " + rollno);
        System.out.println("Name: " +  name);
        System.out.println("branch: "+ branch);
    }

}
