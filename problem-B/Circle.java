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
