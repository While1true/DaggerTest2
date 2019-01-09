package com.dagger.daggertest2.Util.App;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * by ckckck 2019/1/9
 * <p>
 * life is short , bugs are too many!
 */
@Module
public class ToastModule {
    @Provides
    @Singleton
    Toast getToast(@AppContext Context context){
        return Toast.makeText(context,"",Toast.LENGTH_SHORT);
    }
}
