/*
 * OsduR1Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class GetResourceObjectBuilder {
    //the instance to build
    private GetResourceObject getResourceObject;

    /**
     * Default constructor to initialize the instance
     */
    public GetResourceObjectBuilder() {
        getResourceObject = new GetResourceObject();
    }

    public GetResourceObjectBuilder sRN(String sRN) {
        getResourceObject.setSRN(sRN);
        return this;
    }

    public GetResourceObjectBuilder data(Object data) {
        getResourceObject.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetResourceObject build() {
        return getResourceObject;
    }
}