package org.noobs2d.gero.presentation.android.list.entity.transformer;

import org.noobs2d.gero.data.android.entity.Android;
import org.noobs2d.gero.presentation.android.list.entity.AndroidItem;

/**
 * @author Julious Igmen
 */
public interface AndroidItemTransformer {
    AndroidItem transform(Android android);
}
