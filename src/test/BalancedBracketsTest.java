package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void consecutiveSetsOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void onlyBracketsWithContentReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]"));
    }

    @Test
    public void consecutiveSetsOfBracketsWithContentReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test][test]"));
    }

    @Test
    public void nestedBracketsWithContentReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[test]]"));
    }

    @Test
    public void singleUnclosedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleUnclosedBracketWithContentReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test"));
    }

    @Test
    public void balancedBracketsPlusStrayExtraReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void balancedBracketsPlusStrayExtraWithContentReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test][test"));
    }

    @Test
    public void reversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void reversedBracketsWithContentReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]test["));
    }

    @Test
    public void consecutiveSetsOfReversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }

    @Test
    public void consecutiveSetsOfReversedBracketsWithContentReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]test[]test["));
    }

    @Test
    public void nestedReversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][["));
    }

    @Test
    public void nestedReversedBracketsWithContentReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]test[["));
    }

    @Test
    public void noBracketsAtAllReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("test"));
    }


}