package org.noobs2d.gero.presentation.cell.list.presenter;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;

import org.noobs2d.gero.presentation.cell.list.view.CellListView;

/**
 * @author Julious Igmen
 */
public interface CellListPresenter extends MvpPresenter<CellListView> {
    void loadCellItems();
}
