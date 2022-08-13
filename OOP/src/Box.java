public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length cannot be zero or negative.");
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width cannot be zero or negative.");
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height cannot be zero or negative.");
        }
    }

    public double surfaceArea() {
        return 2 * this.height * this.length + 2 * this.height * this.width
                + 2 * this.width * this.length;
    }

    public double lateralSurfaceArea() {
        return 2 * this.height * this.length + 2 * this.height * this.width;
    }

    public  double volume() {
        return this.length * this.height * this.width;
    }
}
