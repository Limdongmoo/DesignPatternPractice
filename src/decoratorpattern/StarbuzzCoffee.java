package decoratorpattern;

import decoratorpattern.beverage.Beverage;
import decoratorpattern.beverage.DarkRoast;
import decoratorpattern.beverage.Espresso;
import decoratorpattern.beverage.HouseBlend;
import decoratorpattern.decorator.Mocha;
import decoratorpattern.decorator.Soy;
import decoratorpattern.decorator.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());
        System.out.println("========================================");

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());
        System.out.println("========================================");

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
        System.out.println("========================================");

        beverage2 = new HouseBlend();
        beverage2 = new Whip(new Soy(new Mocha(beverage2)));
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());

    }
}
