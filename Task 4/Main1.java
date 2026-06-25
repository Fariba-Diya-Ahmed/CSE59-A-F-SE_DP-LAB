interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {

    public double length;
    public double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {

    public double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {

    public double calculateTotalArea(Shape[] shapes) {

        double area = 0;

        for (Shape shape : shapes) {
            area += shape.calculateArea();
        }

        return area;
    }
}

public class Main1 {

    public static void main(String[] args) {

        Shape[] shapes = {
            new Rectangle(10, 5),
            new Circle(7)
        };

        AreaCalculator calculator = new AreaCalculator();

        double result = calculator.calculateTotalArea(shapes);

        System.out.println(result);
    }
}
