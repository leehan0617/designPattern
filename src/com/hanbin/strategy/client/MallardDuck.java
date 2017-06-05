package com.hanbin.strategy.client;

import com.hanbin.strategy.client.Duck;
import com.hanbin.strategy.flyInterface.FlyWithWings;
import com.hanbin.strategy.quackInterface.Squeak;

/**
 * Created by ihanbin on 2017. 6. 6..
 * duck 중에서 MallardDuck
 */
public class MallardDuck extends Duck {

    public MallardDuck () {
        System.out.println("MallardDuck Created");
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Squeak());
    }
    @Override
    public void display() {
        System.out.println("MallardDuck Display");
    }
}
