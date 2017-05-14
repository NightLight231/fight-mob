package game;

import java.util.Scanner;
/**
 * Write a description of class battleCore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class battleCore 
{

    SlowText t1 = new SlowText();
    
    
    Monster m0 = new Monster();
    Monster m1 = new Monster(1);

    public boolean battle( int mlvl )
    { 

        if(mlvl == 10)
        {
            t1.printI("The Eternal Nightmare stands infront of you");
        }
        else if (mlvl == 8)
        {
            t1.printI("Your Nightmare grows stronger.");
        }
        else if(mlvl == 6)
        {
            t1.printI("Your dusk is near, and HERE.");
        }
        else
        {
            t1.printI("A monster have blocked your way");
            // note
            // different for each area, 3 speacial for each, one general, special dialog for rare mob 
        }
        monsterlvl( mlvl );
        statusCal();

        for (int i = 0; i < 1000; i++)
        {
            if( i%2 == 0)
            {
                if(playerAtkPhase( mlvl ))
                {
                    return true;
                }
            }
            else if (i%2 == 1)
            {
                Matk();
                if(Player.hp <= 0 )
                {
                    t1.printD("You are dead");
                    t1.printI("This is only a bad dream....");
                    try
                    {
                        Thread.sleep(5000);
                        t1.printD("OR, THIS IT?");
                    }
                    catch(Exception Noo)
                    {
                    
                    }
                    System.exit(0);
                }
            }
            else
            {
                System.out.println("BATTLE FUNCTION ERROR");
                return false;
            }
        }
        System.out.println("BATTLE RETURN ERROR");

        return false;
    }

    public boolean playerAtkPhase(int mlvl)
    {
        Randomness r1 = new Randomness(); 

        Scanner w4 = new Scanner(System.in);
        while (true)
        {
            t1.printI("What do you want to do? (ATK, RUN, Bag)");
            String act = w4.nextLine();
            act = act.trim();
            act = act.toLowerCase();
            if(act.contains("atk"))
            {
                atk();
                if(m0.hp <= 0)
                {
                    t1.printI("The monster is dead.");
                    PBR( mlvl );
                    return true;
                }
                return false;
            }
            else if(act.contains("run"))
            {
                if( r1.calRunChance() <= 15)
                {
                    t1.printI("You have runned away");
                    return true;
                }
                else
                {
                    t1.printI("You have failed to run away.");
                    return false;
                }
            }   
            else if(act.contains("bag"))
            {
                bag b1 = new bag();
                b1.bag();
                continue;
            }
            else
            {
                t1.printI("... Can't do that"); 
            }
        }
    }

    public void atk()
    {
        Randomness r1 = new Randomness(); 
        Player p1 = new Player();

        int Oatk = Player.atk;
        Player.atk += r1.RAM(Player.atk);
        int atk = p1.doATK(m0.def, Player.atk);

        if(r1.crit())
        {
            atk *= 2;
            t1.printI("CRITICAL HIT!!!");
        }

        t1.printI("You did "+atk+" damage");
        m0.hp -= atk;
        t1.printI("Enermy remain HP is "+m0.hp);

        Player.atk = Oatk;
    }

    public void Matk()
    {
        Randomness r1 = new Randomness(); 

        int Oatk = m0.atk;
        t1.printI("The monster attacked.");
        m0.atk += r1.RAM(m0.atk);
        int atk = m0.doATK(Player.def, m0.atk);

        if(r1.crit())
        {
            atk *= 2;
            t1.printI("CRITICAL HIT!!!");
        }

        t1.printI("The monster did "+atk+" damage");
        Player.hp -= atk; 
        t1.printI("Your remain HP is "+Player.hp);

        m0.atk = Oatk;
    }

    public void PBR( int mul) // post battle reword
    {
        mul /= 2;
        
        Randomness r1 = new Randomness(); 

        int gold = r1.calRewordChance()+30;
        int EXP = r1.calEXPChance()+50;

        Player.gold += gold*mul;
        Player.EXP += EXP*mul;
        t1.printI("You obtained "+(gold*mul)+" Gold;");
        t1.printI("You obtained "+(EXP*mul)+" EXP.");

    }

    public void monsterlvl(int mlvl)
    {
        if( mlvl == 2)
        {
            Monster m2 = new Monster(2);
            m0.hp = m2.hp;
            m0.atk = m2.atk;
            m0.def = m2.def;
        }
        else if( mlvl == 4)
        {
            Monster m4 = new Monster(4);
            m0.hp = m4.hp;
            m0.atk = m4.atk;
            m0.def = m4.def;
        }
        else if( mlvl == 6)
        {
            Monster b6 = new Monster(6);
            m0.hp = b6.hp += 600;
            m0.atk = b6.atk += 60;
            m0.def = b6.def += 60;
        }
        else if( mlvl == 8)
        {
            Monster b8 = new Monster(8);
            m0.hp = b8.hp += 800;
            m0.atk = b8.atk += 80;
            m0.def = b8.def += 80;
        }
        else if( mlvl == 10)
        {
            Monster b10 = new Monster(10);
            m0.hp = b10.hp += 1000;
            m0.atk = b10.atk += 100;
            m0.def = b10.def += 100;
        }
        else
        {
            m0.hp = m1.hp;
        }
    }

    public void statusCal()
    {
        Player.atk = Player.Watk + Player.Batk;
        Player.def = Player.Wdef + Player.Bdef;
    }

}
