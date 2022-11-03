import Sweetnnes.*;

import java.util.ArrayList;
import java.util.Comparator;

public class Present {
    ArrayList<Sweetness> sweets;

    public Present(ArrayList<Sweetness> sweets) {
        this.sweets = sweets;
    }

    public void sort(Comparator<Sweetness> comparator) {
        sweets = new ArrayList<>(sweets.stream().sorted(comparator).toList());
    }

    public ArrayList<Sweetness> getSweetsWithPercentageOfSugar(double leftBorder, double rightBorder) {
        ArrayList<Sweetness> sweetsWithPercentageOfSugar = new ArrayList<>();
        for (Sweetness sweet : sweets) {
            if (sweet.getPercentageOfSugar() > leftBorder && sweet.getPercentageOfSugar() < rightBorder)
                sweetsWithPercentageOfSugar.add(sweet);
        }
        return sweetsWithPercentageOfSugar;
    }

    @Override
    public String toString() {
        return sweets.toString();
    }
}
