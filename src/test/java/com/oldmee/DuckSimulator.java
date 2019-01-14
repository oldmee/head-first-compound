package com.oldmee;

import com.oldmee.action.Quackable;
import com.oldmee.compound.Flock;
import com.oldmee.duck.DuckCall;
import com.oldmee.duck.MallardDuck;
import com.oldmee.duck.RedheadDuck;
import com.oldmee.duck.RubberDuck;
import com.oldmee.factory.AbstractDuckFactory;
import com.oldmee.factory.CountingDuckFactory;
import com.oldmee.goose.Goose;
import com.oldmee.observable.Quackologist;
import com.oldmee.pattern.GooseAdapter;
import com.oldmee.pattern.QuackCounter;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 10:02 2019/1/14
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);

    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(gooseAdapter);

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();
        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println(QuackCounter.getNumberOfQuacks());
    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }
}
