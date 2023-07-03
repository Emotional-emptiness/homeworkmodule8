public class GraphicsEditor {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape quad = new Quad(10.0);

        ShapePrinter.printShapeName(circle);
        ShapePrinter.printShapeName(quad);
    }
}
