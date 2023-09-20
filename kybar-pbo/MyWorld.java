import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bola bola = new bola();
        addObject(bola,253,226);
        bola bola2 = new bola();
        addObject(bola2,171,347);
        bola bola3 = new bola();
        addObject(bola3,315,350);
        bola bola4 = new bola();
        addObject(bola4,387,226);
        bola bola5 = new bola();
        addObject(bola5,451,345);
        bola bola6 = new bola();
        addObject(bola6,511,224);
        bola bola7 = new bola();
        addObject(bola7,580,346);
        bola bola8 = new bola();
        addObject(bola8,646,222);
        bola bola9 = new bola();
        addObject(bola9,722,348);
        bola bola10 = new bola();
        addObject(bola10,104,228);
        bola bola11 = new bola();
        addObject(bola11,656,432);
        bola bola12 = new bola();
        addObject(bola12,518,426);
        bola bola13 = new bola();
        addObject(bola13,379,424);
        bola bola14 = new bola();
        addObject(bola14,253,424);
        bola14.setLocation(257,448);
        bola13.setLocation(403,440);
        bola12.setLocation(534,434);
        bola11.setLocation(659,460);
        bola12.setLocation(538,462);
        bola13.setLocation(406,457);
        bola14.setLocation(255,455);
        pacman pacman = new pacman();
        addObject(pacman,52,296);
        Counter counter = new Counter();
        addObject(counter,51,38);
    }
}
