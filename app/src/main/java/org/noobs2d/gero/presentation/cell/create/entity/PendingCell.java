package org.noobs2d.gero.presentation.cell.create.entity;

import android.support.annotation.NonNull;

import com.google.auto.value.AutoValue;

/**
 * A Cell without ID that is about to be created.
 *
 * @author Julious Igmen
 */
@AutoValue
public abstract class PendingCell {

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
        abstract PendingCell build();
        abstract Builder setAvatarUrl(String avatarUrl);
        abstract Builder setBiography(String biography);
        abstract Builder setForm(String form);
        abstract Builder setLargeImageUrl(String largeImageUrl);
        abstract Builder setName(String name);
    }

    static Builder builder() {
        return new AutoValue_PendingCell.Builder();
    }

    @NonNull
    public abstract String avatarUrl();

    @NonNull
    public abstract String biography();

    @NonNull
    public abstract String form();
    
    @NonNull abstract String largeImageUrl();

    @NonNull
    public abstract String name();
}
