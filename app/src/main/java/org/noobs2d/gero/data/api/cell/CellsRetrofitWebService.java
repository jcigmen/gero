package org.noobs2d.gero.data.api.cell;

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
public interface CellsRetrofitWebService {

    String ENDPOINT = "cell";

    @DELETE(ENDPOINT)
    Observable<Call<ApiResponse>> delete(@Query("id") String id);

    @GET(ENDPOINT)
    Observable<Call<GetCellsResponse>> get();

    @GET(ENDPOINT)
    Observable<Call<GetCellByIdResponse>> get(@Query("id") String id);

    @POST(ENDPOINT)
    Observable<Call<PostCellResponse>> post(@Body CellFacade androidFacade);

    @PUT(ENDPOINT)
    Observable<Call<ApiResponse>> put(@Body CellFacade androidFacade);
}
