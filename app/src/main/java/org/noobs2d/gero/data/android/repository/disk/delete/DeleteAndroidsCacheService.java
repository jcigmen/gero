package org.noobs2d.gero.data.android.repository.disk.delete;

import io.reactivex.Completable;

/**
 * @author Julious Igmen
 */
public interface DeleteAndroidsCacheService {
    Completable delete(String id);
}
