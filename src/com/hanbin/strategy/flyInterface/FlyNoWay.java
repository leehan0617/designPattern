package com.hanbin.strategy.flyInterface;

/**
 * Created by ihanbin on 2017. 6. 6..
 * 날 수 없는 행동
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Don't Fly Bird");
    }
}
