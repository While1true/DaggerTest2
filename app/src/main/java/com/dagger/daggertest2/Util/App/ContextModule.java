package com.dagger.daggertest2.Util.App;

import android.app.Application;
import android.content.Context;

import com.dagger.daggertest2.Util.App.AppContext;

import dagger.Module;
import dagger.Provides;

/**
 * by ckckck 2019/1/9
 * <p>
 * life is short , bugs are too many!
 */
@Module
public class ContextModule {
    Context context;
    public ContextModule(Application context){
        this.context=context;
    }
    @Provides
    @AppContext
    Context AppContext(){
        return context;
    }
}
