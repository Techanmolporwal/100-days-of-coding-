import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

 class Student implements Comparable{
     int id;
     double cgpa;
     String name;
     
     public Student(){};
     
     public Student(String name, double cgpa, int id){
         this.name = name;
         this.id = id;
         this.cgpa = cgpa;
     }
     
     public void setId(int id){
         this.id = id;
     }
     public int getID(){
         return this.id;
     }
     public void setCgpa(double cgpa){
         this.cgpa = cgpa;
     }
     public double getCGPA(){
         return this.cgpa;
     }
     public void setName(String name){
         this.name = name;
     }
     public String getName(){
         return this.name;
     }
     
     @Override
     public int compareTo(Object o){
         Student s = (Student) o;
         if(this.getCGPA()==s.getCGPA()){
             if(this.getName().equals(s.getName())){
                 return this.getID() - s.getID();
             }
             else{
                 return this.getName().compareTo(s.getName());
             }
         }
         else{
             return this.getCGPA()<s.getCGPA()?1:-1;
         }
     }
 }
 
 class Priorities{
     
     public List<Student> getStudents(List<String> events){
         Queue<Student> q = new PriorityQueue<>();
         List<Student> studensInQueue = new ArrayList<>();
         for(String event:events){
            if(event.contains("ENTER")){
                String[] s = event.split(" ");
                Student newStudent = new Student(s[1], Double.parseDouble(s[2]), Integer.parseInt(s[3]));
                q.add(newStudent);
            }
            else{
                if(!q.isEmpty())
                    q.remove();
            }
         }
         while(!q.isEmpty()){
             Student student = q.peek();
             studensInQueue.add(student);
             q.remove();
         }
         return studensInQueue;
     }
 }


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
