package org.noobs2d.gero.presentation.android.list.view;

import com.hannesdorfmann.mosby.mvp.lce.MvpLceView;

import org.noobs2d.gero.presentation.android.list.entity.AndroidItem;

/**
 * @author Julious Igmen
 */
public interface AndroidListView extends MvpLceView<AndroidItem> {
    void addToList(AndroidItem androidItem);
    void clearList();
    void showLoadFailPrompt();
}
