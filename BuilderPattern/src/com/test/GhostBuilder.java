package com.test;

/**
 * 魔鬼角色建造器：具体建造者
 */
public class GhostBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("魔鬼");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("秃头");
    }
}
