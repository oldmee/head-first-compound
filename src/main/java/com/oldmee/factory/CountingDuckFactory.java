package com.oldmee.factory;

import com.oldmee.action.Quackable;
import com.oldmee.duck.DuckCall;
import com.oldmee.duck.MallardDuck;
import com.oldmee.duck.RedheadDuck;
import com.oldmee.duck.RubberDuck;
import com.oldmee.pattern.QuackCounter;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 10:45 2019/1/14
 */
public class CountingDuckFactory extends AbstractDuckFactory {

    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
