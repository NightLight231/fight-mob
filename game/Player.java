package game;


/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Items
{

    //att
    static int Batk = 50;
    static int Watk = 0;
    static int atk = Batk + Watk;

    static int Bdef = 50;
    static int Wdef = 0;
    static int def = Bdef + Wdef;

    static int hp = 300;
    static int maxHP = 300;
    static int playerLive = 1;

    static int gold = 0;
    static int life = 1;
    static int EXP = 0;
    static int Lvl = 1;

    static int Sword = 100;
    static int Armor = 100;

    static int lvlGap = 100;

    //function
    public int doATK(int def, int atk)
    {
        def /= 4;
        atk = atk - def;
        return atk;
    }

    public void statusCal()
    {
        Player.atk = Player.Watk + Player.Batk;
        Player.def = Player.Wdef + Player.Bdef;
    }

}