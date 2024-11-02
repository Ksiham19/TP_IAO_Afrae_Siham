package TD_DP.EX2;

public class ShapeFactory {
    public Shape createShape(String type) {
        switch (type.toLowerCase()) {
            case "square":
                return new Square();
            case "circle":
                return new Circle();
            case "triangle":
                return new Triangle();
            case "hexagon":
                return new Hexagon();
            default:
                throw new IllegalArgumentException("Type de forme non supporté : " + type);
        }
    }
}