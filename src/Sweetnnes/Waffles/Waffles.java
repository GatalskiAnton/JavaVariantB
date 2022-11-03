package Sweetnnes.Waffles;

import Sweetnnes.Sweetness;

public class Waffles extends Sweetness {
    private WafflesShape shape;
    private WafflesFilling filling;
    private WafflesType type;

    public Waffles(double weight, double percentageOfSugar, WafflesShape shape, WafflesFilling filling, WafflesType type) {
        super(weight, percentageOfSugar);
        this.shape = shape;
        this.filling = filling;
        this.type = type;
    }
}

