package com.dagger.daggertest2.Util.main;


import android.content.Context;

import com.dagger.daggertest2.MainActivity;
import com.dagger.daggertest2.Util.App.AppContext;
import com.dagger.daggertest2.Util.App.UserScope;
import com.dagger.daggertest2.Util.Presents.MainPresent;

import javax.inject.Singleton;

import dagger.Subcomponent;

/**
 * by ckckck 2019/1/9
 * <p>
 * life is short , bugs are too many!
 */
@Singleton
@Subcomponent(modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity activity);

    MainPresent get();

    @Subcomponent.Builder
    interface Builder {
        MainComponent build();
    }
}
