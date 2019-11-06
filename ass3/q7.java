interface Shape2D{
    float getArea();
}

interface Shape3D{
    float getVolume();
}

interface Point3D{
    int x=0;
    int y=0;
    int z=0;
    int r=5;
}

abstract class Shape{
    public abstract void display();
}

class Circle extends Shape implements Shape2D,Point3D{
    @Override
    public float getArea(){
        return (float)3.14*r*r;
    }
    @Override
    public void display(){
        System.out.println("\nThe Area of the Circle is "+ getArea());
    }
}

class Sphere extends Shape implements Shape3D,Point3D{
    @Override
    public float getVolume(){
        return  (float)((3*3.14/4)*r*r*r);
    }
    @Override
    public void display(){
        System.out.println("\nThe volume of the Shpere is "+getVolume());
    }
} 

class q7{
    public static void main(String[] args) {
        Circle a=new Circle();
        Sphere b=new Sphere();
        a.display();
        b.display();
    }
}