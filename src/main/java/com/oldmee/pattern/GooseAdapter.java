package com.oldmee.pattern;

import com.oldmee.action.Quackable;
import com.oldmee.goose.Goose;
import com.oldmee.observable.Observable;
import com.oldmee.observable.Observer;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 10:10 2019/1/14
 */
public class GooseAdapter implements Quackable {
    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    public void quack() {
        goose.honk();
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
