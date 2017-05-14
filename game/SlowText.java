package game;

/**
 * Write a description of class SlowText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlowText
{
    private String text;
    
    
    public void printI(String word)
    {
        text = word;
        for (int i = 0; i < text.length(); i++)
        {
            System.out.print(text.charAt(i));
            Thread t1 = new Thread();
            try
            {
                t1.sleep(10);
            }
            catch (Exception NOO)
            {
                System.out.println(NOO);
            }
        }
        System.out.println("");
        System.out.println("");
    }
    
    public void printD(String word)
    {
        text = word;
        for (int i = 0; i < text.length(); i++)
        {
            System.out.print(text.charAt(i));
            Thread t1 = new Thread();
            try
            {
                t1.sleep(400);
            }
            catch (Exception NOO)
            {
                System.out.println(NOO);
            }
        }
        System.out.println("");
        System.out.println("");
    }
}
