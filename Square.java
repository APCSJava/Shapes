

public class Square extends Rectangle
{
    public Square(int id, double sideLength)
    {
        super(id, sideLength, sideLength);
    }
    
    public double getSideLength()
    {
        return super.getHeight();
    }
}
