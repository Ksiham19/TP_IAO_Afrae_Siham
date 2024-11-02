package TD_DP.EX2;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // Créer et dessiner plusieurs formes
        Shape square = factory.createShape("square");
        square.draw();

        Shape circle = factory.createShape("circle");
        circle.draw();

        Shape triangle = factory.createShape("triangle");
        triangle.draw();

        Shape hexagon = factory.createShape("hexagon");
        hexagon.draw();
    }
}