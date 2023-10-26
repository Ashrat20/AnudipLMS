package classpack;

import java.util.Scanner;

// Define the Subject class to represent a subject and its marks
class Subject 
{
    String name;
    int marks;

    // Constructor to initialize the subject's name and marks
    public Subject(String name, int marks) 
    {
        this.name = name;
        this.marks = marks;
    }
}
// Define the Student class to represent a student
class Student 
{
    String name;
    int rollNumber;
    Subject[] subjects;

    // Constructor to initialize the student's name, roll number, and subjects
    public Student(String name, int rollNumber) 
    {
        this.name = name;
        this.rollNumber = rollNumber;
        subjects = new Subject[2];
        subjects[0] = new Subject("Maths", 0);
        subjects[1] = new Subject("English", 0);
    }
}

// Define the Teacher class to perform operations on students and subjects
class Teacher 
{
    // Method to set marks for a specific subject of a student
    public void setMarks(Student student, int subjectIndex, int marks) 
    {
        student.subjects[subjectIndex].marks = marks;
    }
    
    // Method to calculate the average marks of all students and subjects
    public double calculateAverage(Student[] students) 
    {
        int totalMarks = 0;
        int totalSubjects = students[0].subjects.length;

        // Calculate the total marks for all students and subjects
        for (Student student : students) 
        {
            for (Subject subject : student.subjects) 
            {
                totalMarks += subject.marks;
            }
        }
        // Calculate and return the average marks
        return (double) totalMarks / (students.length * totalSubjects);
    }

    // Method to find the maximum marks among all students and subjects
    public int findMaxMarks(Student[] students) 
    {
        int maxMarks = students[0].subjects[0].marks;

        // Iterate through all students and subjects to find the maximum marks
        for (Student student : students) 
        {
            for (Subject subject : student.subjects) 
            {
                if (subject.marks > maxMarks) 
                    maxMarks = subject.marks;
            }
        }
        return maxMarks;
    }

    // Method to find the minimum marks among all students and subjects
    public int findMinMarks(Student[] students) 
    {
        int minMarks = students[0].subjects[0].marks;

        // Iterate through all students and subjects to find the minimum marks
        for (Student student : students) 
        {
            for (Subject subject : student.subjects) 
            {
                if (subject.marks < minMarks) 
                    minMarks = subject.marks;
            }
        }
        return minMarks;
    }
}

public class StudentsMarksData 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Create an array of Student1 objects to represent students
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++)
            students[i] = new Student("Student " + (i + 1), i + 1);

        // Create a Teacher object to perform operations on students
        Teacher teacher = new Teacher();

        // Input marks for each subject of each student
        for (Student student : students) 
        {
            for (int i = 0; i < student.subjects.length; i++) 
            {
                System.out.print("Enter marks for " + student.name + " Roll no " + student.rollNumber + " " + student.subjects[i].name + ": ");
                int marks = scanner.nextInt();
                teacher.setMarks(student, i, marks);
            }
        }
        char choice;
        do {
            // Display menu options for the teacher
            System.out.println("What would you like to do, Teacher?");
            System.out.println("a> Find average of marks\nb> Find Max and Min marks\nc> Exit");
            System.out.println("Enter your Choice:");
            choice = scanner.next().charAt(0);

            // Perform the selected operation based on the teacher's choice
            switch (choice) 
            {
                case 'a':
                    double averageMarks = teacher.calculateAverage(students);
                    System.out.println("Average Marks: " + averageMarks);
                    break;
                case 'b':
                    int maxMarks = teacher.findMaxMarks(students);
                    int minMarks = teacher.findMinMarks(students);
                    System.out.println("Maximum Marks: " + maxMarks);
                    System.out.println("Minimum Marks: " + minMarks);
                    break;
                case 'c':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 'c');
        scanner.close();
    }
}