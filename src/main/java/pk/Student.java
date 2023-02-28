package pk;

public class Student{
    String name;
    int age;
    Double gpa;

    Double getGpa(){
        return this.gpa;
    }
    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
    Student(String name, int age, Double gpa){
        this.name= name;
        this.age = age;
        this.gpa = gpa;
    }
}
