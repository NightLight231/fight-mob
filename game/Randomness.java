package game;

import java.util.Random;
/**
 * Write a description of class Randomness here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Randomness 
{

    Random rand = new Random();
    
    public int calRunChance()
    {
        int runChance = rand.nextInt(100)+1;
        return runChance;
    }

    public int RAM( int atk) // random attack modifier
    {

        atk /= 10;
        int RN = rand.nextInt(10)+1;

        int mod = rand.nextInt(100)+1;
        if(mod >= 10)
        {
            atk += RN;
            atk *= 3;
            return atk;
        }
        else
        {
            atk -= RN;
            atk *= 3;
            return atk;
        }
    }

    public boolean crit()
    {

        int chance = rand.nextInt(30)+1;
        if(chance == 21)
        {
            return true;
        }
        return false;
    }

    public int calRewordChance()
    {

        int goldGain = rand.nextInt(30)+1;
        
        return goldGain;
    }

    public int calEXPChance()
    {

        int EXPGain = rand.nextInt(80)+1;

        return EXPGain;
    }

}
