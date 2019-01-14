package com.oldmee.duck;

import com.oldmee.action.Quackable;
import com.oldmee.observable.Observable;
import com.oldmee.observable.Observer;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 9:57 2019/1/14
 */
public class RedheadDuck implements Quackable {
    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
