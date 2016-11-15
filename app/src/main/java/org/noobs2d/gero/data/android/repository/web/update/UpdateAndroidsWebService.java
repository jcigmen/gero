package org.noobs2d.gero.data.android.repository.web.update;

import org.noobs2d.gero.data.android.entity.Android;

import io.reactivex.Completable;

/**
 * @author Julious Igmen
 */
public interface UpdateAndroidsWebService {
    Completable update(Android android);
}
