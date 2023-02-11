package OOPShape;

public class smth {
    public static void main(String[] args){
        Circle circle = new Circle(5.5 , "red" , false);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getColor());
        System.out.println(circle.isFilled());
        System.out.println(circle.getRadius());
        Rectangle r = new Rectangle(3.8, 2.5,"green", false);
        System.out.println(r);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.getColor());
        System.out.println(r.getLength());
        Square s = new Square(6.6);
        System.out.println(s);
        System.out.println(s.getArea());
        System.out.println(s.getColor());
        System.out.println(s.getSide());
    }
}
