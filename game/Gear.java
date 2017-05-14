package game;

/**
 * Write a description of class Equapments here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gear
{
    /**
     * 0 = locked
     * 1 = brought/ in bag
     * 2 = equaped
     */
    
    // Swords
    static int i101 = 0;
    static int i102 = 0;
    static int i103 = 0;
    static int i104 = 0;
    static int i105 = 0;
    static int i106 = 0;
    static int i107 = 0;
    
    // Armor
    static int i201 = 0;
    static int i202 = 0;
    static int i203 = 0;
    static int i204 = 0;
    static int i205 = 0;
    static int i206 = 0;
    static int i207 = 0;
    
    public void ATKgearWear( int rps)
    {
        int choice = rps;
        if(choice == 101 && i101 != 0)
        {
            gearOffATK();
            i101 = 2;
            Player.Sword = 101;
        }
        else if(choice == 100 )
        {
            gearOffATK();
            Player.Sword = 100;
        }
        else if(choice == 102 && i102 != 0)
        {
            gearOffATK();
            i102 = 2;
            Player.Sword = 102;
        }
        else if(choice == 103 && i103 != 0)
        {
            gearOffATK();
            i103 = 2;
            Player.Sword = 103;
        }
        else if(choice == 104 && i104 != 0)
        {
            gearOffATK();
            i104 = 2;
            Player.Sword = 104;
        }
        else if(choice == 105 && i105 != 0)
        {
            gearOffATK();
            i105 = 2;
            Player.Sword = 105;
        }
        else if(choice == 106 && i106 != 0)
        {
            gearOffATK();
            i106 = 2;
            Player.Sword = 106;
        }
        else if(choice == 107 && i107 != 0)
        {
            gearOffATK();
            i107 = 2;
            Player.Sword = 107;
        }

    }
    
    public void DEFgearWear( int rps )
    {
        int choice = rps;
        if(choice == 201 && i201 != 0)
        {
            gearOffDEF();
            i201 = 2;
            Player.Armor = 201;
        }
        else if(choice == 200 )
        {
            gearOffDEF();
            Player.Sword = 200;
        }
        else if(choice == 202 && i202 != 0)
        {
            gearOffDEF();
            i202 = 2;
            Player.Armor = 202;
        }
        else if(choice == 203 && i203 != 0)
        {
            gearOffDEF();
            i203 = 2;
            Player.Armor = 203;
        }
        else if(choice == 204 && i204 != 0)
        {
            gearOffDEF();
            i204 = 2;
            Player.Armor = 204;
        }
        else if(choice == 205 && i205 != 0)
        {
            gearOffDEF();
            i205 = 2;
            Player.Armor = 205;
        }
        else if(choice == 206 && i206 != 0)
        {
            gearOffDEF();
            i206 = 2;
            Player.Armor = 206;
        }
        else if(choice == 207 && i207 != 0)
        {
            gearOffDEF();
            i207 = 2;
            Player.Armor = 207;
        }

    }
    
    public void gearOffATK()
    {
        if(i101 != 0)
        {
            i101 = 1;
        }
        if(i102 != 0)
        {
            i102 = 1;
        }
        if(i103 != 0)
        {
            i103 = 1;
        }
        if(i104 != 0)
        {
            i104 = 1;
        }
        if(i105 != 0)
        {
            i105 = 1;
        }
        if(i106 != 0)
        {
            i106 = 1;
        }
        if(i107 != 0)
        {
            i107 = 1;
        }
    }
    
    public void gearOffDEF()
    {   
        if(i201 != 0)
        {
            i201 = 1;
        }
        if(i202 != 0)
        {
            i202 = 1;
        }
        if(i203 != 0)
        {
            i203 = 1;
        }
        if(i204 != 0)
        {
            i204 = 1;
        }
        if(i205 != 0)
        {
            i205 = 1;
        }
        if(i206 != 0)
        {
            i206 = 1;
        }
        if(i207 != 0)
        {
            i207 = 1;
        }
    }
}
