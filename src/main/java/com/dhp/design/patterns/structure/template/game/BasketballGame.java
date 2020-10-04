package com.dhp.design.patterns.structure.template.game;

public class BasketballGame extends GameTemplate{

    @Override
    protected void gameOver() {
        System.out.println("篮球游戏结束");
    }

    @Override
    protected void start() {
        System.out.println("篮球游戏开始");
    }

    @Override
    protected void initialize() {
        System.out.println("初始化篮球游戏");
    }
}
