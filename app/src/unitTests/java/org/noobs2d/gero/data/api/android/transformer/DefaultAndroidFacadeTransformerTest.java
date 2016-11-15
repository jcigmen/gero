package org.noobs2d.gero.data.api.android.transformer;

import org.junit.Before;
import org.junit.Test;
import org.noobs2d.gero.data.android.entity.Android;
import org.noobs2d.gero.data.api.android.AndroidFacade;

import java.util.List;


import static junit.framework.Assert.assertEquals;

/**
 * @author Julious Igmen
 */
public class DefaultAndroidFacadeTransformerTest {

    private static final AndroidFacade ANDROID_FACADE;

    private DefaultAndroidFacadeTransformer defaultAndroidFacadeTransformer;

    @Before
    public void setUp() {
        defaultAndroidFacadeTransformer = new DefaultAndroidFacadeTransformer();
    }

    @Test
    public void transform() {
        assertThatTransformedProperly(ANDROID_FACADE,
                defaultAndroidFacadeTransformer.transform(ANDROID_FACADE).blockingGet());
    }

    private void assertThatTransformedProperly(AndroidFacade facade, Android android) {
        assertEquals(facade.avatarUrl, android.avatarUrl());
        assertEquals(facade.biography, android.biography());
        assertEquals(facade.id, android.id());
        assertEquals(facade.largeImageUrl, android.largeImageUrl());
        assertEquals(facade.name, android.name());
    }

    /**
     * @see DefaultAndroidFacadeTransformer#transform(AndroidFacade...)
     */
    @Test
    public void transformArray() {
        AndroidFacade[] facades = new AndroidFacade[]{ANDROID_FACADE};

        List<Android> androids = defaultAndroidFacadeTransformer.transform(facades).blockingGet();

        assertEquals(facades.length, androids.size());

        for (int i = 0; i < facades.length; i++) assertThatTransformedProperly(facades[i], androids.get(i));
    }

    static {
        ANDROID_FACADE = new AndroidFacade();
        ANDROID_FACADE.avatarUrl = "/image/avatar.png";
        ANDROID_FACADE.biography = "Does bullshit stuff";
        ANDROID_FACADE.createDate = System.currentTimeMillis();
        ANDROID_FACADE.id = "1";
        ANDROID_FACADE.largeImageUrl = "/image/large_image.png";
        ANDROID_FACADE.name = "Facade Android";
        ANDROID_FACADE.updateDate = ANDROID_FACADE.createDate + 1000;
    }
}