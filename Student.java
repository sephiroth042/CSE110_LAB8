/*-------------------------------------------------------------
// AUTHOR: MORRIS, CHRIS    
// FILENAME: Lab8.java
// SPECIFICATION: Getters, setters, scopes and equals
// FOR: CSE 110- Lab #8
// TIME SPENT: 1hrs 13mins
//-----------------------------------------------------------*/

public class Student {
    private String firstName, lastName, fullName, asuId;
    double grade;
    int updateCounter, accessCounter;
    //default constructor
    public Student(){
        this.updateCounter = 0;
        this.accessCounter = 0;
    }
    //parameterized constructor
    public Student(String sFullName, String sAsuID, double sGrade){
        this.fullName = sFullName;
        this.asuId = sAsuID;
        this.grade = sGrade;
    }

    public String toString() {
        return String.format("Student: %s, ASUID: %s, Grade: %s",
                fullName, asuId, Double.toString(grade));
    }

    public void setGrade(double newGrade){
        this.grade = newGrade;
        this.updateCounter++;
    }

    public void setName(String sFullName){
        this.fullName = sFullName;
        this.updateCounter++;
    }

    public void setId(String sAsuID){
        this.asuId = sAsuID;
        this.updateCounter++;
    }

    public String getFirstName() {
        this.accessCounter++;
        return firstName;
    }

    public String getLastName() {
        this.accessCounter++;
        return lastName;
    }

    public String getFullName() {
        this.accessCounter++;
        return fullName;
    }

    public String getAsuID() {
        this.accessCounter++;
        return asuId;
    }

    public double getGrade(){
        this.accessCounter++;
        return grade;
    }
    
    public int getNumOfAccessed(){
        this.accessCounter++;
        return this.accessCounter;
    }

    public int getNumOfUpdates(){
        this.accessCounter++;
        return this.updateCounter;
    }

    public boolean equals(Student otherStudent){
        boolean areEqual = false; 
        String lowerFullName = this.fullName.toLowerCase();
        String lowerOtherName = otherStudent.fullName.toLowerCase();
        if(this.asuId == otherStudent.asuId){
            areEqual = true;
        }
        else if(lowerFullName.equals(lowerOtherName)){
            areEqual = true;
        }
        else{
            areEqual = false;
        }
        return areEqual;
    }
}