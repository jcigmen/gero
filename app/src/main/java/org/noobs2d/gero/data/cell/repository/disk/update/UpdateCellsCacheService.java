package org.noobs2d.gero.data.cell.repository.disk.update;

import org.noobs2d.gero.data.cell.entity.Cell;

import io.reactivex.Completable;

/**
 * @author Julious Igmen
 */
public interface UpdateCellsCacheService {
    Completable update(Cell cell);
}
