/*
 * OsduR1Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class GetResourceResponseBuilder {
    //the instance to build
    private GetResourceResponse getResourceResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetResourceResponseBuilder() {
        getResourceResponse = new GetResourceResponse();
    }

    public GetResourceResponseBuilder unprocessedSRNs(List<String> unprocessedSRNs) {
        getResourceResponse.setUnprocessedSRNs(unprocessedSRNs);
        return this;
    }

    public GetResourceResponseBuilder result(List<GetResourceObject> result) {
        getResourceResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetResourceResponse build() {
        return getResourceResponse;
    }
}