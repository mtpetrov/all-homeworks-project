package lecture8.Shapes;

public class Circle extends Shape{
    @Override
    public Double getArea(Double radius) {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public Double getPerimeter(Double radius) {
        return 2 * Math.PI * radius;
    }
}