package com.vdabmao2018.lessen.les11;

public class Primes{
        public static boolean isPrime(int n) {
            for(int c = 2; c < n; c++) {
                if(n % c == 0) {
                    return false;
                }
            }
            return true;
        }
    }

