import java.util.Scanner;

class q4{
    public static void main(String[] args) {
        int[] a=new int[2];
        Scanner scanner= new Scanner(System.in);
        a[0]=scanner.nextInt();
        a[1]=scanner.nextInt();
        int temp=scanner.nextInt();
        scanner.close();
        try {
            System.out.println("Answer of Division is: "+(a[0]/a[temp]));
        } catch (ArithmeticException Ae) {
            System.out.println("The Error : "+Ae);
        } catch (IndexOutOfBoundsException e){
            System.out.println("The Error : "+e);
        }
    }
}