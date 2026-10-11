package lab4.Q3andQ4;

public class TriangleManagerTest {
    public static void main(String[] args) {
        TriangleManager t = new TriangleManager(true);
        t.addTriangle(new EquilateralTriangle(40));
        t.addTriangle(new EquilateralTriangle(30));
        t.addTriangle(new RightTriangle(50, 40, 60));

        Triangle largest = t.findTriangleWithLargestPerimeter();
        System.out.println(largest.getPerimeter());
        System.out.println(largest instanceof RightTriangle);

        try {
            t.addTriangle(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());     
        }
    }
}
