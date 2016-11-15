package org.noobs2d.gero.data.api.android;

/**
 * @author Julious Igmen
 */
public class SampleAndroidFacade
        extends AndroidFacade {

    public SampleAndroidFacade() {
        avatarUrl = "/image/avatar.png";
        biography = "Does bullshit stuff";
        createDate = System.currentTimeMillis();
        id = "1";
        largeImageUrl = "/image/large_image.png";
        name = "Facade Android";
        updateDate = createDate + 1000;
    }
}