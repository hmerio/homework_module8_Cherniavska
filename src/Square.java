import java.awt.*;

class Square extends Shape {
    @Override
    public String getName() {
        return "square";
    }

    @Override
    public Color color() {
        return Color.pink;
    }
}
