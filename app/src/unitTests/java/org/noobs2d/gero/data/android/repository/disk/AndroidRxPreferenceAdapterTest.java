package org.noobs2d.gero.data.android.repository.disk;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.noobs2d.gero.BuildConfig;
import org.noobs2d.gero.data.android.entity.AndroidTypeAdapterFactory;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;


import static junit.framework.Assert.assertEquals;
import static org.noobs2d.gero.data.UnitTestData.ANDROID;

/**
 * @author Julious Igmen
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class AndroidRxPreferenceAdapterTest {

    private AndroidRxPreferenceAdapter androidRxPreferenceAdapter;
    private Gson gson;
    private SharedPreferences sharedPreferences;

    @Before
    public void setUp() throws Exception {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(
            RuntimeEnvironment.application.getApplicationContext()
        );

        gson = new GsonBuilder()
            .registerTypeAdapterFactory(AndroidTypeAdapterFactory.create())
            .create();

        androidRxPreferenceAdapter = new AndroidRxPreferenceAdapter(gson);
    }

    @Test
    public void get() throws Exception {
        String key = "android";

        sharedPreferences.edit()
            .putString(key, gson.toJson(ANDROID))
            .apply();

        assertEquals(
            ANDROID,
            androidRxPreferenceAdapter.get(key, sharedPreferences));
    }

    @SuppressLint("CommitPrefEdits") // for the sharedPreferences.edit() without .apply()
    @Test
    public void set() throws Exception {
        String key = "android";
        androidRxPreferenceAdapter.set(key, ANDROID, sharedPreferences.edit());

        assertEquals(
            ANDROID,
            androidRxPreferenceAdapter.get(key, sharedPreferences));
    }

}