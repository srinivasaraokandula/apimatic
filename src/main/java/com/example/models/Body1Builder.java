/*
 * OsduR1Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class Body1Builder {
    //the instance to build
    private Body1 body1;

    /**
     * Default constructor to initialize the instance
     */
    public Body1Builder() {
        body1 = new Body1();
    }

    public Body1Builder sRN(String sRN) {
        body1.setSRN(sRN);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body1 build() {
        return body1;
    }
}