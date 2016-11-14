package org.noobs2d.gero.presentation.cell.create.presenter;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;

import org.noobs2d.gero.presentation.cell.create.entity.PendingCell;
import org.noobs2d.gero.presentation.cell.create.view.CreateCellView;

/**
 * @author Julious Igmen
 */
public interface CreateCellPresenter extends MvpPresenter<CreateCellView> {
    void create(PendingCell pendingCell);
}
