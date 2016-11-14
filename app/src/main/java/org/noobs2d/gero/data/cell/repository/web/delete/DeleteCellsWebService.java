package org.noobs2d.gero.data.cell.repository.web.delete;

import io.reactivex.Completable;

/**
 * @author Julious Igmen
 */
public interface DeleteCellsWebService {
    Completable delete(String id);
}
