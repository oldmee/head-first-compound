package com.oldmee.factory;

import com.oldmee.action.Quackable;
import com.oldmee.duck.DuckCall;
import com.oldmee.duck.MallardDuck;
import com.oldmee.duck.RedheadDuck;
import com.oldmee.duck.RubberDuck;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 10:43 2019/1/14
 */
public class DuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    public Quackable createDuckCall() {
        return new DuckCall();
    }

    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
