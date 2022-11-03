package Sweetnnes;

abstract public class Sweetness {
    private double weight;
    private double percentageOfSugar;

    public Sweetness(double weight, double percentageOfSugar) {
        this.weight = weight;
        this.percentageOfSugar = percentageOfSugar;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPercentageOfSugar() {
        return percentageOfSugar;
    }

    public void setPercentageOfSugar(double percentageOfSugar) {
        this.percentageOfSugar = percentageOfSugar;
    }
}
