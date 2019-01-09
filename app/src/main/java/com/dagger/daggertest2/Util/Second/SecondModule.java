package com.dagger.daggertest2.Util.Second;

import android.content.Context;

import com.dagger.daggertest2.Util.App.AppContext;
import com.dagger.daggertest2.Util.Presents.MainPresent;
import com.dagger.daggertest2.Util.Presents.SecondPresent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * by ckckck 2019/1/9
 * <p>
 * life is short , bugs are too many!
 */
@Module
public class SecondModule {
    @Singleton
    @Provides
    SecondPresent getPresent(@AppContext Context context) {
        return new SecondPresent();
    }
}
