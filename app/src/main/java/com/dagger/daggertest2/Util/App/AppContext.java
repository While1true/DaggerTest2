package com.dagger.daggertest2.Util.App;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * by ckckck 2019/1/9
 * <p>
 * life is short , bugs are too many!
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface AppContext {
}
