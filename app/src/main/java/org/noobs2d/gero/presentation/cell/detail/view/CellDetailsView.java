package org.noobs2d.gero.presentation.cell.detail.view;

import com.hannesdorfmann.mosby.mvp.MvpView;

import org.noobs2d.gero.data.cell.entity.Cell;

/**
 * @author Julious Igmen
 */
public interface CellDetailsView extends MvpView {
    void show(Cell cell);
}
