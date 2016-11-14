package org.noobs2d.gero.data.android.repository.web.load;

import org.noobs2d.gero.data.android.entity.Android;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author Julious Igmen
 */
public interface LoadAndroidsWebService {
    Observable<List<Android>> load();
    Observable<Android> load(String id);
}
