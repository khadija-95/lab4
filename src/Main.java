//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2, 3,3.5 );
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());

        Rectangle rectangle = new Rectangle(3, 4,5.5,2.0 );
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Circumference: " + rectangle.calculateCircumference());

        Triangle triangle = new Triangle(1,2,3.2,5.4);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Circumference" + triangle.calculateCircumference());
    }
}