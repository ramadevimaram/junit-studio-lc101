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
//    @Test
//    public void assertEqualExample(){
//        assertEquals(false,BalancedBrackets.hasBalancedBrackets("]someString[]"));
//    }
    @Test
    public void returnSpecificString(){
        assertSame(BalancedBrackets.hasBalancedBrackets("[]"), true);
    }
    @Test
    public void notNullExample(){
        assertNotNull(BalancedBrackets.hasBalancedBrackets("]someString[]"));
    }

//    The string may contain non-bracket characters as well.
//            *
//            * These strings have balanced brackets:
//            *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
//            *
//            * While these do not:
//            *   "[LaunchCode", "Launch]Code[", "[", "]["
//            *
    @Test
    public void nonBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void bracketsProperlyReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Rama]"));
    }
    @Test
    public void assertEqualMiddleBracketReturnTrue(){
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void startingBracketReturnTrue(){
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void justStartingBracketReturnFalse(){
        assertEquals(false,BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
//    @Test
//    public void bracketsNotArrangeProperlyReturnFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
//    }
    @Test
    public void justOneBracketsRetrunFalse(){
        assertEquals(false,BalancedBrackets.hasBalancedBrackets("["));
    }
//    @Test
//    public void justTwoReverseBracketsReturnFalse(){
//        assertEquals(false,BalancedBrackets.hasBalancedBrackets("]["));
//    }
}
