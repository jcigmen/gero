package org.noobs2d.gero.data.api;

import com.google.gson.annotations.SerializedName;

/**
 * @author Julious Igmen
 */
public abstract class ApiResponse {
    @SerializedName("message") String message;
    @SerializedName("status") int status;
}
