package org.noobs2d.gero.data.cell.repository.web.create;

import org.noobs2d.gero.data.cell.entity.Cell;

import io.reactivex.Observable;

/**
 * @author Julious Igmen
 */
public interface CreateCellsWebService {
    Observable<Cell> create(Cell cell);
}
