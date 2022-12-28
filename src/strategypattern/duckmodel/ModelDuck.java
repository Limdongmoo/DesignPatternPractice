package strategypattern.duckmodel;

import strategypattern.behavior.fly.FlyNoWay;
import strategypattern.behavior.quack.MuteQuack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형오리 입니다!");
    }
}
