package game;

/**
 * Write a description of class Items here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Items
{
    static int wSword = 0;
    static int wArmor = 0;
    
    static int cSHeal = 0;
    static int cGHeal = 0;
    static int cMHeal = 0;
    static int cLife = 0;
    static int cTP = 0;

    static int items = wSword+wArmor+cSHeal;

    static int Weapons = wSword+wArmor;

    static int Consume = cLife+cTP;
    
    static int cTHeal = cSHeal+cGHeal+cMHeal;

}
