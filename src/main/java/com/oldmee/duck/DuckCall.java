package com.oldmee.duck;

import com.oldmee.action.Quackable;
import com.oldmee.observable.Observable;
import com.oldmee.observable.Observer;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 9:58 2019/1/14
 */
public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "DuckCall";
    }
}
