package org.noobs2d.gero.data.android.repository.web.load;

import org.junit.Before;
import org.junit.Test;
import org.noobs2d.gero.data.api.ApiRequestFailedException;
import org.noobs2d.gero.data.api.android.AndroidFacade;
import org.noobs2d.gero.data.api.android.AndroidsRetrofitWebService;
import org.noobs2d.gero.data.api.android.GetAndroidByIdResponse;
import org.noobs2d.gero.data.api.android.GetAndroidsResponse;
import org.noobs2d.gero.data.api.android.SampleAndroidFacade;
import org.noobs2d.gero.data.api.android.transformer.DefaultAndroidFacadeTransformer;

import io.reactivex.Observable;


import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;

/**
 * @author Julious Igmen
 */

public class DefaultLoadAndroidsWebServiceTest {

    private DefaultLoadAndroidsWebService defaultLoadAndroidsWebService;

    @Before
    public void setUp() {
        defaultLoadAndroidsWebService =
                new DefaultLoadAndroidsWebService(
                        new DefaultAndroidFacadeTransformer(),
                        mock(AndroidsRetrofitWebService.class)
                );
    }

    @Test
    public void load() {
        AndroidFacade[] facades = new AndroidFacade[]{new SampleAndroidFacade()};

        GetAndroidsResponse getAndroidResponse = mock(GetAndroidsResponse.class);
        getAndroidResponse.items = facades;

        given(getAndroidResponse.isSuccessful()).willReturn(true);
        given(defaultLoadAndroidsWebService.androidsRetrofitWebService.get())
                .willReturn(Observable.just(getAndroidResponse));

        defaultLoadAndroidsWebService
                .load()
                .subscribe(loadedAndroids -> assertEquals(
                        defaultLoadAndroidsWebService.androidFacadeTransformer
                                .transform(
                                        facades)
                                .blockingGet(),
                        loadedAndroids
                           )
                );
    }

    @Test
    public void loadApiErrorFails() {
        GetAndroidsResponse getAndroidsResponse = mock(GetAndroidsResponse.class);
        given(getAndroidsResponse.isSuccessful()).willReturn(false);
        given(defaultLoadAndroidsWebService.androidsRetrofitWebService.get())
                .willReturn(Observable.just(getAndroidsResponse));

        defaultLoadAndroidsWebService
                .load()
                .subscribe(
                        loadedAndroids -> fail(),
                        error -> {
                            assertThat(
                                    error,
                                    instanceOf(ApiRequestFailedException.class)
                            );
                            assertThat(
                                    "Failed getting android list",
                                    equalTo(error.getMessage())
                            );
                        }
                );
    }

    /**
     * @see DefaultLoadAndroidsWebService#load(String)
     */
    @Test
    public void loadById() {
        AndroidFacade facade = new SampleAndroidFacade();

        GetAndroidByIdResponse getAndroidByIdResponse = mock(GetAndroidByIdResponse.class);
        getAndroidByIdResponse.android = facade;
        given(getAndroidByIdResponse.isSuccessful()).willReturn(true);
        given(defaultLoadAndroidsWebService.androidsRetrofitWebService.get(anyString()))
                .willReturn(Observable.just(getAndroidByIdResponse));

        defaultLoadAndroidsWebService
                .load("")
                .subscribe(loadedAndroid -> assertEquals(
                        defaultLoadAndroidsWebService.androidFacadeTransformer
                                .transform(
                                        facade)
                                .blockingGet(),
                        loadedAndroid
                ));
    }

    /**
     * @see DefaultLoadAndroidsWebService#load(String)
     */
    @Test
    public void loadByIdApiErrorFails() {
        GetAndroidByIdResponse getAndroidByIdResponse = mock(GetAndroidByIdResponse.class);
        given(getAndroidByIdResponse.isSuccessful()).willReturn(false);
        given(defaultLoadAndroidsWebService.androidsRetrofitWebService.get(anyString()))
                .willReturn(Observable.just(getAndroidByIdResponse));

        defaultLoadAndroidsWebService
                .load("")
                .subscribe(
                        loadedAndroid -> fail(),
                        error -> {
                            assertThat(
                                    error,
                                    instanceOf(ApiRequestFailedException.class)
                            );
                            assertThat(
                                    "Failed getting android by ID",
                                    equalTo(error.getMessage())
                            );
                        }
                );
    }
}