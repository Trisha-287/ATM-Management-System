package oops;

public class Student {
    String firstName;
    int marks;
    int age;

    public Student(String firstName,int marks,int age) {
        this.firstName = firstName;
        this.marks = marks;
        this.age = age;
    }

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void studay(){
        System.out.println("i am studing");
    }

}

