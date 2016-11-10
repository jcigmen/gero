package org.noobs2d.gero.framework;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import org.noobs2d.gero.BuildConfig;

/**
 * @author Julious Igmen
 */
public class GeroApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) initialiseDebugTools();
    }

    protected void initialiseDebugTools() {
        initialiseLeakCanary();
    }

    protected void initialiseLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) return;
        LeakCanary.install(this);
    }
}
