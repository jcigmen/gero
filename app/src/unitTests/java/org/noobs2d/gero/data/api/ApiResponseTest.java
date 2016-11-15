package org.noobs2d.gero.data.api;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * @author Julious Igmen
 */
public class ApiResponseTest {

    private ApiResponse apiResponse;

    @Before
    public void setUp() {
        apiResponse = new ApiResponse();
    }

    @Test
    public void isSuccessful() throws Exception {
        apiResponse.message = "Non-empty and non-null message";
        apiResponse.status = ApiResponse.STATUS_OK;
        assertTrue(apiResponse.isSuccessful());
    }

    @Test
    public void isSuccessfulNullMessageInvalidStatusCode() {
        apiResponse.message = null;
        assertFalse(apiResponse.isSuccessful());
    }

    @Test
    public void isSuccessfulMessageEmptyInvalidStatusCode() {
        apiResponse.message = "";
        assertFalse(apiResponse.isSuccessful());
    }

    @Test
    public void isSuccessfulMessageNonEmptyInvalidStatusCode() {
        apiResponse.message = "These violent delights have violent ends.";
        assertFalse(apiResponse.isSuccessful());
    }

    @Test
    public void isSuccessfulValidMessageInvalidStatusCode() {
        apiResponse.message = "Arnold.";
        apiResponse.status = 404;
        assertFalse(apiResponse.isSuccessful());
    }

    @Test
    public void isSuccessfulStatusCodeValidMessageInvalid() {
        apiResponse.status = ApiResponse.STATUS_OK;
        assertFalse(apiResponse.isSuccessful());
    }

    @Test
    public void isSuccessfulStatusCodeValidMessageEmpty() {
        apiResponse.message = "";
        apiResponse.status = ApiResponse.STATUS_OK;
        assertFalse(apiResponse.isSuccessful());
    }
}