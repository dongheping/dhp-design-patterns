package com.dhp.design.patterns.structure.template.game;

/**
 * 模板方法（Template Method）模式的定义如下：
 * 定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，
 * 使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。
 * 它是一种类行为型模式。
 */
public class GameTemplateTest {
    public static void main(String[] args) {
        GameTemplate footballGameTemplate = new FootballGame();
        footballGameTemplate.playGame();
        GameTemplate basketballGameTemplate = new BasketballGame();
        basketballGameTemplate.playGame();
    }
}
