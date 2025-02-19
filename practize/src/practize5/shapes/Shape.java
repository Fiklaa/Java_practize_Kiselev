package practize5.shapes;

import java.awt.Graphics;
import java.awt.*;

public abstract class Shape {

    protected int x, y;
    protected Color color;

    public Shape(int x, int y, Color color) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}
