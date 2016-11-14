package org.noobs2d.gero.data.android.repository.web.update;

import org.noobs2d.gero.data.android.entity.Android;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;

/**
 * @author Julious Igmen
 */
public interface UpdateAndroidsWebService {
    Completable update(Android android);
}
