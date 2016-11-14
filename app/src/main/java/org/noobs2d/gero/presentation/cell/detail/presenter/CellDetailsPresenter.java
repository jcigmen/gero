package org.noobs2d.gero.presentation.cell.detail.presenter;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * @author Julious Igmen
 */
public interface CellDetailsPresenter extends MvpPresenter<MvpView> {
    void loadCellDetails(String cellId);
}
