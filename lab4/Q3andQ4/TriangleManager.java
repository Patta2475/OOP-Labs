package lab4.Q3andQ4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TriangleManager{
    private List<Triangle> triangles;
    
    public TriangleManager(boolean useArrayList){
        if (useArrayList) {
            triangles = new ArrayList<>();
        } else {
            triangles = new LinkedList<>();
        }
    }

    public void addTriangle(Triangle t){
        if (t == null){
            throw new IllegalArgumentException("Triangle cannot be null");
        }
        triangles.add(t);
    }

    public Triangle findTriangleWithLargestPerimeter(){
        Triangle largest = null;
        for (Triangle t: triangles) {
            if (largest == null || t.getPerimeter() > largest.getPerimeter()){
                largest = t;
            }
        }
        return largest;
    }
}

