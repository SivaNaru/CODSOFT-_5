package p1;

public class Student {
    private String name;
    private String rollNumber;
    private String grade;
    private String address;

    public Student(String name, String rollNumber, String grade, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [Name=" + name + ", Roll Number=" + rollNumber + ", Grade=" + grade + ", Address=" + address + "]";
    }
}
