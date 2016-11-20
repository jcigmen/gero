package org.noobs2d.gero.data;

import org.noobs2d.gero.data.android.entity.Android;

/**
 * @author Julious Igmen
 */
public class UnitTestData {

    public static final Android ANDROID;

    static {
        ANDROID = Android.builder()
                .setAvatarUrl("/path/image.jpg")
                .setBiography("Just a regular android")
                .setId("1000")
                .setLargeImageUrl("/path/image_large.jpg")
                .setName("Android X")
                .build();
    }
}
