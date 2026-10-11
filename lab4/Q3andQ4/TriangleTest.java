package lab4.Q3andQ4;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new EquilateralTriangle(40);
        System.out.println(t1.getLongestSideLength());
        System.out.println(t1.getLargestAngle());
        System.out.println(t1.getPerimeter());
        System.out.println();
        t1 = new RightTriangle(50, 40, 60);
        System.out.println(t1.getLongestSideLength());
        System.out.println(t1.getLargestAngle());
        System.out.println(t1.getPerimeter());
    }
}
