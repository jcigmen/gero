package org.noobs2d.gero.presentation.android.create.entity.transformer;

import org.noobs2d.gero.data.android.entity.Android;
import org.noobs2d.gero.presentation.android.create.entity.PendingAndroid;

/**
 * @author Julious Igmen
 */
public interface PendingAndroidTransformer {
    Android transform(PendingAndroid pendingAndroid);
}
