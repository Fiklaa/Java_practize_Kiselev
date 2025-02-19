package practize5.shapes;

import java.awt.Graphics;
import java.awt.*;

public class Krug extends Shape {
    protected int radius;

    public Krug(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}