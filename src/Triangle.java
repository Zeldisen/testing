public class Triangle extends Shape{

    public Triangle(double width, double height){
        super(width, height);
    }
    public double triArea(){
        double a = getWidth() * getHeight() * 0.5;
        return a;
    }

}
