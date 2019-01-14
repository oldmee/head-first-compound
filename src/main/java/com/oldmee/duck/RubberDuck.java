package com.oldmee.duck;

import com.oldmee.action.Quackable;
import com.oldmee.observable.Observable;
import com.oldmee.observable.Observer;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 9:59 2019/1/14
 */
public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
