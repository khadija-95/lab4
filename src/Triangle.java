public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(int x, int y, double base, double height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5*base*height;
    }

    @Override
    public double calculateCircumference() {
        return 3 * base;
    }
}
