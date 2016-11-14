package org.noobs2d.gero.domain.cell.delete;

import org.noobs2d.gero.data.cell.entity.Cell;

import io.reactivex.Completable;

/**
 * @author Julious Igmen
 */
public interface CellsDeleter {
    Completable delete(Cell cell);
}
