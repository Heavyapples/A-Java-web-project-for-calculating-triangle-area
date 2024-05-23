public class Triangle {
    private double side1;
    private double side2;
    private double angle;

    public Triangle() {
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double calculateArea() {
        double side3 = Math.sqrt(side1 * side1 + side2 * side2 - 2 * side1 * side2 * Math.cos(Math.toRadians(angle)));
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
