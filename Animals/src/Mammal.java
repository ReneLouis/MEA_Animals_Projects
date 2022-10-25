public class Mammal extends warmBloodedAnimal {

    private String environment;

    public Mammal(String environment) {
        this.environment = environment;
    }


    public String getEnvironment() { return environment; }
    public void setEnvironment(String environment) { this.environment = environment; }
}
