package Sweetnnes.Lolipop;

import Sweetnnes.Sweetness;

public class Lolipop extends Sweetness {

    private LolipopShape shape;
    private LolipopWrapper wrapper;

    public Lolipop(double weight, double percentageOfSugar, LolipopShape shape, LolipopWrapper wrapper) {
        super(weight, percentageOfSugar);
        this.shape = shape;
        this.wrapper = wrapper;
    }
}

