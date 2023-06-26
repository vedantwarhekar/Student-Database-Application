/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Student
{
   private String firstName;
   private String lastName;
   private int gradeYear;
   private String studentId;
   private String courses = null;
   private int tuitionBalance;
   private static int costOfCourse = 600;
   private static int id=1000;
   
   // costructor prompt user to entre student's name and year
   public Student(){
       Scanner in = new Scanner(System.in);
       System.out.print("Entre Student First Name:- ");
       this.firstName = in.nextLine();
       
       System.out.print("Entre Student Last Name:- ");
       this.lastName = in.nextLine();
       
       System.out.print("1 - Freshmen\n2 - Sophmore \n3 - Junior\n4 - Senior\nEntre Student Class Level:- ");
       this.gradeYear = in.nextInt();
       
       setStudentId();
   }
   // genrtae an Id
   private void setStudentId()
   {
     id++;  
     // Grade Level + Id
     this.studentId = gradeYear + "" +id;  
   }        
   // Enroll in courses
   public void enroll()
   {
      // Get inside a loop ,user hits 0
       do{
          System.out.print("Entre course to enroll (Q to quit): ");
          Scanner in = new Scanner(System.in);
          String course = in.nextLine();
          if(!course.equals("Q"))
          {
             courses = (courses +","+course);
             tuitionBalance = tuitionBalance + costOfCourse;
          }else{break;}
         }while(1 != 0);
   }   
   
   // view Balance
   public void viewBalance()
   {
       System.out.println("Your balance is : $"+tuitionBalance);
   }
   
   
   // pay Tuition
   public void payTuition()
   {
        viewBalance();
        System.out.print("Entre Your Payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance- payment;
        System.out.println("Thank you for your Payment Of $" + payment);
        viewBalance();
   }  
   
   
   // show status
   public String toString()
   {
     return  "Name: "+ firstName + " "+lastName+
             "\n Grade Level: "+ gradeYear+
             "\n Student Id: "+studentId+
             "\n Balance: $"+tuitionBalance;          
   }        
}
