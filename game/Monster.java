package game;

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster
{
    //att
    int atk = 50;
    int def = 50;
    int hp = 200;
    
    // constrct
    public  Monster() // defult
    {
    
    }
    public Monster(int x) // leveled up 6,8,10 is boss lvl
    {
        x--;
        x *= 10;
        int y = 3 * x;
        atk += y;
        def += y;
        hp += (5*x);
    }
    public Monster(int x, String y) // rare, # starts at 100
    {
        x -= 101;
        x *= 10;
        int z = 3 * x;
        atk += z;
        def += z;
        hp += (5*x);
    }
    
    //function
    public int doATK(int def, int atk)
    {
        def /= 4;
        atk = atk - def;
        return atk;
    }
    
    
}
