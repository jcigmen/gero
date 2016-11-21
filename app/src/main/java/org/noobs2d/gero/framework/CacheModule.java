package org.noobs2d.gero.framework;

import com.google.gson.Gson;

import org.noobs2d.gero.data.android.repository.disk.AndroidListRxPreferenceAdapter;
import org.noobs2d.gero.data.android.repository.disk.AndroidRxPreferenceAdapter;

import dagger.Module;
import dagger.Provides;

/**
 * @author Julious Igmen
 */
@Module
public class CacheModule {

    @Provides
    static AndroidRxPreferenceAdapter provideAndroidRxPreferenceAdapter(Gson gson) {
        return new AndroidRxPreferenceAdapter(gson);
    }

    @Provides
    static AndroidListRxPreferenceAdapter provideAndroidListRxPreferenceAdapter(Gson gson) {
        return new AndroidListRxPreferenceAdapter(gson);
    }
}
