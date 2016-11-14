package org.noobs2d.gero.data.cell.repository.disk.delete;

import io.reactivex.Completable;

/**
 * @author Julious Igmen
 */
public interface DeleteCellsCacheService {
    Completable delete(String id);
}
