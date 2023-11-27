package poly3;

public class Square extends Shape {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getPerimeter()
    {
        return 4*sideLength;
    }
}
