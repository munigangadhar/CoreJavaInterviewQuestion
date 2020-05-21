package com.muni.clone;
 
class Student implements Cloneable
{
    int id;
 
    String name;
 
    Course course;
 
    public Student(int id, String name, Course course)
    {
        this.id = id;
 
        this.name = name;
 
        this.course = course;
    }
 
    //Overriding clone() method to create a deep copy of an object.
 
    protected Object clone() throws CloneNotSupportedException
    {
        //Student student = (Student) super.clone();
    	return super.clone();
 //if you comment below line it will call shallow copy other wise Deep Copy
        //student.course = (Course) course.clone();
 
        //return student;
    }
}
 
public class DeepCopyInJava
{
    public static void main(String[] args)
    {
        Course science = new Course("Physics", "Chemistry", "Biology");
 
        Student student1 = new Student(111, "John", science);
        System.err.println(student1.hashCode()+"  "+science.hashCode());
        Student student2 = null;
 
        try
        {
            //Creating a clone of student1 and assigning it to student2
 
            student2 = (Student) student1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
 System.err.println(student1.hashCode());
        //Printing the subject3 of 'student1'
 
        System.out.println(student1.course.subject3);         //Output : Biology
 
        //Changing the subject3 of 'student2'
 
        student2.course.subject3 = "Maths";
 
        //This change will not be reflected in original student 'student1'
 
        System.out.println(student1.course.subject3);       //Output : Biology
        System.out.println(student2.course.subject3); 
    }
}