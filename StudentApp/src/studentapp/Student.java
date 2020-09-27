
package studentapp;


public class Student{

    private String StudentName;
    private String StudentContactNo;
    private String Email;
    private int Id;
    boolean getStudentName;
    boolean getStudentContactNo;
    boolean getEmail;
    boolean getId;
    
    public Student(){
    }
    public void setStudentName(String StudentName){
        this.StudentName=StudentName;
    }
    public String getStudentName(){
        return StudentName;
    
}
    public void setStudentContactNo(String StudentContactNo)
    {
        this.StudentContactNo=StudentContactNo;
    }
    public String getStudentContractNo(){
        return StudentContactNo;
    }
    public void setEmail(String Email)
    {
        this.Email=Email;
    }
    public String getEmail(){
        return Email;
    }
    public void setId(int Id){
        this.Id=Id;
    }
    public int getId(){
        return Id;
    }

   void setStudentContractNo(String string) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

 