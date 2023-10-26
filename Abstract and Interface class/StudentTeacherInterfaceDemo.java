package abstarctinterfacepack;

// Define an interface named Person
interface Person 
{
    // Declare an abstract method named "speak"
    void speak();
}
// Create a class Student that implements the Person interface
class Student implements Person
{
    // Implement the "speak" method from the Person interface
    @Override
    public void speak() 
    {
        System.out.println("Student Says: Good Morning mam");
    }
}

// Create a class Teacher that implements the Person interface
class Teacher implements Person
{
    // Implement the "speak" method from the Person interface
    @Override
    public void speak() 
    {
        System.out.println("Teacher Says: Good Morning Class!");	
    }
}

public class StudentTeacherInterfaceDemo 
{
    public static void main(String[] args) 
    {
        // Create a Student object and call the "speak" method
        Student st = new Student();
        st.speak();
        
        // Create a Teacher object and call the "speak" method
        Teacher ta = new Teacher();
        ta.speak();
    }
}
