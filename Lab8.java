/*-------------------------------------------------------------
// AUTHOR: MORRIS, CHRIS    
// FILENAME: Lab8.java
// SPECIFICATION: Getters, setters, scopes and equals
// FOR: CSE 110- Lab #8
// TIME SPENT: 4hrs 33mins
//-----------------------------------------------------------*/
public class Lab8 {
    public static void main(String[] args) {
        String sFullName, sAsuID;
        double sGrade;
        int numOfUpdates = 0, numOfAccessed = 0;

        // Read some input data
        sFullName = "Foo Bar";
        sAsuID = "10291029";
        sGrade = 5.9;

        // Create a Student object "student1"
        Student student1 = new Student();

        // Update the object state
        student1.setName(sFullName);
        student1.setId(sAsuID);
        student1.setGrade(sGrade);

        System.out.println("student1's name is " + student1.getFullName());
        System.out.println("student1's ID is " + student1.getAsuID());
        System.out.println("student1's grade is " + student1.getGrade());
        System.out.println();


        System.out.println("How do variable scopes work?");
        System.out.println("==============================");
        System.out.println("student1 has been updated ");
        System.out.println(student1.getNumOfUpdates() + " times");
        System.out.println();
        System.out.println("student1 has been accessed ");
        System.out.println(student1.getNumOfAccessed() + " times");
        System.out.println();
        System.out.println("In main function, numOfUpdates = " + numOfUpdates);
        System.out.println("In main function, numOfAccessed = " + numOfAccessed);
        System.out.println();


        System.out.println("How to compare two Student objects?");
        System.out.println("==============================");

        Student student2 = new Student("Foo Bar", "10291029", 5.9);
        Student student3 = new Student();
        student3.setName("foo bar");

        System.out.println("student1: " + student1);
        System.out.println("student2: " + student2);
        System.out.println("Is student1 equal to student2? (by ASU ID) ");
        System.out.println(student1.equals(student2));
        System.out.println();

        System.out.println("student1: " + student1);
        System.out.println("student3: " + student3);
        System.out.println("Is student1 equal to student3? (by name) ");
        System.out.println(student1.equals(student3));
    }
}