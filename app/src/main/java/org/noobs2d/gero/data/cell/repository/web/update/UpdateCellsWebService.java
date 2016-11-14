package org.noobs2d.gero.data.cell.repository.web.update;

import org.noobs2d.gero.data.cell.entity.Cell;

import io.reactivex.Completable;

/**
 * @author Julious Igmen
 */
public interface UpdateCellsWebService {
    Completable update(Cell cell);
}
