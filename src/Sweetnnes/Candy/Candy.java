package Sweetnnes.Candy;

import Sweetnnes.Sweetness;

public class Candy extends Sweetness {
    private CandyWrapper wrapper;
    private CandyFilling filling;

    public Candy(double weight, double percentageOfSugar, CandyFilling filling, CandyWrapper wrapper) {
        super(weight, percentageOfSugar);
        this.filling = filling;
        this.wrapper = wrapper;
    }
}

