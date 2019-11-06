package mypackage9;

class Student extends Person {
    protected String dept = "IT";

    void DispAge() {
        System.out.println("Age: " + age);// can access
    }

    void DispDept() {
        System.out.println("Dept: " + dept);// can access
    }
}