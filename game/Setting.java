package game;

import java.util.Scanner;

/**
 * Write a description of class Setting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Setting 
{

    SlowText t1 = new SlowText();
    static boolean fs = false;
    static boolean ds = false;
    static boolean ms1 = false;
    static boolean ms2 = false;

    static int place = 0;
    public boolean forest()
    {
        battleCore b1 = new battleCore();
        if(place == 1)
        {
            t1.printI("The forest have something off, it feel as if someone or something is watching you.");
        }
        if(place == 5)
        {
            t1.printI("There is a village near the end of the forest, There is a item shop.");
            fs = true;
        }
        if(true)
        {
            return b1.battle(1);
        }
        else
        {
            return true;
        }
    }

    public boolean desert()
    {
        battleCore b1 = new battleCore();
        if(place == 6)
        {
           t1.printI("The desert seems desolet, there isn't anything here besides sand and more sand. Better just hurry and leave this place.");
        }
        if(place == 10)
        {
            ds = true;
        }
        return b1.battle(2);
    }

    public boolean mountain()
    {
        battleCore b1 = new battleCore();
        if(place == 16)
        {
            ms1 = true;
            t1.printI("The feeling of something that watches you grow stronger...");
        }
        if(place == 20)
        {
            t1.printI("A protal stands before you, you sence who ever is watching you, it is in there. \n However, once you enter, there is no return. Better make sure you have all the items you need.(shop is available)");
            ms2 = true;
        }
        return b1.battle(4);
    }

    public boolean unknow()
    {
        battleCore b1 = new battleCore();
        if(place == 21)
        {
            System.out.println(" ..... Your mind can't comprehend where you are. There is only one way to go, infront of you.");
        }
        if(place == 22)
        {
            if(true)
            {
                return b1.battle(6);
            }
        }
        if(place == 23)
        {

            return b1.battle(8);
        }
        if(place == 24)
        {

            return b1.battle(10);
            
        }
        return true;
    }

}
