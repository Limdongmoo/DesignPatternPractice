package strategypattern;

import strategypattern.behavior.fly.FlyRocketPowered;
import strategypattern.duckmodel.Duck;
import strategypattern.duckmodel.MallardDuck;
import strategypattern.duckmodel.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
