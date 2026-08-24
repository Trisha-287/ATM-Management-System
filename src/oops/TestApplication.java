package oops;

public class TestApplication {
    public static void main(String []args){
        Student s= new Student();
        Student s1= new Student("rani",30,860);
        /*System.out.println(s);
        s.setFirstName("rani");
        s.setMarks(560);
        s.setAge(23);
        s.studay();
        s.firstName="lucky";
        System.out.println(s.getFirstName());*/
        System.out.println(s1.getMarks());
    }
}
