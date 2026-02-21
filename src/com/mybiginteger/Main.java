/**
 *  Java program to demonstrate BigInteger class.
 */

package com.mybiginteger;

import java.math.BigInteger;

/**
 *  Main class.
 */
public class Main {

    // Main method to start java program.
    public static void main(String[] args) {

        // Creating BigInteger variable.
        BigInteger a = new BigInteger("123");

        // Printing value of a to console.
        System.out.println(a); // Output: 123

        // Converting BigInteger variable to int.
        int b = a.intValue();

        // Printing value of b to console.
        System.out.println(b); // Output: 123

        // Converting BigInteger variable to long.
        long c = a.longValue();

        // Printing value of c to console.
        System.out.println(c); // Output: 123

        // Converting BigInteger variable to double.
        double d = a.doubleValue();

        // Printing value of d to console.
        System.out.println(d); // Output: 123.0

        // Converting BigInteger variable to float.
        float f = a.floatValue();

        // Printing value of f to console.
        System.out.println(f); // Output: 123.0

    }
}