package com.oldmee.action;

import com.oldmee.observable.QuackObservable;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 9:55 2019/1/14
 */
public interface Quackable extends QuackObservable {
    void quack();
}
