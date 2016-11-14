package org.noobs2d.gero.data.android.repository.disk.update;

import org.noobs2d.gero.data.android.entity.Android;

import io.reactivex.Completable;

/**
 * @author Julious Igmen
 */
public interface UpdateAndroidsCacheService {
    Completable update(Android android);
}
