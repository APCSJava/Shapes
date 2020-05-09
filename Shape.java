

public abstract class Shape
{
    private int uniqueID;
    
    public Shape(int id)
    {
        this.uniqueID = id;
    }
    
    public int getID()
    {
        return this.uniqueID;
    }
    
    public abstract double getArea();
    
    public String toString() {
    	  return this.getClass().getSimpleName()+" #"+uniqueID;
    }
}
