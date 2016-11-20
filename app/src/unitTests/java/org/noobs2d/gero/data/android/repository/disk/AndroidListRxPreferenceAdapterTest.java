package org.noobs2d.gero.data.android.repository.disk;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.noobs2d.gero.BuildConfig;
import org.noobs2d.gero.data.android.entity.Android;
import org.noobs2d.gero.data.android.entity.AndroidTypeAdapterFactory;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import java.util.ArrayList;
import java.util.List;


import static junit.framework.Assert.assertEquals;
import static org.noobs2d.gero.data.UnitTestData.ANDROID;

/**
 * @author Julious Igmen
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class AndroidListRxPreferenceAdapterTest {

    private AndroidListRxPreferenceAdapter androidListRxPreferenceAdapter;
    private Gson gson;
    private SharedPreferences sharedPreferences;

    @Before
    public void setUp() {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(
                RuntimeEnvironment.application.getApplicationContext()
        );

        gson = new GsonBuilder()
                .registerTypeAdapterFactory(AndroidTypeAdapterFactory.create())
                .create();

        androidListRxPreferenceAdapter = new AndroidListRxPreferenceAdapter(gson);
    }

    @After
    public void tearDown() {
        sharedPreferences.edit().clear().apply();
    }

    @Test
    public void get() {
        List<Android> androids = new ArrayList<>();
        androids.add(ANDROID);

        sharedPreferences
                .edit()
                .putString("androids", gson.toJson(androids))
                .apply();

        assertEquals(
                androids,
                androidListRxPreferenceAdapter.get("androids", sharedPreferences)
        );
    }

    @SuppressLint("CommitPrefEdits") // for the sharedPreferences.edit() without .apply()
    @Test
    public void set() {
        List<Android> androids = new ArrayList<>();
        androids.add(ANDROID);

        androidListRxPreferenceAdapter.set("androids", androids, sharedPreferences.edit());

        assertEquals(
                androids,
                androidListRxPreferenceAdapter.get("androids", sharedPreferences)
        );
    }
}