package AnimalRescue;

public class Cat extends Animal{


    private int chipNr;


    public int getChipNr() {
        return chipNr;
    }

    public void setChipNr(int chipNr) {
        this.chipNr = chipNr;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private float weight;




    public void eat() {
        System.out.println("Eating..");
    }

    public void run() {
        System.out.println("running..");
    }

    public void sleep() {
        System.out.println("ZzzZZzz..");
    }
}
