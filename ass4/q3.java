import java.util.Scanner;

class q3{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int res=scanner.nextInt();
        scanner.close();
        try {
            divideByZero(res);
        } catch (ArithmeticException e) {
            System.out.println("The Error While dividing :"+e);
        }
    }
    public static void divideByZero(int res) throws ArithmeticException{
        System.out.println("Division Operation "+(30/res));
    }
}