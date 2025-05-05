package dataandobject;

public class ProceduralShape {
    public class Square {
        public Point topLeft;
        public double side;
    }

    public class Rectangle {
        public Point topLeft;
        public double width;
        public double height;
    }

    public class Circle {
        public Point center;
        public double radius;
    }

    public class Geometry {
        public final double PI = 3.14159;
        public double area( Object shape ) throws NoSuchShapeExpectation {
            if ( shape instanceof Square ) {
                Square square = (Square) shape;
                return square.side * square.side;
            } else if ( shape instanceof Rectangle ) {
                Rectangle rectangle = (Rectangle) shape;
                return rectangle.width * rectangle.height;
            } else if ( shape instanceof Circle ) {
                Circle circle = (Circle) shape;
                return PI * circle.radius * circle.radius;
            } else {
                throw new NoSuchShapeExpectation("No such shape");
            }
        }
    }
}
