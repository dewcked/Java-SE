package com.dewcked.DiceGameModule;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigorous Test :-)
     */
    public void testDie()
    {
    	Die die = new Die();
        assertTrue( die.getFaceValue() == 0 );
        die.roll();
        
        int face = die.getFaceValue();
        assertTrue( face == 1 ||
        			face == 2 ||
        			face == 3 ||
        			face == 4 ||
        			face == 5 ||
        			face == 6);
        
    }
    public void testDiceGame()
    {
    	DiceGame dicegame = new DiceGame();
    	int dicenum = dicegame.GetDiceNum();
    	assertTrue( dicenum > 1);
    	dicegame.play();
    }
}
