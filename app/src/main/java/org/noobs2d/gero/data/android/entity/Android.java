package org.noobs2d.gero.data.android.entity;

import android.support.annotation.NonNull;

import com.google.auto.value.AutoValue;

/**
 * @author Julious Igmen
 */
@AutoValue
public abstract class Android {

    @AutoValue.Builder
    abstract static class Builder {
        abstract Android build();
        abstract Builder setAge(int age);
        abstract Builder setAvatarUrl(String avatarUrl);
        abstract Builder setBiography(String biography);
        abstract Builder setId(String id);
        abstract Builder setLargeImageUrl(String largeImageUrl);
        abstract Builder setName(String name);
    }

    static Builder builder() {
        return new AutoValue_Android.Builder();
    }

    public abstract int age();

    @NonNull
    public abstract String avatarUrl();

    @NonNull
    public abstract String biography();

    @NonNull
    public abstract String id();

    @NonNull abstract String largeImageUrl();

    @NonNull
    public abstract String name();
}
