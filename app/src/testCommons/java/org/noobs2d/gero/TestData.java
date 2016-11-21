package org.noobs2d.gero;

import org.noobs2d.gero.data.android.entity.Android;

import java.util.Arrays;
import java.util.List;

/**
 * Provides sample data for both unit and android tests.
 *
 * @author Julious Igmen
 */
public class TestData {

    public static Android android(String id) {
        return Android.builder()
                      .setAvatarUrl("")
                      .setLargeImageUrl("")
                      .setBiography("")
                      .setName("")
                      .setId(id)
                      .build();
    }

    public static List<Android> androids() {
        return Arrays.asList(android("1"), android("2"), android("3"));
    }
}
