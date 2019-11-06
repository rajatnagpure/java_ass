import java.util.Scanner;
class q6 {
    public static void main(String[] args) {
        String name[]={"rajat","ram","raju","rajesh","rahul"};
        Scanner scanner=new Scanner(System.in);
        int temp=scanner.nextInt();
        scanner.close();
        try {
            System.out.println("The name is: "+name[temp]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error: "+e);
        }
    }
}