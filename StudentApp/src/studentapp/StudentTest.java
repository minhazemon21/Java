
package studentapp;

import java.io.PrintStream;
import java.util.ArrayList;


public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student>students=new ArrayList();
        Student aStudent;
        aStudent = new Student();
        
        aStudent.setStudentName("Minhaz");
        aStudent.setStudentContractNo("01756441573");
        aStudent.setEmail("minhaz15-1294@diu.edu.bd");
        aStudent.setId(171151294);
        
        students.add(aStudent);
        Iterable<Student> Students = null;
        for(Student a : Students){
            System.out.println(aStudent.getStudentName);
            System.out.println(aStudent.getStudentContactNo);
            System.out.println(aStudent.getEmail);
            System.out.println(aStudent.getId);
        }
        
    }
    
}
