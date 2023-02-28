package pk;
import java.util.*;
import java.util.logging.*;

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
                if(gpa <= 10 && gpa >= 0){
                    l.add(new Student(s, age, gpa));
                    LOGGER.info("Student Added Sucessfully");
                    Collections.sort(l, new Comparator<Student>(){
                        public int compare(Student s1, Student s2) {
                            return Double.compare(s2.getGpa(),s1.getGpa());
                        }
                    });
                }
                else{
                    LOGGER.info("Enter GPA 1 to 10");
                }
                
            }
            else if(m == 2){
                StringBuilder z = new StringBuilder("");
                for(int i=0; i<l.size(); i++){
                    z.append("\n"+(i+1)+". Name: "+l.get(i).name+", Age: "+l.get(i).age+", GPA: "+l.get(i).gpa+"\n");
                }
                String z1 = ""+z;
                LOGGER.info(z1);
            }
            else if(m == 3){
                n=1;
            }
        }while(n == 0);
    }
}
