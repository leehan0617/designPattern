package com.hanbin.strategy.flyInterface;

/**
 * Created by ihanbin on 2017. 6. 6..
 * 날 수 있는 행동
 */
public class FlyWithWings implements FlyBehavior {

    public void fly() {
        System.out.println("Fly Bird");
    }
}
