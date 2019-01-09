package com.dagger.daggertest2.Util.App;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * by ckckck 2019/1/9
 * <p>
 * life is short , bugs are too many!
 */
@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface UserScope {
}
