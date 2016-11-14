package org.noobs2d.gero.presentation.android.detail.view;

import com.hannesdorfmann.mosby.mvp.MvpView;

import org.noobs2d.gero.data.android.entity.Android;

/**
 * @author Julious Igmen
 */
public interface AndroidDetailsView extends MvpView {
    void show(Android android);
}
