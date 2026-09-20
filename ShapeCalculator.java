
class Shape{
    public float calculateArea(){
        return 0;
    }
}
class Circle extends Shape{
    float radius;
    public Circle(float radius){
        this.radius=radius;
    }
    @Override
    public float calculateArea(){
       float r = (float) (Math.PI*radius*radius);
       return r;
    }
}
class Rectangle extends Shape{
    int l;
    int b;
    public Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    @Override
    public float calculateArea(){
        int a = l*b;
        return a;
    }
}
public class ShapeCalculator{
    public static void main(String[] args) {
        Circle c = new Circle(2.2f);
        c.calculateArea();
        Rectangle rec = new Rectangle(2,3);
        rec.calculateArea();    
        System.out.println("Circle Area with radius 2.2cm: "+c.calculateArea()+"cm");
        System.out.println("Rectangle Area with length=2cm and breadth=3cm: "+ rec.calculateArea()+"cm");

    }
}