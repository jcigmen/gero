package org.noobs2d.gero.presentation.cell.update.view;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * @author Julious Igmen
 */
public interface UpdateCellView extends MvpView {
    void showDeleteFailPrompt();
    void showDeleteSuccessPrompt();
    void showUpdateFailPrompt();
    void showUpdateSuccessPrompt();
}
