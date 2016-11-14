package org.noobs2d.gero.data.api.android;

import org.noobs2d.gero.data.api.ApiResponse;

import io.reactivex.Observable;
import retrofit2.Call;
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
    Observable<Call<ApiResponse>> delete(@Query("id") String id);

    @GET(ENDPOINT)
    Observable<Call<GetAndroidsResponse>> get();

    @GET(ENDPOINT)
    Observable<Call<GetAndroidByIdResponse>> get(@Query("id") String id);

    @POST(ENDPOINT)
    Observable<Call<PostAndroidResponse>> post(@Body AndroidFacade androidFacade);

    @PUT(ENDPOINT)
    Observable<Call<ApiResponse>> put(@Body AndroidFacade androidFacade);
}
