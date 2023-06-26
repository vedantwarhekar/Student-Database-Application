
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**^
 *
 * @author Administrator
 */
public class StudentDatabaseApp 
{
     public static void main(String[] args)
     {
        
       // how many new user we want to add
       System.out.print("Entre number of new students to enroll: ");
       Scanner in = new Scanner(System.in);
       int numOfStudents = in.nextInt();
       Student[] students = new Student[numOfStudents];
       
       // Create n numbers of new students
       for(int n=1;n<=numOfStudents;n++)
       {
         students[n] = new Student();
         students[n].enroll();
         students[n].payTuition();
         System.out.println(students[n].toString());
         
         System.out.println("=============================");
         System.out.println("Entre Detais Of: "+(n+1)+" Student");
       }    
     }        
}
