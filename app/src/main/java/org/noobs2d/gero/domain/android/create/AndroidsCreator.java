package org.noobs2d.gero.domain.android.create;

import org.noobs2d.gero.data.android.entity.Android;

import io.reactivex.Observable;

/**
 * @author Julious Igmen
 */
public interface AndroidsCreator {
    /**
     * @return an {@link Observable} that emits the created {@link Android}
     */
    Observable<Android> create(Android android);
}
