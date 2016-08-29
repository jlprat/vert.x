package io.vertx.core.json;

/**
 * @author jpra
 *         copyright (c) 2003-2016 GameDuell GmbH, All Rights Reserved
 */
public interface JsonData {

    /**
     * Checks if the JSON object or array is empty
     *
     * @return true if zero, false otherwise
     */
    boolean isEmpty();

    /**
     * Get the number of entries in this JSON object or array
     *
     * @return the number of items
     */
    int size();

    /**
     * Encode this JSON object or array prettily as a string.
     *
     * @return the string encoding.
     */
    String encodePrettily();

    /**
     * Encode this JSON object or array as a string.
     *
     * @return the string encoding.
     */
    String encode();

}
