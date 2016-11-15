package org.noobs2d.gero.data.api.android;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the structure of an Android on the webservice.
 *
 * @author Julious Igmen
 */
public class AndroidFacade {
    @SerializedName("avatar") public String avatarUrl;
    @SerializedName("biography") public String biography;
    @SerializedName("create_date") public long createDate;
    @SerializedName("id") public String id;
    @SerializedName("name") public String name;
    @SerializedName("picture_large") public String largeImageUrl;
    @SerializedName("update_date") public long updateDate;
}