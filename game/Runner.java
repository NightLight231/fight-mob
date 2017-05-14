package game;

import java.util.Scanner;
/**
 * The first game I made
 * Advanture type text RPG
 * In early development
 * 
 * @Liyang Guo
 * @Version: 0.1.1 (May 14, 2017)
 */
public class Runner
{

    public static void main (String [] args)
    {
        Interactions game = new Interactions();
        SlowText t1 = new SlowText();
        Scanner w = new Scanner(System.in);

        /**
         * 2 door
         * 1 back door
         * key (clock)
         * time travel
         */

        System.out.println("Dream Escape (Early Development)");

        t1.printI("WARNING: DO NOT TYPE ANYTHING WHILE THE DESCRIPTION OR DIALOG IS APPEARING");
        t1.printI("WARNING: DO NOT TYPE ANYTHING WHILE THE DESCRIPTION OR DIALOG IS APPEARING");
        t1.printI("WARNING: DO NOT TYPE ANYTHING WHILE THE DESCRIPTION OR DIALOG IS APPEARING");
        t1.printD(".....");
        t1.printD("......");
        t1.printD(".......");
        t1.printI("You woke up, and looked around you.");
        t1.printI("You can't comprehend where you are or what is around you, \n except for the two doors infront of you.");
        t1.printI("One red, one blue, Which door will you walk through?");

        String door = w.nextLine();
        System.out.println("");
        door = door.toLowerCase();
        if(door.contains("blue"))
        {
            t1.printI(" You walked through the blue door.");
            System.out.println("");
        }
        else if(door.contains("red"))
        {
            t1.printI(" You walked through the red door.");
            System.out.println("");
        }
        else
        {
            t1.printI(" You accidently fall through the red door.");
            System.out.println("");
        }

        t1.printI("You woke up again, found that you are inside a wooden house.");
        t1.printI("All of the furnature was made out of wood");
        t1.printI("The analog clock on the wall showed that it's morning.");
        t1.printI("There is a chest in the house, You opened it.");
        t1.printI("You obtained 10 potions.");
        Items.cSHeal += 10;
        t1.printI("You walked outside of the house, and found that you are in a forest.");
        while(game.checkLife() == true && game.completeGame == false) 
        {
            game.interact();
        }
        t1.printI("You woked up again, back in your room, everything is the same, except there is a note on the door");
        t1.printI("yuiop[uio tyuhjkiopnm,kl; yuiop[uio hjkasdvbnert \n asdcvbtyuuioasdl;'l;'yui werop[nm, tyuhjkert ghjasdm,.ert? \n m,.asdyuibnmert fghop[rty nm,op[wer, \n bnmuiotyu tyuhjkert tyurtyuioert NIGHTMARE is still yuierttyu tyuop[ cvbop[m,.ert.");

        try
        {
            Thread.sleep(2000);
        }
        catch(Exception noo)
        {

        }
        t1.printI("Thank you for trying the <<Dream Escape>>, \n the main storyline still isn't refined to the part i would like it to be, \n I will keep refining it as the game develops.");
    }
}
