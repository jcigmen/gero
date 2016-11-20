package org.noobs2d.gero.data.android.entity;

import com.google.gson.TypeAdapterFactory;
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory;

/**
 * @author Julious Igmen
 */
@GsonTypeAdapterFactory
public abstract class AndroidTypeAdapterFactory
        implements TypeAdapterFactory {

    public static TypeAdapterFactory create() {
        return new AutoValueGson_AndroidTypeAdapterFactory();
    }
}
