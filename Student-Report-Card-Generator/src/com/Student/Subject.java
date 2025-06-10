package com.Student;
import java.util.*;
public class Subject {
    private String Subject1;
    private String Subject2;
    private String Subject3;
    private int mark1;
    private int mark2;
    private int mark3;
   
    //setting method for Subject
    public void setSubject1(String Subject1) {
    	this.Subject1= Subject1;
    }
    public void setSubject2(String Subject2) {
    	this.Subject2 = Subject2;
    }
    public void setSubject3(String Subject3) {
    	this.Subject3 = Subject3;
    }
    //getting method for Subject
    public String getSubject1() {
    	return Subject1;
    }
    public String getSubject2() {
    	return Subject2;
    }
    public String getSubject3() {
    	return Subject3;
    }
    
    //setter methods for Marks
    public void setMark1(int mark1) {
    	this.mark1=mark1;
    }
    public void setMark2(int mark2) {
    	this.mark2=mark2;
    }
    public void setMark3(int mark3) {
    	this.mark3=mark3;
    }
    
    //getter method for Methods
    public int getMark1() {
    	return mark1;
    }
    public int getMark2() {
    	return mark2;
    }
    public int getMark3() {
    	return mark3;
    }
    
    //displaying the subject and marks details
    public void displaySubjectMarks() {
    	System.out.println("Subject : " + Subject1 + "\nMark : "+ mark1);
    	System.out.println("Subject : " + Subject2 + "\nMark : "+ mark2);
    	System.out.println("Subject : " + Subject3 + "\nMark : "+ mark3);
    	
    }   
}
