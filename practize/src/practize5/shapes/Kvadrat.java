package practize5.shapes;

import java.awt.Graphics;
import java.awt.*;

public class Kvadrat extends Shape {
    protected int side;

    public Kvadrat(int x, int y, int side, Color color) {
        super(x, y, color);
        this.side = side;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, side, side);
    }
}