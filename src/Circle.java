import java.awt.*;

class Circle extends Shape {

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public Color color() {
        return Color.red;
    }
}
