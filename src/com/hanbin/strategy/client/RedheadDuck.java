package com.hanbin.strategy.client;

import com.hanbin.strategy.client.Duck;
import com.hanbin.strategy.flyInterface.FlyNoWay;
import com.hanbin.strategy.flyInterface.FlyWithWings;
import com.hanbin.strategy.quackInterface.MuteQuack;

/**
 * Created by ihanbin on 2017. 6. 6..
 * Duck중에서 RedheadDuck
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        System.out.println("RedheadDuck Created");
        setQuackBehavior(new MuteQuack());
        setFlyBehavior(new FlyNoWay());
    }
    @Override
    public void display() {
        System.out.println("RedheadDuck Display");
    }
}
