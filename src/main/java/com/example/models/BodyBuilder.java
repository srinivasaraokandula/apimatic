/*
 * OsduR1Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class BodyBuilder {
    //the instance to build
    private Body body;

    /**
     * Default constructor to initialize the instance
     */
    public BodyBuilder() {
        body = new Body();
    }

    public BodyBuilder sRN(String sRN) {
        body.setSRN(sRN);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body build() {
        return body;
    }
}