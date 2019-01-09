package com.dagger.daggertest2;

import android.app.Application;

import com.dagger.daggertest2.Util.ActivityComponent;
import com.dagger.daggertest2.Util.App.ContextModule;
import com.dagger.daggertest2.Util.App.DaggerAppComponent;
import com.dagger.daggertest2.Util.DaggerActivityComponent;

/**
 * by ckckck 2019/1/9
 * <p>
 * life is short , bugs are too many!
 */
public class APP extends Application {


    private static ActivityComponent activityComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        activityComponent = DaggerActivityComponent
                .builder()
                .appComponent(
                        DaggerAppComponent
                                .builder()
                                .contextModule(new ContextModule(this))
                                .build()
                )
                .build();
    }

    public static ActivityComponent getActivityComponent() {
        return activityComponent;
    }
}
