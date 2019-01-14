package com.oldmee.observable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:24 2019/1/14
 */
public class Observable implements QuackObservable {
    public static ArrayList<Observer> observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer :
                observers) {
            observer.update(duck);
        }
    }
}
