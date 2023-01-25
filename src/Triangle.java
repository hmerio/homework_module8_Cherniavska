import java.awt.*;

class Triangle extends Shape {
    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public Color color() {
        return Color.yellow;
    }
}
