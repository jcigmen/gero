package org.noobs2d.gero.data.api.android;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the structure of an Android on the webservice.
 *
 * @author Julious Igmen
 */
public class AndroidFacade {
    @SerializedName("age") int age;
    @SerializedName("avatar") String avatarUrl;
    @SerializedName("biography") String biography;
    @SerializedName("create_date") long createDate;
    @SerializedName("id") String id;
    @SerializedName("name") String name;
    @SerializedName("picture_large") String largeImageUrl;
    @SerializedName("update_date") long updateDate;
}