package AnimalRescue;

public class Animal {

    private String name;
    private int age;
    private String color;
    private String race;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
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

    public void speak(){
        System.out.println("sunete");
    }

}
