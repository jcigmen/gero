package org.noobs2d.gero.data.api.android.transformer;

import org.noobs2d.gero.data.android.entity.Android;
import org.noobs2d.gero.data.api.android.AndroidFacade;

import java.util.List;

import io.reactivex.Single;

/**
 * @author Julious Igmen
 */
public interface AndroidFacadeTransformer {
    Single<Android> transform(AndroidFacade androidFacade);
    Single<List<Android>> transform(AndroidFacade... androidFacades);
}
