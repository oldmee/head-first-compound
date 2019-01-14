package com.oldmee.factory;

import com.oldmee.action.Quackable;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 10:41 2019/1/14
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createRubberDuck();
}
