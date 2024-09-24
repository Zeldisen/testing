public class Shape {

    double width;
    double height;

    public Shape(double width, double height){
        this.width = width;
        this.height= height;
    }

    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public double getArea(){
        double area = width*height;
        return area;
    }
}
