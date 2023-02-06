package pk;
import java.util.*;
import java.util.logging.*;

class Student{
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



public class StudentTest 
{
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> l = new ArrayList<Student>();
        int n = 0;
        do{
            LOGGER.info("1.Add Student 2.View Students 3.Exit");
            int m = sc.nextInt();
            if(m == 1){
                sc.nextLine();
                LOGGER.info("Enter Name of the Student: ");
                String s = sc.nextLine();
                LOGGER.info("Enter Age of the Student: ");
                int age = sc.nextInt();
                LOGGER.info("Enter GPA of the Student: ");
                Double gpa = sc.nextDouble();
                l.add(new Student(s, age, gpa));
                LOGGER.info("Student Added Sucessfully");
                Collections.sort(l, new Comparator<Student>(){
                    public int compare(Student s1, Student s2) {
                        return Double.compare(s2.getGpa(),s1.getGpa());
                    }
                });
            }
            else if(m == 2){
                String z = "";
                for(int i=0; i<l.size(); i++){
                    z += "\n"+(i+1)+". Name: "+l.get(i).name+", Age: "+l.get(i).age+", GPA: "+l.get(i).gpa+"\n";
                }
                LOGGER.info(z);
            }
            else if(m == 3){
                n=1;
            }
        }while(n == 0);
    }
}
