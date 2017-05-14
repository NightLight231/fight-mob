package game;

import java.util.Scanner;
/**
 * Write a description of class Setting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Interactions 
{

    SlowText t1 = new SlowText();
    Shop shop = new Shop();
    bag b1 = new bag();
    Scanner w4 = new Scanner(System.in);

    boolean completeGame = false;

    public void interact()
    {
        boolean win = false;

        if( Setting.place >= 25)
        {
            t1.printI("There is yellow door infront of you, but it needs a key, the key hole is a round shape.");
            t1.printI("What is the one thing out of place ever since you enter this?");
            String key = w4.nextLine();
            key = key.toLowerCase();
            if(key.contains("clock"))
            {
                t1.printI("The door opened, you have escaped this place(which you learned from leave it,is your dream). for now.");
                t1.printI("'mjj', those 3 letters flashed through your head.");
                wonGame();
                win = true;
            }
            else
            {
                t1.printI("You sudden clapsed to the ground.");
                wonGame();
                win = true;
            }
        }

        if(win == false)
        {
            checkLvlUp();
            gear();
            statis(0);
            t1.printI("What do you what to do? (advance, retreat, Status, Bag , Shop)");
            String rps = w4.nextLine();
            rps = rps.toLowerCase();
            System.out.println("");
            if(rps.contains("advance"))
            {
                move(true);
            }
            else if(rps.contains("retreat"))
            {
                if(Setting.place <= 20)
                {
                    move(false);
                }
                else
                {
                    t1.printI("You can't turn back now");
                }
            }
            else if(rps.contains("status"))
            {
                statis(1);
            }
            else if(rps.contains("bag"))
            {
                b1.bag();
            }
            else if(rps.contains("shop"))
            {
                if(Setting.place == 5 || Setting.place == 10 || Setting.place == 16 || Setting.place == 20)
                {
                    shop.buy();
                }
                else
                {
                    t1.printI("There isn't a shop near you. ");
                }
            }
            else if(rps.equals("test2"))
            {
                Player.gold += 1000000;
                Player.EXP += 550000;
                Setting.place = 24;
            }
            else if(rps.equals("test"))
            {
                Player.gold += 1000000;
                Player.EXP += 550000;
                Setting.place = 20;
            }
            else
            {
                System.out.println(" A Voice Says in your head: \n'There is a Time and Place for everything,\nnow isn't the time or place.'");
            }

        }
    }

    public void statis(int n)
    {
        Player p1 = new Player();

        p1.statusCal();

        String Sword;
        if(Gear.i107 == 2)
        {
            Sword ="The Night's Blight";
        }
        else if(Gear.i106 == 2)
        {
            Sword ="The Mystical Sword";
        }
        else if(Gear.i105 == 2)
        {
            Sword ="The Rage";
        }
        else if(Gear.i104 == 2)
        {
            Sword ="The Steel Sword";
        }
        else if(Gear.i103 == 2)
        {
            Sword ="The Gold Sword";
        }
        else if(Gear.i102 == 2)
        {
            Sword ="The Stone Sword";
        }
        else if(Gear.i101 == 2)
        {
            Sword ="The Wooden Sword";
        }
        else
        {
            Sword = "None";
        }

        String Armor;
        if(Gear.i207 == 2)
        {
            Armor ="Night's Light";
        }
        else if(Gear.i206 == 2)
        {
            Armor ="Dragon's Shell";
        }
        else if(Gear.i205 == 2)
        {
            Armor ="Dragon's Scale";
        }
        else if(Gear.i204 == 2)
        {
            Armor ="Steel Armor";
        }
        else if(Gear.i203 == 2)
        {
            Armor ="Turtle Shell";
        }
        else if(Gear.i202 == 2)
        {
            Armor ="Iron Armor";
        }
        else if(Gear.i201 == 2)
        {
            Armor ="Lether Coat";
        }
        else 
        {
            Armor ="None";
        }
        
        if(n == 1)
        {
            t1.printI("Statis: \n Hp: "+Player.hp +"/"+Player.maxHP+"\n ATK: "+Player.atk +"\n DEF: "+Player.def+" \n Gold:"+ Player.gold+" \n Level: "+Player.Lvl+ "\n EXP: "+Player.EXP+"/"+(Player.lvlGap*Player.Lvl)+"\n Sword: "+Sword+"\n Armor: "+Armor);
        }
    }

    public void move( boolean advance)
    {
        Setting s1 = new Setting();

        boolean rps = advance;
        if(rps)
        {
            Setting.place++;
        }
        else
        {
            Setting.place--;
        }

        if(Setting.place <= 5)
        {
            if(s1.forest() == false)
            {
                Player.playerLive -= 1;
            }
        }
        else if(Setting.place <= 10)
        {
            if(s1.desert() == false)
            {
                Player.playerLive -= 1;
            }
        }
        else if(Setting.place <= 20)
        {
            if(s1.mountain() == false)
            {
                Player.playerLive -= 1;
            }
        }
        else if(Setting.place <= 27)
        {
            if(s1.unknow() == false)
            {
                Player.playerLive -= 1;
            }
        }

    }

    public boolean checkLife()
    {
        if(Player.playerLive <= 0)
        {
            return false;
        }
        return true;
    }

    public void wonGame()
    {
        completeGame = true;
    }

    public void checkLvlUp()
    {
        while(Player.EXP >= Player.lvlGap*Player.Lvl)
        {
            Player.EXP -= Player.lvlGap*Player.Lvl;
            Player.Lvl++;
            Player.Batk += 20;
            Player.Bdef += 20;
            Player.maxHP += 100;
            Player.hp += 100;
        }
    }

    public void gear()
    {
        if( Player.Sword== 101 && Gear.i101 == 2)
        {
            Player.Watk = 5;
        }
        else if( Player.Sword== 102 && Gear.i102 == 2)
        {
            Player.Watk = 10;
        }
        else if( Player.Sword== 103 && Gear.i103 == 2)
        {
            Player.Watk = 15;
        }
        else if( Player.Sword== 104 && Gear.i104 == 2)
        {
            Player.Watk = 20;
        }
        else if( Player.Sword== 105 && Gear.i105 == 2)
        {
            Player.Watk = 40;
        }
        else if( Player.Sword== 106 && Gear.i106 == 2)
        {
            Player.Watk = 80;
        }
        else if( Player.Sword== 107 && Gear.i107 == 2)
        {
            Player.Watk = 100;
        }

        if( Player.Armor== 201 && Gear.i201 == 2)
        {
            Player.Wdef = 10;
        }
        else if( Player.Armor== 202 && Gear.i202 == 2)
        {
            Player.Wdef = 20;
        }
        else if( Player.Armor== 203 && Gear.i203 == 2)
        {
            Player.Wdef = 30;
        }
        else if( Player.Armor== 204 && Gear.i204 == 2)
        {
            Player.Wdef = 40;
        }
        else if( Player.Armor== 205 && Gear.i205 == 2)
        {
            Player.Wdef = 55;
        }
        else if( Player.Armor== 206 && Gear.i206 == 2)
        {
            Player.Wdef = 70;
        }
        else if( Player.Armor== 207 && Gear.i207 == 2)
        {
            Player.Wdef = 100;
        }
    }

}
