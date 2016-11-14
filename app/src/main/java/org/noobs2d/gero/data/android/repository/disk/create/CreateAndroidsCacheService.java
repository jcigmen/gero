package org.noobs2d.gero.data.android.repository.disk.create;

import org.noobs2d.gero.data.android.entity.Android;

import io.reactivex.Completable;

/**
 * @author Julious Igmen
 */
public interface CreateAndroidsCacheService {
    Completable create(Android android);
}
