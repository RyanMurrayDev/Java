
package murray_final_project;

import java.util.Random;

public class Die
{
    private int face;
    private Random random;

    public Die()
    {
        this.face = 1;
        random = new Random();
    }

    public int getFace()
    {
        return face;
    }
    public int roll()
    {
        this.face = random.nextInt(6) + 1;
        return this.face;
    }

    @Override
    public String toString()
    {
        return "Die{" + "face=" + face + '}';
    }
    
}
