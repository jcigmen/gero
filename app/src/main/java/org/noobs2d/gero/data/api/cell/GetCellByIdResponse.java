package org.noobs2d.gero.data.api.cell;

import com.google.gson.annotations.SerializedName;

import org.noobs2d.gero.data.api.ApiResponse;

/**
 * @author Julious Igmen
 */
public class GetCellByIdResponse extends ApiResponse {
    @SerializedName("cell") CellFacade cell;
}
