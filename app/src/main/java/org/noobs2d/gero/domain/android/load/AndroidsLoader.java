package org.noobs2d.gero.domain.android.load;

import org.noobs2d.gero.data.android.entity.Android;

import io.reactivex.Observable;

/**
 * @author Julious Igmen
 */
public interface AndroidsLoader {
    /**
     * Loads the {@link Android}s from the fastest source.
     * @return an {@link Observable} that emits {@link Android}s
     */
    Observable<Android> load();

    Observable<Android> loadById(String androidId);

    /**
     * @return an {@link Observable} that emits {@link Android}s from a server source.
     */
    Observable<Android> loadFromServer();
}
