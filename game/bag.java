package game;

import java.util.Scanner;
public class bag extends Player
{
    itemsCore i1 = new itemsCore();
    Gear g1 = new Gear();
    Scanner w1 = new Scanner(System.in);
    Scanner n = new Scanner(System.in);
    SlowText t1 = new SlowText();

    public void bag() 
    {
        while(true)
        {
            i1.calItems();
            if(Items.items == 0)
            {
                t1.printI("You don't have any item.");
            }

            else
            {
                t1.printI("The item in the bag: ");

                i1.callHeal();
                if(Items.cTHeal >= 1)
                {
                    t1.printI("Small Heal potion: \t"+Items.cSHeal+" (hp + 40)");
                    t1.printI("Great Heal potion: \t"+Items.cGHeal+" (hp + 100)");
                    t1.printI("MAX Heal potion:   \t"+Items.cMHeal+" (hp = MAX)");
                }

                i1.callWeapon();
                if(Items.Weapons >= 1)
                {
                    t1.printI("Swords: \t"+Items.wSword);
                    t1.printI("Armors: \t"+Items.wArmor);
                }

                i1.callConsume();
                if( Items.Consume >= 1)
                {
                    t1.printI("Ticket:     \t"+Items.cTP);
                    t1.printI("Soul Stone: \t"+Items.cLife);
                }
                t1.printI("What do you want to use? ");
                String useItem = w1.nextLine();
                useItem = useItem.trim();
                useItem = useItem.toLowerCase();
                if(useItem.contains("heal")|| useItem.contains("potion"))
                {
                    if(useItem.contains("small"))
                    {
                        useSHeal();
                    }
                    else if(useItem.contains("great"))
                    {
                        useSHeal();
                    } 
                    else if(useItem.contains("max"))
                    {
                        useSHeal();
                    } 
                    else
                    {
                        useHeal();
                    }
                }

                else if(useItem.contains("sword"))
                {
                    ATKequipment();
                }

                else if(useItem.contains("armor"))
                {
                    DEFequipment();
                }
                else if(useItem.contains("ticket"))
                {
                    TP();
                }
                else if(useItem.contains("soul") || (useItem.contains("stone")))
                {
                    lifeAdd();
                }
                else if(useItem.contains("leave") || useItem.contains("exit")) 
                {
                    break;
                }
                else
                {
                    t1.printI("... Don't have that");
                }
            }
        }
    }

    public void lifeAdd()
    {
        playerLive += 1;
        t1.printI("You soul have been stored in the stone(Life + 1)");
    }

    public void TP()
    {

        t1.printI("Which shop do you want to go? \n forest shop = 5 \n desert shop = 10 \n mountain shop = 16 or 20.");
        int rps = n.nextInt();
        if(Setting.place <= 20)
        {
            if(Setting.fs && rps == 5)
            {
                Setting.place = 5;
                t1.printI("You arrive at the forest shop");
            }
            else if(Setting.ds && rps == 10)
            {
                Setting.place = 10;
                t1.printI("You arrive at the desert shop");
            }
            else if(Setting.ms1 && rps == 16)
            {
                Setting.place = 16;
                t1.printI("You arrive at the Mountain shop 1");
            }
            else if(Setting.ms2 && rps == 20)
            {
                Setting.place = 20;
                t1.printI("You arrive at the Mountain shop 2");
            }
            else
            {
                t1.printI("You havn't been to this shop yet.");
            }
        }
        else
        {
            t1.printI("The ticket is useless now since there is now way to travel back...");
        }
    }

    public void ATKequipment()
    {
        while(true)
        {
            t1.printI("What do you want to do? (equip or unequip)");
            String choice = w1.nextLine();
            if(choice.equalsIgnoreCase("equip"))
            {
                ATKequipWear();
                break;
            }
            else if(choice.equalsIgnoreCase("unequip"))
            {
                g1.gearOffATK();
                t1.printI("You are current unequiped with all ATK gears.");
                break;
            }
            else
            {
                t1.printI("... Not able to do that. ");
            }

        }
    }

    public void ATKequipWear()
    {
        if(Items.wSword >= 1)
        {
            t1.printI("You current have");
            if(Gear.i101 == 1)
            {
                t1.printI("Wooden Sword ( + 5 atk, # = 101)");
            }
            if(Gear.i102 == 1)
            {
                t1.printI("Stone Sword ( + 10 atk, # = 102)");
            }
            if(Gear.i103 == 1)
            {
                t1.printI("Golden Sword ( + 15 atk, # = 103)");
            }
            if(Gear.i104 == 1)
            {
                t1.printI("Steel Sword ( + 20 atk, # = 104)");
            }
            if(Gear.i105 == 1)
            {
                t1.printI("Raging Sword ( + 40 atk, # = 105)");
            }
            if(Gear.i106 == 1)
            {
                t1.printI("Mystical Sword ( + 80 atk, # = 106)");
            }
            if(Gear.i107 == 1)
            {
                t1.printI("Night's Blight ( + 100 atk, # = 107)");
            }
        }
        else
        {
            t1.printI("No sword in possition ");
        }

        t1.printI("What sword do you want to equipe? (Please type in the weapon number)");
        int rps = n.nextInt();
        g1.ATKgearWear( rps );

        t1.printI("You now are equiped with:");
        if( Player.Sword== 101 && Gear.i101 == 2)
        {
            t1.printI("Wooden Sword ( + 5 atk )");
        }
        else if( Player.Sword== 102 && Gear.i102 == 2)
        {
            t1.printI("Stone Sword ( + 10 atk )");
        }
        else if( Player.Sword== 103 && Gear.i103 == 2)
        {
            t1.printI("Golden Sword ( + 15 atk )");
        }
        else if( Player.Sword== 104 && Gear.i104 == 2)
        {
            t1.printI("Steel Sword ( + 20 atk )");
        }
        else if( Player.Sword== 105 && Gear.i105 == 2)
        {
            t1.printI("Raging Sword ( + 40 atk )");
        }
        else if( Player.Sword== 106 && Gear.i106 == 2)
        {
            t1.printI("Mystical Sword ( + 80 atk )");
        }
        else if( Player.Sword== 107 && Gear.i107 == 2)
        {
            t1.printI("Night's Blight ( + 100 atk )");
        }
        else
        {
            t1.printI("No sword equiped");
        }
    }

    public void DEFequipment()
    {
        while(true)
        {
            t1.printI("What do you want to do? (equip or unequip)");
            String choice = w1.nextLine();
            if(choice.equalsIgnoreCase("equip"))
            {
                DEFequipWear();
                break;
            }
            else if(choice.equalsIgnoreCase("unequip"))
            {
                g1.gearOffDEF();
                t1.printI("You are current unequiped with all DEF gears.");
                break;
            }
            else
            {
                t1.printI("... Not able to do that. ");
            }

        }
    }

    public void DEFequipWear() 
    {
        if(Items.wArmor >= 1)
        {
            t1.printI("You current have");
            if(Gear.i201 == 1)
            {
                t1.printI("Lether Coat ( + 10 def, # = 201)");
            }
            if(Gear.i202 == 1)
            {
                t1.printI("Iron Armor ( + 20 def, # = 202)");
            }
            if(Gear.i203 == 1)
            {
                t1.printI("Turtle Shell ( + 30 def, # = 203)");
            }
            if(Gear.i204 == 1)
            {
                t1.printI("Steel Armor ( + 40 def, # = 204)");
            }
            if(Gear.i205 == 1)
            {
                t1.printI("Dragon Scale ( + 55 def, # = 205)");
            }
            if(Gear.i206 == 1)
            {
                t1.printI("Dragon Skull ( + 70 def, # = 206)");
            }
            if(Gear.i207 == 1)
            {
                t1.printI("Night's Light ( + 100 def, # = 207)");
            }
        }
        else
        {
            t1.printI("No Armor in possition ");
        }

        t1.printI("What Armor do you want to equipe? (Please type in the weapon number)");
        int rps = n.nextInt();
        g1.DEFgearWear( rps );

        t1.printI("You now are equiped with:");
        if( Player.Armor== 201 && Gear.i201 == 2)
        {
            t1.printI("Lether Coat ( + 10 def)");
        }
        else if( Player.Armor== 202 && Gear.i202 == 2)
        {
            t1.printI("Iron Armor ( + 20 def)");
        }
        else if( Player.Armor== 203 && Gear.i203 == 2)
        {
            t1.printI("Turtle Shell ( + 30 def)");
        }
        else if( Player.Armor== 204 && Gear.i204 == 2)
        {
            t1.printI("Steel Armor ( + 40 def )");
        }
        else if( Player.Armor== 205 && Gear.i205 == 2)
        {
            t1.printI("Dragon Scale ( + 55 def )");
        }
        else if( Player.Armor== 206 && Gear.i206 == 2)
        {
            t1.printI("Dragon Scale ( + 70 def )");
        }
        else if( Player.Armor== 207 && Gear.i207 == 2)
        {
            t1.printI("Night's Light ( + 100 def )");
        }
        else
        {
            t1.printI("No Armor equiped");
        }
    }

    public void useHeal()
    {
        while(true)
        {
            if(Items.cTHeal >= 1)
            {
                t1.printI("What size of heal do you want to use?(small, geart, max)");
                String rps = w1.nextLine();
                rps = rps.toLowerCase();
                if(rps.equalsIgnoreCase("small"))
                {
                    useSHeal();
                    break;
                }
                else if(rps.equalsIgnoreCase("great"))
                {
                    useGHeal();
                    break;
                }
                else if(rps.equalsIgnoreCase("max"))
                {
                    useMHeal();
                    break;
                }
                else if(rps.contains("no") || rps.contains("exit") || rps.contains("leave"))
                {
                    break;
                }
                else
                {
                    t1.printI("... can't do that");
                }
            }
            else
            {
                t1.printI("Don't have anymore Heal Potions");
            }
        }
    }

    public void useSHeal()
    {
        if(Items.cSHeal >= 1)
        {
            while (true)
            { 
                t1.printI("Do you want to use a heal potion?");
                String choice = w1.nextLine();
                if (choice.equalsIgnoreCase("yes"))
                {
                    Items.cSHeal -= 1;
                    hp += 40;
                    if(hp > maxHP)
                    {
                        hp = maxHP;
                    }
                    t1.printI("You used a potion.");
                    if(Items.cSHeal < 1)
                    {
                        t1.printI("You run out of small heal");
                        break;
                    }
                    t1.printI("HP: "+Player.hp+ ("/")+Player.maxHP);
                }
                else if (choice.equalsIgnoreCase("no"))
                { 
                    break;
                }
                else
                {
                    t1.printI("... No able to do that.");
                }
            }
        }
        else
        {
            t1.printI("You don't have any Small Heal.");
        }
    }

    public void useGHeal()
    {
        if(Items.cGHeal >= 1)
        {
            while (true)
            { 
                t1.printI("Do you want to use a great heal potion?");
                String choice = w1.nextLine();
                if (choice.equalsIgnoreCase("yes"))
                {
                    Items.cGHeal -= 1;
                    hp += 100;
                    if(hp > maxHP)
                    {
                        hp = maxHP;
                    }
                    t1.printI("You used a potion.");
                    if(Items.cGHeal < 1)
                    {
                        t1.printI("You run out of great heal");
                        break;
                    }
                    t1.printI("HP: "+Player.hp+ ("/")+Player.maxHP);
                }
                else if (choice.equalsIgnoreCase("no"))
                { 
                    break;
                }
                else
                {
                    t1.printI("... No able to do that.");
                }
            }
        }
        else
        {
            t1.printI("You don't have any great Heal.");
        }
    }

    public void useMHeal()
    {
        if(Items.cMHeal >= 1)
        {
            while (true)
            { 
                t1.printI("Do you want to use a MAX heal potion?");
                String choice = w1.nextLine();
                if (choice.equalsIgnoreCase("yes"))
                {
                    Items.cMHeal -= 1;

                    hp = maxHP;

                    t1.printI("You used a MAX potion.");
                    if(Items.cGHeal < 1)
                    {
                        t1.printI("You run out of MAX heal");
                        break;
                    }
                    t1.printI("HP: "+Player.hp+ ("/")+Player.maxHP);
                }
                else if (choice.equalsIgnoreCase("no"))
                { 
                    break;
                }
                else
                {
                    t1.printI("... No able to do that.");
                }
            }
        }
        else
        {
            t1.printI("You don't have any MAX Heal.");
        }
    }

}

    