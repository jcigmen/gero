package org.noobs2d.gero.data.api.android;

import org.noobs2d.gero.data.api.ApiResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

/**
 * @author Julious Igmen
 */
public interface AndroidsRetrofitWebService {

    String ENDPOINT = "android";

    @DELETE(ENDPOINT)
    Observable<ApiResponse> delete(@Query("id") String id);

    @GET(ENDPOINT)
    Observable<GetAndroidsResponse> get();

    @GET(ENDPOINT)
    Observable<GetAndroidByIdResponse> get(@Query("id") String id);

    @POST(ENDPOINT)
    Observable<PostAndroidResponse> post(@Body AndroidFacade androidFacade);

    @PUT(ENDPOINT)
    Observable<ApiResponse> put(@Body AndroidFacade androidFacade);
}
