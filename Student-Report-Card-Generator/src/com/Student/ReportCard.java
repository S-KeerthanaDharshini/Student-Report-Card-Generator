package com.Student;

public class ReportCard{
	int totals=0;
	char grade;
        private Student student;
        private Subject subject;
        
       public ReportCard(Student student,Subject subject) {
    	   this.student  = student;
    	   this.subject = subject;
       }
       //calculating the total
       public int calculateTotal() {
    	   totals =subject.getMark1()+subject.getMark2()+subject.getMark3();
    	  return totals;
       }
      
       //calculating the grade
       public char calculateGrade() {
    	   int total=calculateTotal()/3;
    	   
    	   if(total >=90 && total <=100) 
    		  grade = 'A';
    	   
    	   else if(total >=80 && total < 89)
    		   grade = 'B';
    	   
    	   else if(total >=70 && total < 79)
    		   grade = 'C';
    	   
    	   else if(total >=60 && total < 69)
    		   grade = 'D';
    	   else if(total >=50 && total < 59)
    	       grade = 'E';
    	   else 
    		   grade = 'F';
    	   return grade;
       }
       
       public void displayReport() {
    	   System.out.println("Total Marks : "+ calculateTotal() );
    	   System.out.println("Average : "+calculateTotal()/3);
    	   System.out.println("Grade : "+ calculateGrade());
       }
}
