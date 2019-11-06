import java.util.Scanner;
class q5 {
    public static void main(String[] args) {
        String a[]=new String[10];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<9;i++){
            a[i]=scanner.nextLine();
        }
        scanner.close();
        System.out.println("------------------printing the values------------------");
        try {
            for(int i=0;i<10;i++){
                if(a[i]==null){
                    throw new NullPointerException();
                }
                System.out.println(a[i]);
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}