package com.vdabmao2018.lessen.les11;

import org.junit.Test;
import org.junit.Assert;

public class TestFraction {

    @Test
    public void correctSimplify(){
        Fraction a = new Fraction(1,4);
        a.simplify().printFraction();

        Assert.assertTrue(a.simplify().noemer<= a.noemer && a.simplify().teller <= a.teller);

    }

    @Test
    public void testSimplifyBy3(){
        Fraction a = new Fraction(5, 45);
        Fraction b = a.simplify();

        Assert.assertEquals(b.teller, 1);
        Assert.assertEquals(b.noemer, 9);

        //Assert.assertTrue(a.simplify().noemer<= a.noemer && a.simplify().teller <= a.teller);
    }

    @Test
    public void testAddFraction() {
        Fraction a = new Fraction(5, 13);
        Fraction b = new Fraction(6, 3);

        Fraction c = a.addFraction(b);

        c.printFraction();

        Assert.assertEquals(31, c.teller);
        Assert.assertEquals(13, c.noemer);

    }

     @Test
     public void testSubtractFraction(){
         Fraction a = new Fraction(5,13);
         Fraction b = new Fraction(6,3);

         Fraction c = a.subtractFraction(b);

         c.printFraction();

        }







    }





