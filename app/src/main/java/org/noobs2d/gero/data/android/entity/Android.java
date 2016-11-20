package org.noobs2d.gero.data.android.entity;

import android.support.annotation.NonNull;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/**
 * @author Julious Igmen
 */
@AutoValue
public abstract class Android {

    public static Builder builder() {
        return new AutoValue_Android.Builder();
    }

    @NonNull
    public abstract String avatarUrl();

    @NonNull
    public abstract String biography();

    @NonNull
    public abstract String id();

    @NonNull
    public abstract String largeImageUrl();

    @NonNull
    public abstract String name();

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Android build();

        public abstract Builder setAvatarUrl(String avatarUrl);

        public abstract Builder setBiography(String biography);

        public abstract Builder setId(String id);

        public abstract Builder setLargeImageUrl(String largeImageUrl);

        public abstract Builder setName(String name);
    }

    public static TypeAdapter<Android> typeAdapter(Gson gson) {
        return new AutoValue_Android
                .GsonTypeAdapter(gson);
    }
}
