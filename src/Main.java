import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(8,5);
        Triangle tri1 = new Triangle(8,6);

        ArrayList<String> areas = new ArrayList<>();

        areas.add(rec1.toString());
        areas.add(tri1.toString());

        System.out.println("Arean på rectalnegln är " + rec1.getRec());
        System.out.println("Arean på treangeln är " + tri1.triArea());


    }
}