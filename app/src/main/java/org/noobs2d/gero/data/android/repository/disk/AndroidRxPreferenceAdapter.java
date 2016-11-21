package org.noobs2d.gero.data.android.repository.disk;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import com.f2prateek.rx.preferences.Preference;
import com.google.gson.Gson;

import org.noobs2d.gero.data.android.entity.Android;

/**
 * @author Julious Igmen
 */
public class AndroidRxPreferenceAdapter implements Preference.Adapter<Android> {

    private Gson gson;

    public AndroidRxPreferenceAdapter(Gson gson) {
        this.gson = gson;
    }

    @Override
    public Android get(@NonNull String key, @NonNull SharedPreferences preferences) {
        return gson.fromJson(preferences.getString(key, ""), Android.class);
    }

    @Override
    public void set(@NonNull String key,
                    @NonNull Android value,
                    @NonNull SharedPreferences.Editor editor) {
        editor.putString(key, gson.toJson(value))
              .apply();
    }
}
