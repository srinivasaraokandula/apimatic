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
public class SMDSWorkflowPayload 
        implements java.io.Serializable {
    private static final long serialVersionUID = 3295732955601222352L;
    private String resourceTypeID;
    private String manifest;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ResourceTypeID")
    public String getResourceTypeID ( ) { 
        return this.resourceTypeID;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ResourceTypeID")
    public void setResourceTypeID (String value) { 
        this.resourceTypeID = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Manifest")
    public String getManifest ( ) { 
        return this.manifest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Manifest")
    public void setManifest (String value) { 
        this.manifest = value;
    }
 
}
