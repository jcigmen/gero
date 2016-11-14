package org.noobs2d.gero.domain.android.update;

import org.noobs2d.gero.data.android.entity.Android;

import io.reactivex.Completable;

/**
 * @author Julious Igmen
 */
public interface AndroidsUpdater {
    Completable update(Android android);
}
