import mypackage9.*;

class q9 {
    public static void main(String[] args) {
        Student a = new Student();
        System.out.println("Name: " + a.Name);
        System.out.println("age: " + a.age); // cannot access;
        a.DispAge();
        System.out.println("dept: " + a.dept); // cannot access;
        a.DispDept();
    }
}