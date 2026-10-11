package lab4.Q3andQ4;

public class RightTriangle implements Triangle{
    private double side1, side2, side3;
    public RightTriangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getLongestSideLength(){
        return Math.max(side1, Math.max(side2, side3));
    }

    public double getLargestAngle(){
        return 90.0;
    }

    public double getPerimeter(){
        return (side1+side2+side3);
    }
}
