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
