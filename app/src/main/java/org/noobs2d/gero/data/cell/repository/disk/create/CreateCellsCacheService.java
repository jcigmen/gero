package org.noobs2d.gero.data.cell.repository.disk.create;

import org.noobs2d.gero.data.cell.entity.Cell;

import io.reactivex.Completable;

/**
 * @author Julious Igmen
 */
public interface CreateCellsCacheService {
    Completable create(Cell cell);
}
