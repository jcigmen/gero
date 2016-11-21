package org.noobs2d.gero.framework;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.noobs2d.gero.data.android.entity.AndroidTypeAdapterFactory;

import dagger.Module;
import dagger.Provides;

/**
 * Provides utility classes that shouldn't have to be provided by other modules.
 *
 * @author Julious Igmen
 */
@Module
public class UtilityModule {

    @Provides
    static Gson provideGson() {
        return new GsonBuilder().registerTypeAdapterFactory(AndroidTypeAdapterFactory.create())
                                .create();
    }
}
