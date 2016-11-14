package org.noobs2d.gero.data.android.repository.web.create;

import org.noobs2d.gero.data.android.entity.Android;

import io.reactivex.Observable;

/**
 * @author Julious Igmen
 */
public interface CreateAndroidsWebService {
    Observable<Android> create(Android android);
}
