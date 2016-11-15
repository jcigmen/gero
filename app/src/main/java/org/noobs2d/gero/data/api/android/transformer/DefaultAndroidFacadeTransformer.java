package org.noobs2d.gero.data.api.android.transformer;

import org.noobs2d.gero.data.android.entity.Android;
import org.noobs2d.gero.data.api.android.AndroidFacade;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Single;

/**
 * @author Julious Igmen
 */

public class DefaultAndroidFacadeTransformer implements AndroidFacadeTransformer {

    @Override
    public Single<Android> transform(AndroidFacade androidFacade) {
        return Single.fromCallable(() -> toAndroid(androidFacade));
    }

    @Override
    public Single<List<Android>> transform(AndroidFacade... androidFacades) {
        return Single.fromCallable(
            () -> {
                List<Android> androids = new ArrayList<>();
                for (AndroidFacade facade : androidFacades) {
                    androids.add(toAndroid(facade));
                }
                return androids;
            }
        );
    }

    private Android toAndroid(AndroidFacade androidFacade) {
        return Android
            .builder()
            .setAvatarUrl(androidFacade.avatarUrl)
            .setBiography(androidFacade.biography)
            .setId(androidFacade.id)
            .setLargeImageUrl(androidFacade.largeImageUrl)
            .setName(androidFacade.name)
            .build();
    }
}
