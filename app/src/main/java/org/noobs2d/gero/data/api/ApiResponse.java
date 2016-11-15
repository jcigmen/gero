package org.noobs2d.gero.data.api;

import com.google.gson.annotations.SerializedName;

/**
 * @author Julious Igmen
 */
public class ApiResponse {

    static final int STATUS_OK = 200;

    @SerializedName("message") String message;
    @SerializedName("status") int status;

    public boolean isSuccessful() {
        return status == STATUS_OK && message != null && !message.isEmpty();
    }
}
