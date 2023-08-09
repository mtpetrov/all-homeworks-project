package lecture8.Shapes;

public class Square extends Shape{
    @Override
    public Double getArea(Double sideLength) {
        return sideLength * sideLength;
    }

    @Override
    public Double getPerimeter(Double sideLength) {
        return 4 * sideLength;
    }
}
