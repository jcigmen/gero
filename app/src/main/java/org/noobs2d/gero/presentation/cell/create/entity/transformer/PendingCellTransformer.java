package org.noobs2d.gero.presentation.cell.create.entity.transformer;

import org.noobs2d.gero.data.cell.entity.Cell;
import org.noobs2d.gero.presentation.cell.create.entity.PendingCell;

/**
 * @author Julious Igmen
 */
public interface PendingCellTransformer {
    Cell transform(PendingCell pendingCell);
}
