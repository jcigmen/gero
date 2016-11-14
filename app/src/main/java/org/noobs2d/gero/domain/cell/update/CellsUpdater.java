package org.noobs2d.gero.domain.cell.update;

import org.noobs2d.gero.data.cell.entity.Cell;

import io.reactivex.Completable;

/**
 * @author Julious Igmen
 */
public interface CellsUpdater {
    Completable update(Cell cell);
}
