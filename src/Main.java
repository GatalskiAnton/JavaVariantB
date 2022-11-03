import Sweetnnes.Candy.*;
import Sweetnnes.Cookie.*;
import Sweetnnes.Lolipop.*;
import Sweetnnes.Waffles.*;
import Sweetnnes.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Lolipop l1 = new Lolipop(15.4, 25,  LolipopShape.TREE, LolipopWrapper.PAPER );
        Candy c1 = new Candy(7.3, 43, CandyFilling.BERRIES, CandyWrapper.PLASTIC);
        Cookie ck1 = new Cookie(10.3, 37, CookieShape.ROUND, CookieFilling.CARAMEL);
        Waffles w1 = new Waffles(25, 24, WafflesShape.ROUND, WafflesFilling.CHOCOLATE, WafflesType.VIENNESE);

        Set<Sweetness> sweets = new HashSet<>();
        sweets.add(l1);
        sweets.add(c1);
        sweets.add(ck1);
        sweets.add(w1);

        Present present = new Present(sweets);

    }
}
