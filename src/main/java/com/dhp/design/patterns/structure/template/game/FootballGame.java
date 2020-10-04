package com.dhp.design.patterns.structure.template.game;

public class FootballGame extends GameTemplate{

    @Override
    protected void gameOver() {
        System.out.println("足球游戏结束");
    }

    @Override
    protected void start() {
        System.out.println("足球游戏开始");
    }

    @Override
    protected void initialize() {
        System.out.println("初始化足球游戏");
    }
}
