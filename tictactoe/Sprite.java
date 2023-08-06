package tictactoe;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class Sprite
{

    private Rectangle rectangle;
    private boolean borderVisible;

    public Sprite(int x, int y, int width, int height)
    {
        this.rectangle = new Rectangle(x, y, width, height);
        this.borderVisible = true;
    }

    public Sprite(Rectangle r)
    {
        this(r.x, r.y, r.width, r.height);
    }

    public Sprite()
    {
        this(0, 0, 50, 50);//calls the constructor
    }

    public Rectangle getRectangle()
    {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle)
    {
        this.rectangle = rectangle;
    }

    public int getX()
    {
        return this.rectangle.x;
    }

    public int getY()
    {
        return this.rectangle.y;
    }

    public int getWidth()
    {
        return this.rectangle.width;
    }

    public int getHeight()
    {
        return this.rectangle.height;
    }

    public Point getPosition()
    {
        return new Point(this.rectangle.x, this.rectangle.y);
    }

    public boolean isBorderVisible()
    {
        return borderVisible;
    }

    public void setX(int x)
    {
        this.rectangle.x = x;
    }

    public void setY(int y)
    {
        this.rectangle.y = y;
    }

    public void setWidth(int width)
    {
        this.rectangle.width = width;
    }

    public void setHeight(int height)
    {
        this.rectangle.width = height;
    }

    public void setBorderVisible(boolean borderVisible)
    {
        this.borderVisible = borderVisible;
    }

    public void draw(Graphics g)
    {
        if (borderVisible)
        {
            g.drawRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
        }
    }

    @Override
    public String toString()
    {
        return "Sprite{" + "rectangle=" + rectangle + ", borderVisible=" + borderVisible + '}';
    }

    public void incrementX(int distance)
    {
        this.rectangle.x += distance;
    }

    public void incrementY(int distance)
    {
        this.rectangle.y += distance;
    }

    public boolean intersects(Rectangle r)
    {
        return this.rectangle.intersects(r);
    }

    public boolean intersects(Sprite other)
    {
        return this.rectangle.intersects(other.getRectangle());
    }

    public void setPosition(int x, int y)
    {
        this.rectangle.x = x;
        this.rectangle.y = y;
    }

    public void setPosition(Point p)
    {
        this.rectangle.x = p.x;
        this.rectangle.y = p.y;
    }
    public boolean contains(Rectangle other)
    {
        return this.rectangle.contains(other);
    }
     public boolean contains(Sprite other)
    {
        return this.rectangle.contains(other.getRectangle());
    }
      public boolean contains(Point p)
    {
        return this.rectangle.contains(p);
    }

}
