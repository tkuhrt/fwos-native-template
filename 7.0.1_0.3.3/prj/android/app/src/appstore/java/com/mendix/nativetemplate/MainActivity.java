package com.mendix.nativetemplate;

import android.os.Build;
import android.os.Bundle;

import android.system.ErrnoException;
import android.system.Os;
import java.io.File;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;

import com.mendix.mendixnative.activity.MendixReactActivity;
import com.mendix.mendixnative.config.AppUrl;
import com.mendix.mendixnative.react.MendixApp;
import com.mendix.mendixnative.react.MxConfiguration;

public class MainActivity extends MendixReactActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        this.getLifecycle().addObserver(new MendixActivityObserver(this));
        boolean hasDeveloperSupport = ((MainApplication) getApplication()).getUseDeveloperSupport();
        mendixApp = new MendixApp(AppUrl.getUrlFromResource(this), MxConfiguration.WarningsFilter.none, hasDeveloperSupport, false);
        super.onCreate(savedInstanceState);
        try {
            Os.setenv("EXTERNAL_STORAGE", getExternalFilesDir(null).getAbsolutePath(), true);
            System.loadLibrary("indy");
        } catch (ErrnoException e) {
            e.printStackTrace();
        }
        // Checks the current theme and apply the correct style (Backwards compatible)
        boolean isDarkMode;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            isDarkMode = getResources().getConfiguration().isNightModeActive();
        } else {
            isDarkMode = AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES;
        }
        setTheme(isDarkMode ? R.style.AppTheme : R.style.AppTheme_Dark);
    }
}
