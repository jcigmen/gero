package org.noobs2d.gero.domain.android.load;

import org.noobs2d.gero.data.android.entity.Android;
import org.noobs2d.gero.data.android.repository.web.load.LoadAndroidsWebService;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author Julious Igmen
 */
public class DefaultAndroidsLoader
    implements AndroidsLoader {

    LoadAndroidsWebService webService;

    public DefaultAndroidsLoader(LoadAndroidsWebService webService) {
        this.webService = webService;
    }

    @Override
    public Observable<List<Android>> loadFromServer() {
        return webService.load();
    }
}
