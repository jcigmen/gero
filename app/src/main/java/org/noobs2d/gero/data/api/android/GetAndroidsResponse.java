package org.noobs2d.gero.data.api.android;

import com.google.gson.annotations.SerializedName;

import org.noobs2d.gero.data.api.ApiResponse;

/**
 * @author Julious Igmen
 */
public class GetAndroidsResponse extends ApiResponse {
    @SerializedName("items") public AndroidFacade[] items;
    @SerializedName("count") int count;
}
