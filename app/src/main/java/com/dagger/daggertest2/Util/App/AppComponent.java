package com.dagger.daggertest2.Util.App;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import javax.inject.Singleton;

import dagger.Component;

/**
 * by ckckck 2019/1/9
 * <p>
 * life is short , bugs are too many!
 */
@Singleton
@Component(modules = {SharePrefenceModule.class,ToastModule.class,ContextModule.class})
public interface AppComponent {
    @AppContext
    Context getContext();

    SharedPreferences getShare();

    Toast getToast();
}
