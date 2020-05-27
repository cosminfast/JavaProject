package AnimalRescue;

public abstract class Animal {

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


    public abstract void eat() ;

    public abstract void run();

    public abstract void sleep() ;

    public abstract void speak();
}
