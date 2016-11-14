package org.noobs2d.gero.presentation.cell.list.entity.transformer;

import org.noobs2d.gero.data.cell.entity.Cell;
import org.noobs2d.gero.presentation.cell.list.entity.CellItem;

/**
 * @author Julious Igmen
 */
public interface CellItemTransformer {
    CellItem transform(Cell cell);
}
