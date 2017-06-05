package com.hanbin.strategy.launcher;

import com.hanbin.strategy.client.Duck;
import com.hanbin.strategy.client.MallardDuck;
import com.hanbin.strategy.client.RedheadDuck;

/**
 * Created by ihanbin on 2017. 6. 6..
 * Strategy init class
 */
public class Init {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();

        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performQuack();
        redheadDuck.performFly();
    }
}

