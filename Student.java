package part_3_Java;

public class Student 
{
	 private String studentName;
	    private String studentBranch;
	    private int studentMarks;


	    public Student(String studentName,String studentBranch,int studentMarks)
	    {   
	        this.studentName=studentName;
	        this.studentBranch=studentBranch;
	        this.studentMarks=studentMarks;

	    }
	    @Override
	    public String toString()
	    {
	        return studentName+" "+studentMarks;
	    }
}
