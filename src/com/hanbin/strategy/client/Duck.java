package com.hanbin.strategy.client;

import com.hanbin.strategy.flyInterface.FlyBehavior;
import com.hanbin.strategy.quackInterface.QuackBehavior;

/**
 * Created by ihanbin on 2017. 6. 6..
 * 오리에 관한 상위 추상 클래스
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("common attribute");
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
