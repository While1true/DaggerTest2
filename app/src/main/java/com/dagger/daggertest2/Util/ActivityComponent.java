package com.dagger.daggertest2.Util;

import com.dagger.daggertest2.Util.App.AppComponent;
import com.dagger.daggertest2.Util.App.UserScope;
import com.dagger.daggertest2.Util.Second.SecondComponent;
import com.dagger.daggertest2.Util.main.MainComponent;

import dagger.Component;

/**
 * by ckckck 2019/1/9
 * <p>
 * life is short , bugs are too many!
 */
@UserScope
@Component(/*modules = {ActivityModule.class},*/dependencies = AppComponent.class)
public interface ActivityComponent {
//    MainComponent.Builder getMain();
//    SecondComponent.Builder getSecond();
    MainComponent getMain();
    SecondComponent getSecond();
}
