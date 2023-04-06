package Java_assignment_6;

public class Triangle implements Shape {
    float area, perimeter, side1, side2, side3;

    public Triangle(int i, int j, int k) {
        side1 = i;
        side2 = j;
        side3 = k;
    }
    public Triangle(int i) {
        side1 =side2 =side3=i;
    }
    @Override
    public float calculateShapeArea(){
        area = (float)((0.5)*side1*side2*side3);
        return area;
    }
    @Override
    public float calculateShapePerimeter(){
        perimeter = (float)(side1+side2+side3);
        return area;
    }
    public String toString()
    {
        return "Dimension is " + side1+","+ side2+","+side3+ "Area is " + area + "Perimeter is " + perimeter+ ".";
    }
}
