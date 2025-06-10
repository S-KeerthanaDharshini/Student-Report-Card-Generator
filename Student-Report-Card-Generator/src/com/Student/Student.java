package com.Student;

public class Student extends Person{
        private int roll_number;
        private String department;
        
        public Student(int roll_number,String department) {
        	this.roll_number = roll_number;
        	this.department = department;
        }
        @Override
        public void displayDetails() {
        	System.out.println("Roll Number : "+roll_number);
        	System.out.println("Department : "+department);
        }
}
