package Sweetnnes.Cookie;

import Sweetnnes.Sweetness;

public class Cookie extends Sweetness {
    private CookieShape shape;
    private CookieFilling filling;

    public Cookie(double weight, double percentageOfSugar, CookieShape shape, CookieFilling filling) {
        super(weight, percentageOfSugar);
        this.shape = shape;
        this.filling = filling;
    }
}

