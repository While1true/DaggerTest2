package com.dagger.daggertest2.Util.Second;


import com.dagger.daggertest2.SecondActivity;
import com.dagger.daggertest2.Util.Presents.SecondPresent;

import javax.inject.Singleton;

import dagger.Subcomponent;

/**
 * by ckckck 2019/1/9
 * <p>
 * life is short , bugs are too many!
 */
@Singleton
@Subcomponent(modules = {SecondModule.class})
public interface SecondComponent {
    void inject(SecondActivity activity);

    SecondPresent get();
}
