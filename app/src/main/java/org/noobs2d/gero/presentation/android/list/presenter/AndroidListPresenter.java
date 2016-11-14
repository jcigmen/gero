package org.noobs2d.gero.presentation.android.list.presenter;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;

import org.noobs2d.gero.presentation.android.list.view.AndroidListView;

/**
 * @author Julious Igmen
 */
public interface AndroidListPresenter extends MvpPresenter<AndroidListView> {
    void loadAndroidItems();
}