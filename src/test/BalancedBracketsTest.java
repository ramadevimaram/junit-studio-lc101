package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    /*//TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    */
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void oddBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]someString[]"));
    }
    @Test
    public void assertEqualExample(){
        assertEquals(false,BalancedBrackets.hasBalancedBrackets("]someString[]"));
    }
    @Test
    public void returnSpecificString(){
        assertSame(BalancedBrackets.hasBalancedBrackets("[]"), true);
    }
    @Test
    public void notNullExample(){
        assertNotNull(BalancedBrackets.hasBalancedBrackets("]someString[]"));
    }
}
