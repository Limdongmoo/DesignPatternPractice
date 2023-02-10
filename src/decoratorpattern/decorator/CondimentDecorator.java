package decoratorpattern.decorator;

import decoratorpattern.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
