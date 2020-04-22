package AnimalRescue;

public class Dog {


    private String name;
    private int age;
    private String color;
    private String race;
    private int chipNr;
    private float weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
