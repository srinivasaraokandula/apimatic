/*
 * OsduR1Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class InlineResponse200 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4968321961730598L;
    private String sRN;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SRN")
    public String getSRN ( ) { 
        return this.sRN;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SRN")
    public void setSRN (String value) { 
        this.sRN = value;
    }
 
}
