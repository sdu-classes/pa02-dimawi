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
class Shape{
    public String color = "red";
    public boolean filled = true;
        public  Shape(){

        }
        public Shape(String color, boolean filled){
            this.color = color;
            this.filled = filled;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
        public boolean isFilled(){
            return filled ;
        }
        public void setFilled(boolean filled){
            this.filled = filled ;
        }
        public String toString(){
            return "Shape[color=" + color + ",filled=" + filled + "]";
        }
}
class Circle extends Shape{
    double radius = 1.0;
    public Circle(){
        
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        super.color = color;
        super.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius ;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return "Circle[" + super.toString() + ",radius=" + radius + "]";
    }
}
class Rectangle extends Shape{
    double width = 1.0;
    double length = 1.0;
    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;

    }
    public Rectangle(double width , double length, String color, boolean filled ){
        this.width = width;
        this.length = length;
        super.color = color;
        super.filled = filled;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * (width + length) ;
    }
    public String toString(){
        return "Rectangle[" + super.toString() + ",width="+ width + ",length=" + length + "]";
    }
}
class Square extends Rectangle{
    double side;
    public Square(){

    }
    public Square(double side){
        super.length = side;
        super.width = side;
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        super.color = color;
        super.filled = filled;
        super.width = side;
        super.length = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setWidth(double side){
        super.width = side;
    }
    public void setLength(double side){
        super.length = side;
    }
    public String toString(){
        return "Square[" + super.toString() + "]";
    }


}
