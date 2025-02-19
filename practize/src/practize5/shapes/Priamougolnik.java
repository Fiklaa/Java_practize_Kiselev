package practize5.shapes;

import java.awt.Graphics;
import java.awt.*;

public class Priamougolnik extends Shape {
    protected int width;
    protected int length;

    public Priamougolnik(int x, int y, int width, int length, Color color) {
        super(x, y, color);
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, length);
    }
}
