class q2{
    public static void main(String[] args) {
        System.out.println("length : "+args.length);
        int start=0;
        int end=0;
        char[] input;
        try {
            start=Integer.parseInt(args[0]);
            end=Integer.parseInt(args[1]);
        } catch (NumberFormatException nfe) {
            System.out.println("The first argument should be Integer"+nfe);
            System.exit(1);
        }
        input=args[2].toCharArray();
        try {
            while(start<end){
                char temp=input[start];
                input[start]=input[end];
                input[end]=temp;
                start++;
                end--;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The substring cannot be "+e);
        }
      
        String output = new String(input);
        System.out.println("Final string is :"+output);
    }
}