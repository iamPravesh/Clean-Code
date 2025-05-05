package dataandobject;

public class PolymorphicShapes {
    public class Square implements Shape {
        private Point topLeft;
        private double sideLength;

        public double area() {
            return sideLength * sideLength;
        }
    }

    public class Rectangle implements Shape {
        private Point topLeft;
        private double width;
        private double height;

        public double area() {
            return width * height;
        }
    }

    public class Circle implements Shape {
        private Point center;
        private double radius;
        public final double PI = 3.14159;

        public double area() {
            return PI * radius * radius;
        }
    }
}
