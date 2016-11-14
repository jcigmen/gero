package org.noobs2d.gero.presentation.android.update.view;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * @author Julious Igmen
 */
public interface UpdateAndroidView extends MvpView {
    void showFailPrompt();
    void showUpdatePrompt();
}
