package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketWithTextInMiddle() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));

    }

    @Test
    public void bracketsStartInTheMiddleOfText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));

    }

    @Test
    public void bracketsFollowedByText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void openBracketFollowedByTextNoClose() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void openBracketNoClose() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void closeBracketOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));

    }
    @Test
    public void nestedBrackets() {
        assertTrue((BalancedBrackets.hasBalancedBrackets("[[]]")));
    }
    @Test
    public void deepNEstedBrackets() {
        assertTrue((BalancedBrackets.hasBalancedBrackets("[[[ []]]]")));

    }
    @Test
    public void justTextNoBrackets() {
        assertTrue((BalancedBrackets.hasBalancedBrackets("yes this is text")));

    }
    @Test
    public void bracketParenthesesBracket() {
        assertTrue((BalancedBrackets.hasBalancedBrackets("[()]")));

    }

}

