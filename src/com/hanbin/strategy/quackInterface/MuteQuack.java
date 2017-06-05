package com.hanbin.strategy.quackInterface;

/**
 * Created by ihanbin on 2017. 6. 6..
 * 소리를 못내는 행동
 */
public class MuteQuack implements  QuackBehavior{
    @Override
    public void quack() {
        System.out.println("sound not thing");
    }
}
