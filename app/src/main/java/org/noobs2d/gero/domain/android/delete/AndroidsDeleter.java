package org.noobs2d.gero.domain.android.delete;

import org.noobs2d.gero.data.android.entity.Android;

import io.reactivex.Completable;

/**
 * @author Julious Igmen
 */
public interface AndroidsDeleter {
    Completable delete(Android android);
    Completable deleteById(String androidId);
}
