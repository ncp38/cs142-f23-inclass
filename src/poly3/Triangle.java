package poly3;

//ASSUMING equilateral triangles
public class Triangle extends Shape {
    private int base, height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getPerimeter()
    {
        return 3* base;
    }
}
