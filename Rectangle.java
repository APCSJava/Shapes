

public class Rectangle extends Shape
{
    private double width;
    private double height;
    
    public Rectangle(int id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        return width * height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getWidth(){
        return width;
    }
}
