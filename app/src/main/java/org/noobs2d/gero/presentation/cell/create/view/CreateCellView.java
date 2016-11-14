package org.noobs2d.gero.presentation.cell.create.view;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * @author Julious Igmen
 */
public interface CreateCellView extends MvpView {
    void showFailPrompt();
    void showSuccessPrompt();
}
