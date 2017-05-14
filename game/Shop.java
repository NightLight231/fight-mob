package game;

import java.util.Scanner;
/**
 * Write a description of class Shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop 
{
    Gear g1 = new Gear();

    Scanner w3 = new Scanner(System.in);
    Scanner n = new Scanner(System.in);
    SlowText t1 = new SlowText();
    /**
     * Swords:
     * 101 = wood atk + 5 100g
     * 102 = stone atk + 10  200g
     * 103 = gold atk  + 15  400g 
     * 104 = steel atk + 20  1000g
     * 105 = Rage atk + 40   2500g 
     * 106 = Mystic atk + 80  5000g
     * 107 = Night's Blight + 100  9001g
     * 
     * Armor:
     * 201 = fur def + 10  100g
     * 202 = iron def + 20  200g
     * 203 = Turtle shell + 30
     * 204 = steel + 40
     * 205 = Dragon Scale def + 50  2500g
     * 206 = Dragon Skull def + 70  3500g
     * 207 = Night's Light + 90  7000g
     * 
     * Consumerable:
     * 301 = heal hp + 40   20g   
     * 302 = Great heal + 100   100g
     * 303 = Max heal + full    150g 
     * 304 = Ticket (Travel to any shop in the world) 500g
     * 305 = Soul Stone + 1 life  2000g
     */

    public void buy()
    {
        while(true)
        {
            t1.printI("The Shop have Swords, Armors, Consumable.");
            String buyType = w3.nextLine();
            buyType = buyType.trim();
            System.out.println(" ");
            buyType = buyType.toLowerCase();
            if(buyType.contains("sword"))
            {
                buySword();
            }
            else if(buyType.contains("armor"))
            {
                buyArmor();
            }
            else if(buyType.contains("consumable"))
            {
                buyConsume();
            }
            else if(buyType.contains("leave") || buyType.contains("exit")) 
            {
                break;
            }
            else
            {
                t1.printI("Sorry, we don't have those type of items");
            }
        }
    }

    private void buySword()
    {
        t1.printI("We have the following Swords:");
        t1.printI("Shelf Number       \t Atk Increase \t Cost");
        t1.printI("101 wood Sword     \t atk + 5      \t 100 Gold");
        t1.printI("102 stone Sword    \t atk + 10     \t 200 Gold");
        t1.printI("103 gold Sword     \t atk + 15     \t 400 Gold");
        t1.printI("104 steel Sword    \t atk + 20     \t 1000 Gold");
        t1.printI("105 Rage           \t atk + 40     \t 2500 Gold");
        t1.printI("106 Mystic         \t atk + 80     \t 5000 Gold");
        t1.printI("107 Night's Blight \t atk + 100    \t 9001 Gold");
        t1.printI(" Your Gold: "+Player.gold); 

        while(true)
        {
            t1.printI("What do you want to buy? Please type in the Shelf Number.");
            t1.printI("Type 100 to exit the shop.");
            int shelfNum = n.nextInt();
            if(shelfNum == 101 && Player.gold >= 100)
            {
                Player.gold -= 100;
                Gear.i101 = 1;
                Items.wSword++;
                t1.printI("You brought a wooden sword");
            }
            else if(shelfNum == 102 && Player.gold >= 200)
            {
                Player.gold -= 200;
                Gear.i102 = 1;
                Items.wSword++;
                t1.printI("You brought a stone sword");
            }
            else if(shelfNum == 103 && Player.gold >= 400)
            {
                Player.gold -= 400;
                Gear.i103 = 1;
                Items.wSword++;
                t1.printI("You brought a gold sword");
            }
            else if(shelfNum == 104 && Player.gold >= 1000)
            {
                Player.gold -= 1000;
                Gear.i104 = 1;
                Items.wSword++;
                t1.printI("You brought a steel sword");
            }
            else if(shelfNum == 105 && Player.gold >= 2500)
            {
                Player.gold -= 2500;
                Gear.i105 = 1;
                Items.wSword++;
                t1.printI("You brought The Raging sword");
            }
            else if(shelfNum == 106 && Player.gold >= 5000)
            {
                Player.gold -= 5000;
                Gear.i106 = 1;
                Items.wSword++;
                t1.printI("You brought The Mystical sword");
            }
            else if(shelfNum == 107 && Player.gold >= 9001)
            {
                Player.gold -= 9001;
                Gear.i107 = 1;
                Items.wSword++;
                t1.printI("You Brought The Night's Blight!");
            }
            else if(shelfNum == 100)
            {
                t1.printI("You have exit the shop.");
                break;
            }
            else 
            {
                t1.printI("You don't have the ability to buy that");
            }
        }
    }

    private void buyArmor()
    {
        t1.printI("We have the following Armor:");
        t1.printI("Shelf Number       \t Def Increase \t Cost");
        t1.printI("201 Lether Coat    \t def + 10     \t 100 Gold");
        t1.printI("202 Iron Armor     \t def + 20     \t 200 Gold");
        t1.printI("203 Turtle Shell   \t def + 30     \t 500 Gold ");
        t1.printI("204 Steel Armor    \t def + 40     \t 1000 Gold");
        t1.printI("205 Dragon Scale   \t def + 55     \t 2500 Gold");
        t1.printI("206 Dragon Skull   \t def + 70     \t 5000 Gold");
        t1.printI("207 Night's Light  \t def + 100    \t 7000 Gold");
        t1.printI(" Your Gold: "+Player.gold); 

        while(true)
        {
            t1.printI("What do you want to buy? Please type in the Shelf Number.");
            t1.printI("Type 200 to exit the shop.");
            int shelfNum = n.nextInt();
            if(shelfNum == 201 && Player.gold >= 100)
            {
                Player.gold -= 100;
                Gear.i201 = 1;
                Items.wArmor++;
                t1.printI("You brought a Lether Coat");
            }
            else if(shelfNum == 202 && Player.gold >= 200)
            {
                Player.gold -= 200;
                Gear.i202 = 1;
                Items.wArmor++;
                t1.printI("You brought a Iron Armor");
            }
            else if(shelfNum == 203 && Player.gold >= 500)
            {
                Player.gold -= 500;
                Gear.i203 = 1;
                Items.wArmor++;
                t1.printI("You brought a Turtle Shell");
            }
            else if(shelfNum == 204 && Player.gold >= 1000)
            {
                Player.gold -= 1000;
                Gear.i204 = 1;
                Items.wArmor++;
                t1.printI("You brought a Steel Armor");
            }
            else if(shelfNum == 205 && Player.gold >= 2500)
            {
                Player.gold -= 2500;
                Gear.i205 = 1;
                Items.wArmor++;
                t1.printI("You brought The Dragon's Scale");
            }
            else if(shelfNum == 206 && Player.gold >= 5000)
            {
                Player.gold -= 5000;
                Gear.i206 = 1;
                Items.wArmor++;
                t1.printI("You brought The Dragon Skull");
            }
            else if(shelfNum == 207 && Player.gold >= 7000)
            {
                Player.gold -= 7000;
                Gear.i207 = 1;
                Items.wArmor++;
                t1.printI("You Brought The Night's Light!");
            }
            else if(shelfNum == 200)
            {
                t1.printI("You have exit the shop.");
                break;
            }
            else 
            {
                t1.printI("You don't have the ability to buy that");
            }
        }
    }

    private void buyConsume()
    {
        t1.printI("We have the following items:");
        t1.printI("Shelf Number       \t Effects               \t Cost");
        t1.printI("301 smal heal      \t hp + 40               \t 20 Gold");   
        t1.printI("302 Great heal     \t hp + 100              \t 100 Gold");
        t1.printI("303 Max heal       \t hp + full             \t 150 Gold");
        t1.printI("304 Ticket         \t(Travel to any shop)   \t 500 Gold");
        t1.printI("305 Soul Stone     \t + 1 life              \t 2000 Gold");
        t1.printI(" Your Gold: "+Player.gold); 
        
        while(true)
        {
            t1.printI("What do you want to buy? Please type in the Shelf Number.");
            t1.printI("Type 300 to exit the shop.");
            int shelfNum = n.nextInt();
            if(shelfNum == 301 && Player.gold >= 20)
            {
                Player.gold -= 20;
                Items.cSHeal++;
                t1.printI("You brought a small heal");
            }
            else if(shelfNum == 302 && Player.gold >= 100)
            {
                Player.gold -= 100;
                Items.cGHeal++;
                t1.printI("You brought a great heal");
            }
            else if(shelfNum == 303 && Player.gold >= 150)
            {
                Player.gold -= 150;
                Items.cMHeal++;
                t1.printI("You brought a MAX heal");
            }
            else if(shelfNum == 304 && Player.gold >= 500)
            {
                Player.gold -= 500;
                Items.cTP++;
                t1.printI("You brought a Ticket");
            }
            else if(shelfNum == 305 && Player.gold >= 2000)
            {
                Player.gold -= 2000;
                Items.cLife++;
                t1.printI("You brought a soul stone");
            }
            else if(shelfNum == 300)
            {
                t1.printI("You have exit the shop.");
                break;
            }
            else 
            {
                t1.printI("You don't have the ability to buy that");
            }
        }
    }

}
