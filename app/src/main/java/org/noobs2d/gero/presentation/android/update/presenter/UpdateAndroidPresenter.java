package org.noobs2d.gero.presentation.android.update.presenter;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;

import org.noobs2d.gero.data.android.entity.Android;
import org.noobs2d.gero.presentation.android.update.view.UpdateAndroidView;

/**
 * @author Julious Igmen
 */
public interface UpdateAndroidPresenter extends MvpPresenter<UpdateAndroidView> {
    void update(Android android);
}
