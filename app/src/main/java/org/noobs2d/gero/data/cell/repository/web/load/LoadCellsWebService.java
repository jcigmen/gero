package org.noobs2d.gero.data.cell.repository.web.load;

import org.noobs2d.gero.data.cell.entity.Cell;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author Julious Igmen
 */
public interface LoadCellsWebService {
    Observable<List<Cell>> load();
    Observable<Cell> load(String id);
}
