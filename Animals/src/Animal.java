public class Animal {
    public String environment;
    private String name;
    private int age;
    private int temperature;

    private final int upperLimit = 109;
    private final int lowerLimit = 97;

    public Animal() {}

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getTemperature(){return temperature;}

    public int getUpperLimit() {return upperLimit;}
    public int getLowerLimit() {return lowerLimit;}


    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setTemperature(int temp){this.temperature = temp;}
    public String getEnvironment() { return environment; }

    public void setEnvironment(String environment) { this.environment = environment; }
}
