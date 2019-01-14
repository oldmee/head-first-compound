package com.oldmee.observable;


/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:15 2019/1/14
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
