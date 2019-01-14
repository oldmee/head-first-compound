package com.oldmee.observable;


/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:59 2019/1/14
 */
public class Quackologist implements Observer {
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
