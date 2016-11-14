package org.noobs2d.gero.data.android.repository.web.delete;

import io.reactivex.Completable;

/**
 * @author Julious Igmen
 */
public interface DeleteAndroidsWebService {
    Completable delete(String id);
}
