package org.noobs2d.gero.presentation.android.create.presenter;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;

import org.noobs2d.gero.presentation.android.create.entity.PendingAndroid;
import org.noobs2d.gero.presentation.android.create.view.CreateAndroidView;

/**
 * @author Julious Igmen
 */
public interface CreateAndroidPresenter extends MvpPresenter<CreateAndroidView> {
    void create(PendingAndroid pendingAndroid);
}
