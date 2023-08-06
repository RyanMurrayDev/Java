
package tictactoe;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ImageSprite extends Sprite
{
    private boolean visible;
    private BufferedImage image;
    
    public ImageSprite(int x, int y, BufferedImage image)
    {
        super(x, y, image.getWidth(), image.getHeight());
        this.image = image;
        this.visible = true;
    }

    public boolean isVisible()
    {
        return visible;
    }

    public void setVisible(boolean visible)
    {
        this.visible = visible;
    }

    public BufferedImage getImage()
    {
        return image;
    }

    public void setImage(BufferedImage image)
    {
        this.image = image;
    }
    @Override
    public void draw(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g.create();
        if(visible)
        {
            g2.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
        }
        if(super.isBorderVisible())
        {
            super.draw(g);
        }
        g2.dispose();
    }
}
