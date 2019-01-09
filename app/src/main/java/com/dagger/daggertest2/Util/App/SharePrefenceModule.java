package com.dagger.daggertest2.Util.App;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * by ckckck 2019/1/9
 * <p>
 * life is short , bugs are too many!
 */
@Module
public class SharePrefenceModule {
    @Provides
    @Singleton
    SharedPreferences getSharePreference(@AppContext Context context){
        return context.getSharedPreferences("xx",Context.MODE_PRIVATE);
    }
}
