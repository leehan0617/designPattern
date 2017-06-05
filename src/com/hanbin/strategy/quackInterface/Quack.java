package com.hanbin.strategy.quackInterface;

/**
 * Created by ihanbin on 2017. 6. 6..
 * quack 소리를 내는 행동
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("sound quack");
    }
}
