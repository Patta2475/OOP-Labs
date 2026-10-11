package lab4.Q3andQ4;

public class EquilateralTriangle implements Triangle{
    private double side;
    
    public EquilateralTriangle(double side){
        this.side = side;
    }

    public double getLongestSideLength(){
        return side;
    }

    public double getLargestAngle(){
        return 60.0;
    }
    
    public double getPerimeter(){
        return side*3;
    }
}
