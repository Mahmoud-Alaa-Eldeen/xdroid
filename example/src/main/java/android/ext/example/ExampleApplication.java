package android.ext.example;

import android.ext.adapter.ViewBinderInflater;
import android.ext.app.ApplicationExt;
import android.ext.core.Global;

public class ExampleApplication extends ApplicationExt {
    @Override
    public void onCreate() {
        super.onCreate();

        Global.putSingleton(ExampleSingleton.class, new ExampleSingleton(this, R.string.app_name));
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();

        ViewBinderInflater.getInstance().clearCache();
    }
}
