package org.noobs2d.gero.presentation.cell.list.view;

import com.hannesdorfmann.mosby.mvp.lce.MvpLceView;

import org.noobs2d.gero.presentation.cell.list.entity.CellItem;

/**
 * @author Julious Igmen
 */
public interface CellListView extends MvpLceView<CellItem> {
    void addToList(CellItem cellItem);
    void clearList();
    void showLoadFailPrompt();
}
