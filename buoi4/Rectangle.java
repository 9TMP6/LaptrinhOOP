package buoi4;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int Area() {
        return this.length * this.width;
    }

    public String toString() {
        return "Length: " + this.length + "\nWidth: " + this.width;
    }
}
