package org.noobs2d.gero.domain.android.load;

import org.noobs2d.gero.data.android.entity.Android;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author Julious Igmen
 */
public interface AndroidsLoader {

    /**
     * @return an {@link Observable} that emits {@link Android}s from a server source.
     */
    Observable<List<Android>> loadFromServer();
}
