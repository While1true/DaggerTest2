package com.dagger.daggertest2.Util.main;

import android.content.Context;

import com.dagger.daggertest2.Util.App.AppContext;
import com.dagger.daggertest2.Util.App.UserScope;
import com.dagger.daggertest2.Util.Presents.MainPresent;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * by ckckck 2019/1/9
 * <p>
 * life is short , bugs are too many!
 */
@Module
public class MainModule {
    @Singleton
    @Provides
    MainPresent getPresent(@AppContext Context context) {
        return new MainPresent();
    }
}
