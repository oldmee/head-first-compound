package com.oldmee.compound;

import com.oldmee.action.Quackable;
import com.oldmee.observable.Observable;
import com.oldmee.observable.Observer;

import java.util.ArrayList;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 11:16 2019/1/14
 */
public class Flock implements Quackable {
    ArrayList<Quackable> arrayList = new ArrayList<Quackable>();
    Observable observable;

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quackable) {
        arrayList.add(quackable);
    }

    public void quack() {
        for (Quackable quackable : arrayList) {
            quackable.quack();
        }
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
