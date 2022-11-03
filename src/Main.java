import Sweetnnes.Candy.*;
import Sweetnnes.Cookie.*;
import Sweetnnes.Lolipop.*;
import Sweetnnes.Waffles.*;
import Sweetnnes.*;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Lolipop l1 = new Lolipop(15.4, 25, LolipopShape.TREE, LolipopWrapper.PAPER);
        Candy c1 = new Candy(7.3, 43, CandyFilling.BERRIES, CandyWrapper.PLASTIC);
        Cookie ck1 = new Cookie(10.3, 22, CookieShape.ROUND, CookieFilling.CARAMEL);
        Waffles w1 = new Waffles(25, 24, WafflesShape.ROUND, WafflesFilling.CHOCOLATE, WafflesType.VIENNESE);

        ArrayList<Sweetness> sweets = new ArrayList<>();
        sweets.add(l1);
        sweets.add(c1);
        sweets.add(w1);
        sweets.add(ck1);

        Present present = new Present(sweets);
        System.out.println(present);
        present.sort((o1, o2) -> (int) (o1.getWeight() - o2.getWeight()));
        System.out.println(present);
        ArrayList<Sweetness> sweetsWithPercentageOfSugar = present.getSweetsWithPercentageOfSugar(10.0, 25.0);
        System.out.println(sweetsWithPercentageOfSugar);
    }
}
