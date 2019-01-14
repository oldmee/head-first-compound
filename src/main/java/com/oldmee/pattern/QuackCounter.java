package com.oldmee.pattern;

import com.oldmee.action.Quackable;
import com.oldmee.observable.Observable;
import com.oldmee.observable.Observer;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 10:24 2019/1/14
 */
public class QuackCounter implements Quackable {
    private Quackable quackable;
    private static int numberOfQuacks;
    Observable observable;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
        observable = new Observable(this);
    }

    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
