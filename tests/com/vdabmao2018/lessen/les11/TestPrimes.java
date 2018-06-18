package com.vdabmao2018.lessen.les11;

import org.junit.Assert;
import org.junit.Test;

public class TestPrimes {

    // public static void main(String[] args) {


    //        boolean out = Primes.isPrime(7);
//        if(out != true){
//            System.out.println("FOUT");
//        }else{
//            System.out.println("OK");
//        }
//
//        out = Primes.isPrime(6);
//        if(out != false){
//            System.out.println("FOUT");
//        }else{
//            System.out.println("OK");
//        }
//
//        out = Primes.isPrime(0);
//        if(out != false){
//            System.out.println("FOUT");
//        }else{
//            System.out.println("OK");
//        }
//      }
//
    @Test //annotation
    public void primeNumberReturnsTrueIfValueIsPrime() {                     //lange naam om later makkelijk herkenbaar te maken
        boolean out = Primes.isPrime(7);
        Assert.assertTrue(out);

    }

    @Test
    public void primeNumberReturnsTrueIfValueIsNotPrime() {
        boolean out = Primes.isPrime(6);
        Assert.assertFalse(out);
    }

    @Test
    public void OneIsNotAPrime() {
        boolean out = Primes.isPrime(0);
        Assert.assertFalse(out);
    }


    @Test
    public void NegativeNumbersAreNotPrimes() {
        boolean out = Primes.isPrime(-97);
        Assert.assertFalse(out);
    }
}
