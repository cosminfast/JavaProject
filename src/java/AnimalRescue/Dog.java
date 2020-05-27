package AnimalRescue;

public abstract class Dog extends Animal{

    Dog(String name,int age){
        setName(name);
        setAge(age);
    }

    Dog(){

    }


    private int chipNr;
    private float weight;



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


    @Override
    public void eat() {
        System.out.println("eating pedigree");
    }



    @Override
    public void sleep() {
        System.out.println("sleeps and snores");
    }

    @Override
    public void speak() {
        System.out.println("woof!");

    }
}
