public class Cookie extends Bake {
    private CookieShape shape;
    private CookieFilling filling;

    public Cookie(double weight, double percentageOfSugar, CookieShape shape, CookieFilling filling) {
        super(weight, percentageOfSugar);
        this.shape = shape;
        this.filling = filling;
    }

}

enum CookieShape {
    ROUND,
    SQUARE,
    TRIANGULAR
}

enum CookieFilling {
    CHOCOLATE,
    CARAMEL,
    BERRIES
}
