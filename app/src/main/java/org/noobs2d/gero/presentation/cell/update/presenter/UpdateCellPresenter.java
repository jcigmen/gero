package org.noobs2d.gero.presentation.cell.update.presenter;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;

import org.noobs2d.gero.data.cell.entity.Cell;
import org.noobs2d.gero.presentation.cell.update.view.UpdateCellView;

/**
 * @author Julious Igmen
 */
public interface UpdateCellPresenter extends MvpPresenter<UpdateCellView> {
    void delete(String cellId);
    void update(Cell cell);
}
