package org.noobs2d.gero.presentation.android.create.view;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * @author Julious Igmen
 */
public interface CreateAndroidView extends MvpView {
    void showSuccessPrompt();
    void showFailPrompt();
}
