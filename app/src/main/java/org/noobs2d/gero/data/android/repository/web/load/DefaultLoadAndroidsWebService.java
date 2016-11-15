package org.noobs2d.gero.data.android.repository.web.load;

import org.noobs2d.gero.data.android.entity.Android;
import org.noobs2d.gero.data.api.ApiRequestFailedException;
import org.noobs2d.gero.data.api.android.AndroidsRetrofitWebService;
import org.noobs2d.gero.data.api.android.transformer.AndroidFacadeTransformer;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author Julious Igmen
 */

public class DefaultLoadAndroidsWebService
        implements LoadAndroidsWebService {

    AndroidFacadeTransformer androidFacadeTransformer;
    AndroidsRetrofitWebService androidsRetrofitWebService;

    public DefaultLoadAndroidsWebService(AndroidFacadeTransformer androidFacadeTransformer,
                                         AndroidsRetrofitWebService androidsRetrofitWebService) {
        this.androidFacadeTransformer = androidFacadeTransformer;
        this.androidsRetrofitWebService = androidsRetrofitWebService;
    }

    @Override
    public Observable<List<Android>> load() {
        return androidsRetrofitWebService.get().flatMap(getAndroidsResponse -> {
            if (getAndroidsResponse.isSuccessful())
                return androidFacadeTransformer.transform(getAndroidsResponse.items).toObservable();
            else
                return Observable.error(new ApiRequestFailedException("Failed getting android list"));
        });
    }

    @Override
    public Observable<Android> load(String id) {
        return androidsRetrofitWebService.get(id).flatMap(getAndroidByIdResponse -> {
            if (getAndroidByIdResponse.isSuccessful())
                return androidFacadeTransformer.transform(getAndroidByIdResponse.android).toObservable();
            else
                return Observable.error(new ApiRequestFailedException("Failed getting android by ID"));
        });
    }
}