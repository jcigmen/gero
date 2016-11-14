package org.noobs2d.gero.domain.cell.create;

import org.noobs2d.gero.data.cell.entity.Cell;

import io.reactivex.Observable;

/**
 * @author Julious Igmen
 */
public interface CellsCreator {
    Observable<Cell> create(Cell cell);
}
