package game;


/**
 * Write a description of class itemsMethod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class itemsCore extends Items
{
    
    
    public void calItems()
    {
        callWeapon();
        callHeal();
        callConsume();
        items = Weapons + Consume + cTHeal;
    }

    public void callWeapon()
    {
        Weapons = wSword+wArmor;
    }

    public void callHeal()
    {
        cTHeal = cSHeal+cGHeal+cMHeal;
    }

    public void callConsume()
    {
        Consume = cLife+cTP;
    }
}
