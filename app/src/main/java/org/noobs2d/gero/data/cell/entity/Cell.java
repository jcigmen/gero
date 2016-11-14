package org.noobs2d.gero.data.cell.entity;

import android.support.annotation.NonNull;

import com.google.auto.value.AutoValue;


/**
 * @author Julious Igmen
 */
@AutoValue
public abstract class Cell {

    public static final class Forms {
        public static final String ADULT = "adult";
        public static final String LARVA = "larva";
        public static final String PERFECT = "perfect";
        public static final String POWER_WEIGHTED_PERFECT = "power_weighted_perfect";
        public static final String SEMI_PERFECT = "semi_perfect";
        public static final String SUPER_PERFECT = "super_perfect";
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Cell build();
        abstract Builder setAvatarUrl(String avatarUrl);
        abstract Builder setBiography(String biography);
        abstract Builder setForm(String form);
        abstract Builder setId(String id);
        abstract Builder setLargeImageUrl(String largeImageUrl);
        abstract Builder setName(String name);
    }

    static Builder builder() {
        return new AutoValue_Cell.Builder();
    }

    @NonNull
    public abstract String avatarUrl();

    @NonNull
    public abstract String biography();

    @NonNull
    public abstract String form();

    @NonNull
    public abstract String id();

    @NonNull abstract String largeImageUrl();

    @NonNull
    public abstract String name();
}
