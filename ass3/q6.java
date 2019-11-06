interface L1{
    String L1c="L1";
}
interface L2{
    String L2c="L2";
}
interface L3 extends L1,L2{
    String L3c="L3";
}
interface L4{
    String L4c="L4";
}

class X implements L3{
    X(){
        System.out.println("\nInside Constructor of Class X\n this implements "+L1c+" and "+L2c+" and "+L3c);
    }
}

class W extends X implements L4{
    W(){
        super();
        System.out.println("\nInside Constructor of Class W\n this implements "+L4c);
    }
}

class q6 {
    public static void main(String[] args) {
        W a= new W();
        System.out.println("Instance of L1 "+(a instanceof L1));
        System.out.println("Instance of L2 "+(a instanceof L2));
        System.out.println("Instance of L3 "+(a instanceof L3));
        System.out.println("Instance of L4 "+(a instanceof L4));
        System.out.println("Instance of X "+(a instanceof X));
    }
}