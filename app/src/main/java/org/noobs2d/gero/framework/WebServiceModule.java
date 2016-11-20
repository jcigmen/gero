package org.noobs2d.gero.framework;

import org.noobs2d.gero.data.android.repository.web.load.DefaultLoadAndroidsWebService;
import org.noobs2d.gero.data.android.repository.web.load.LoadAndroidsWebService;
import org.noobs2d.gero.data.api.android.AndroidsRetrofitWebService;
import org.noobs2d.gero.data.api.android.transformer.DefaultAndroidFacadeTransformer;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * @author Julious Igmen
 */
@Module
public class WebServiceModule {

    private Retrofit retrofit;

    public WebServiceModule() {
        retrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://demo4848206.mockable.io/")
            .client(new OkHttpClient())
            .build();
    }

    @Provides
    public LoadAndroidsWebService provideLoadAndroidsWebService() {
        return new DefaultLoadAndroidsWebService(
            new DefaultAndroidFacadeTransformer(),
            retrofit.create(AndroidsRetrofitWebService.class)
        );
    }
}
