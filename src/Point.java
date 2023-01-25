import java.awt.*;

class Point extends Shape{

    @Override
    public String getName() {
        return "point";
    }

    @Override
    public Color color() {
        return Color.black;
    }

}
