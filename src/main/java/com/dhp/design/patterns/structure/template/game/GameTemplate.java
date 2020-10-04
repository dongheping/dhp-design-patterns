package com.dhp.design.patterns.structure.template.game;

public abstract class GameTemplate {

    public final void playGame(){
        //初始化游戏
        initialize();
        //开始游戏
        start();
        //结束游戏
        gameOver();
    }

    protected abstract void gameOver();

    protected abstract void start();

    protected abstract void initialize();
}
