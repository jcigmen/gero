package org.noobs2d.gero.data.android.repository.disk;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import com.f2prateek.rx.preferences.Preference;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.noobs2d.gero.data.android.entity.Android;

import java.lang.reflect.Type;
import java.util.List;

/**
 * An {@link Preference.Adapter} for a list of {@link Android}s
 *
 * @author Julious Igmen
 */
public class AndroidListRxPreferenceAdapter
        implements Preference.Adapter<List<Android>> {

    private Gson gson;

    public AndroidListRxPreferenceAdapter(Gson gson) {
        this.gson = gson;
    }

    @Override
    public List<Android> get(@NonNull String key, @NonNull SharedPreferences preferences) {
        // uses Reflection in order to accurately infer the type
        Type type = new TypeToken<List<Android>>(){}.getType();
        return gson.fromJson(preferences.getString(key, ""), type);
    }

    @Override
    public void set(@NonNull String key,
                    @NonNull List<Android> value,
                    @NonNull SharedPreferences.Editor editor) {
        editor.putString(key, gson.toJson(value)).apply();
    }
}
