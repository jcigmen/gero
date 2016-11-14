package org.noobs2d.gero.presentation.android.detail.presenter;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;

import org.noobs2d.gero.presentation.android.detail.view.AndroidDetailsView;

/**
 * @author Julious Igmen
 */
public interface AndroidDetailsPresenter extends MvpPresenter<AndroidDetailsView> {
    void loadDetails(String androidId);
}
