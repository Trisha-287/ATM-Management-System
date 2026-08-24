package Practice;

public class studentmain {
    public static void main(String args[]){
        cllgstudent c=new cllgstudent();
        System.out.println(c.name("sir cr reddy"));
        System.out.println(c.subjects("maths "));
        System.out.println(c.subjects("social "));
        System.out.println(c.subjects("science "));
        schoolStudent s=new schoolStudent();
        System.out.println(s.name());
        System.out.println(s.id());
        System.out.println(s.phone_number());

    }
}
